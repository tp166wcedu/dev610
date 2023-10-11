package ch18.provided;

import java.util.*;

// Implements a priority queue of integers using a
// min-heap represented as an array.
public class HeapIntPriorityQueue {

    // region provided
    private int[] elementData;
    private int size;

    // Constructs an empty queue.
    public HeapIntPriorityQueue() {
        elementData = new int[10];
        size = 0;
    }

    // Adds the given element to this queue.
    public void add(int value) {
        // resize if necessary
        if (size + 1 >= elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }

        // insert as new rightmost leaf
        elementData[size + 1] = value;

        // "bubble up" toward root as necessary to fix ordering
        int index = size + 1;
        boolean found = false;   // have we found the proper place yet?
        while (!found && hasParent(index)) {
            int parent = parent(index);
            if (elementData[index] < elementData[parent]) {
                swap(elementData, index, parent(index));
                index = parent(index);
            } else {
                found = true;  // found proper location; stop the loop
            }
        }

        size++;
    }

    // Returns true if there are no elements in this queue.
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the minimum value in the queue without modifying the queue.
    // If the queue is empty, throws a NoSuchElementException.
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return elementData[1];
    }

    // Removes and returns the minimum value in the queue.
    // If the queue is empty, throws a NoSuchElementException.
    public int remove() {
        int result = peek();

        // move rightmost leaf to become new root
        elementData[1] = elementData[size];
        size--;

        // "bubble down" root as necessary to fix ordering
        int index = 1;
        boolean found = false;   // have we found the proper place yet?
        while (!found && hasLeftChild(index)) {
            int left = leftChild(index);
            int right = rightChild(index);
            int child = left;
            if (hasRightChild(index) &&
                    elementData[right] < elementData[left]) {
                child = right;
            }

            if (elementData[index] > elementData[child]) {
                swap(elementData, index, child);
                index = child;
            } else {
                found = true;  // found proper location; stop the loop
            }
        }

        return result;
    }

    // Returns the number of elements in the queue.
    public int size() {
        return size;
    }

    // helpers for navigating indexes up/down the tree
    private int parent(int index) {
        return index / 2;
    }

    // returns index of left child of given index
    private int leftChild(int index) {
        return index * 2;
    }

    // returns index of right child of given index
    private int rightChild(int index) {
        return index * 2 + 1;
    }

    // returns true if the node at the given index has a parent (is not the root)
    private boolean hasParent(int index) {
        return index > 1;
    }

    // returns true if the node at the given index has a non-empty left child
    private boolean hasLeftChild(int index) {
        return leftChild(index) <= size;
    }

    // returns true if the node at the given index has a non-empty right child
    private boolean hasRightChild(int index) {
        return rightChild(index) <= size;
    }

    // switches the values at the two given indexes of the given array
    private void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    // endregion

    // region Ex8
    public static void descending(int[] arr) {
        HeapIntPriorityQueue queue = new HeapIntPriorityQueue();
        for (int value : arr) {
            queue.add(value);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = queue.remove();
        }
    }

    // endregion

    // region Ex9
    public static int kthSmallest(HeapIntPriorityQueue queue, int k) {
        if (k <= 0 || k > queue.size()) {
            throw new IllegalArgumentException("Invalid value of k.");
        }
        Stack<Integer> storage = new Stack<>();
        for (int i = 1; i < k; i++) {
            storage.push(queue.remove());
        }
        int kthElement = queue.peek();
        while (!storage.isEmpty()) {
            queue.add(storage.pop());
        }
        return kthElement;
    }
    // endregion

    // region Ex10
    public static boolean isConsecutive(HeapIntPriorityQueue queue) {
        if (queue.isEmpty()) {
            return true;
        }
        Stack<Integer> storage = new Stack<>();
        int prev = queue.remove();
        storage.push(prev);
        while (!queue.isEmpty()) {
            int current = queue.remove();
            storage.push(current);
            if (current != prev + 1) {
                while (!storage.isEmpty()) {
                    queue.add(storage.pop());
                }
                return false;
            }
            prev = current;
        }
        while (!storage.isEmpty()) {
            queue.add(storage.pop());
        }
        return true;
    }

    // endregion

    // region Ex11
    public static void removeDuplicates(HeapIntPriorityQueue queue) {
        HeapIntPriorityQueue tempQueue = new HeapIntPriorityQueue();
        while (!queue.isEmpty()) {
            int current = queue.remove();
            tempQueue.add(current);
            while (!queue.isEmpty() && queue.peek() == current) {
                queue.remove();
            }
        }
        while (!tempQueue.isEmpty()) {
            queue.add(tempQueue.remove());
        }
    }
    // endregion

    // region Ex12
    public static void stutter(HeapIntPriorityQueue queue) {
        HeapIntPriorityQueue tempQueue = new HeapIntPriorityQueue();
        while (!queue.isEmpty()) {
            int current = queue.remove();
            tempQueue.add(current);
            tempQueue.add(current);
        }
        while (!tempQueue.isEmpty()) {
            queue.add(tempQueue.remove());
        }
    }
    // endregion

    // region Ex13
    public static void fillGaps(HeapIntPriorityQueue queue) {
        LinkedList<Integer> tempList = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int current = queue.remove();
            tempList.add(current);
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
        }
        for (int i = min; i <= max; i++) {
            if (!tempList.contains(i)) {
                tempList.add(i);
            }
        }
        for (int value : tempList) {
            queue.add(value);
        }
        tempList.clear();
        while (!queue.isEmpty()) {
            tempList.add(queue.remove());
        }
        for (int value : tempList) {
            queue.add(value);
        }
    }
    // endregion

    // region Ex14
    public int[] toArray() {
        int[] result = new int[size];
        System.arraycopy(elementData, 1, result, 0, size);
        return result;
    }
    // endregion

    // region Ex15
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        if (!isEmpty()) {
            result.append(elementData[1]);
            for (int i = 2; i <= size; i++) {
                result.append(", ").append(elementData[i]);
            }
        }
        return result + "]";
    }
    // endregion

    // region Ex16
    public void merge(HeapIntPriorityQueue other) {
        for (int i = 1; i <= other.size; i++) {
            this.add(other.elementData[i]);
        }
    }
    // endregion
}
