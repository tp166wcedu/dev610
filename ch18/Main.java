package ch18;

import ch18.provided.HeapIntPriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Ex16
        // Test Case 1
        HeapIntPriorityQueue queue1 = new HeapIntPriorityQueue();
        queue1.add(42);
        queue1.add(50);
        queue1.add(45);
        HeapIntPriorityQueue queue2 = new HeapIntPriorityQueue();
        queue2.add(22);
        queue2.add(78);
        queue2.add(61);
        System.out.println("Original Queue 1: " + queue1);
        System.out.println("Original Queue 2: " + queue2);
        queue1.merge(queue2);
        System.out.println("Merged Queue: " + queue1);
        // Check the order of elements after removing
        while (!queue1.isEmpty()) {
            System.out.print(queue1.remove() + " ");
        }
        System.out.println("\nQueue 2 after merge (should be unchanged): " + queue2);

        // Ex15
        // HeapIntPriorityQueue queue = new HeapIntPriorityQueue();
        // queue.add(42);
        // queue.add(50);
        // queue.add(45);
        // queue.add(78);
        // queue.add(61);
        //
        // System.out.println("Queue representation: " + queue);

        // Ex14
        // HeapIntPriorityQueue queue = new HeapIntPriorityQueue();
        // queue.add(42);
        // queue.add(9);
        // queue.add(22);
        // queue.add(17);
        // queue.add(-3);
        // queue.add(81);
        //
        // int[] arrayResult = queue.toArray();
        //
        // System.out.println("Original Queue: " + queue);
        // System.out.print("Array representation: [");
        // for (int i = 0; i < arrayResult.length; i++) {
        //     System.out.print(arrayResult[i]);
        //     if (i < arrayResult.length - 1) {
        //         System.out.print(", ");
        //     }
        // }
        // System.out.println("]");

        // Ex13
        // HeapIntPriorityQueue queue = new HeapIntPriorityQueue();
        // queue.add(1);
        // queue.add(3);
        // queue.add(3);
        // queue.add(6);
        // queue.add(6);
        // queue.add(8);
        //
        // System.out.println("Original Queue: " + queue);
        // fillGaps(queue);
        // System.out.println("Queue after filling gaps:  " + queue);

        // Ex12
        // HeapIntPriorityQueue queue = new HeapIntPriorityQueue();
        // queue.add(7);
        // queue.add(8);
        // queue.add(10);
        // queue.add(45);
        //
        // System.out.println("Original Queue: " + queue);
        // stutter(queue);
        // System.out.println("Queue after stuttering: " + queue);

        // Ex11
        // HeapIntPriorityQueue queue = new HeapIntPriorityQueue();
        // queue.add(7);
        // queue.add(7);
        // queue.add(8);
        // queue.add(8);
        // queue.add(8);
        // queue.add(10);
        // queue.add(45);
        // queue.add(45);
        //
        // System.out.println("Original Queue: " + queue);
        // removeDuplicates(queue);
        // System.out.println("Queue after removing duplicates: " + queue);

        // Ex10
        // HeapIntPriorityQueue queue = new HeapIntPriorityQueue();
        // queue.add(7);
        // queue.add(8);
        // queue.add(9);
        // queue.add(10);
        // queue.add(11);
        //
        // System.out.println("Is the queue consecutive? " + isConsecutive(queue));
        // System.out.println("Queue after operation: " + queue);

        // Ex9
        // HeapIntPriorityQueue queue = new HeapIntPriorityQueue();
        // queue.add(42);
        // queue.add(50);
        // queue.add(45);
        // queue.add(78);
        // queue.add(61);
        //
        // int k = 4;
        // System.out.println("9. The " + k + "th smallest element: " + kthSmallest(queue, k));
        // System.out.println("9. Queue after operation: " + queue);
        //
        // // Ex8
        // int[] arr = {42, 9, 22, 17, -3, 81};
        // System.out.println("8. Original Array: " + Arrays.toString(arr));
        //
        // descending(arr);
        // System.out.println("8. Descending Order Array: " + Arrays.toString(arr));

        // Ex7
        // HashIntSet set = new HashIntSet();
        // set.add(-2);
        // set.add(3);
        // set.add(5);
        // set.add(6);
        // set.add(8);
        // System.out.println("Set: " + set);

        // Ex6
        // HashIntSet set = new HashIntSet();
        // set.add(-2);
        // set.add(3);
        // set.add(5);
        // set.add(6);
        // set.add(8);
        // System.out.println("Set: " + set);
        //
        // int[] array = set.toArray();
        // System.out.println("Array from set: " + Arrays.toString(array));

        // Ex5
        // HashIntSet set1 = new HashIntSet();
        // set1.add(-2);
        // set1.add(3);
        // set1.add(5);
        // set1.add(6);
        // set1.add(8);
        // System.out.println("Initial Set1: " + set1);
        //
        // HashIntSet set2 = new HashIntSet();
        // set2.add(2);
        // set2.add(3);
        // set2.add(6);
        // set2.add(8);
        // set2.add(11);
        // System.out.println("Set2: " + set2);
        //
        // set1.retainAll(set2);
        // System.out.println("Updated Set1 after retainAll: " + set1);

        // Ex4
        // HashIntSet set1 = new HashIntSet();
        // set1.add(-2);
        // set1.add(3);
        // set1.add(5);
        // set1.add(6);
        // set1.add(8);
        // System.out.println("Initial Set1: " + set1);
        //
        // HashIntSet set2 = new HashIntSet();
        // set2.add(2);
        // set2.add(3);
        // set2.add(6);
        // set2.add(8);
        // set2.add(11);
        // System.out.println("Set2: " + set2);
        //
        // set1.removeAll(set2);
        // System.out.println("Updated Set1 after removeAll: " + set1);

        // Ex3
        // HashIntSet set1 = new HashIntSet();
        // set1.add(-2);
        // set1.add(3);
        // set1.add(5);
        // set1.add(6);
        // set1.add(8);
        //
        // HashIntSet set2 = new HashIntSet();
        // set2.add(3);
        // set2.add(6);
        // set2.add(8);
        // set2.add(-2);
        // set2.add(5);
        //
        // HashIntSet set3 = new HashIntSet();
        // set3.add(3);
        // set3.add(6);
        // set3.add(8);
        // set3.add(-2);
        //
        // System.out.println("set1 is equal to set2: " + set1.equals(set2));
        // System.out.println("set1 is equal to set3: " + set1.equals(set3));

        // Ex2
        // HashIntSet set1 = new HashIntSet();
        // set1.add(-2);
        // set1.add(3);
        // set1.add(5);
        // set1.add(6);
        // set1.add(8);
        //
        // HashIntSet set2 = new HashIntSet();
        // set2.add(3);
        // set2.add(6);
        // set2.add(8);
        //
        // HashIntSet set3 = new HashIntSet();
        // set3.add(3);
        // set3.add(6);
        // set3.add(7);  // This value is not in set1
        // set3.add(8);
        //
        // System.out.println("set1 contains all values from set2: " + set1.containsAll(set2));
        // System.out.println("set1 contains all values from set3: " + set1.containsAll(set3));

        // Ex1
        // System.out.println("Ex1.\nHash-based sets (like Java's HashSet and the provided HashIntSet) do not guarantee any specific ordering of their elements. The order of elements in such sets is generally due to the order in which they are hashed and placed in the underlying structure (in this case, the hash table with separate chaining).");
        // HashIntSet set1 = new HashIntSet();
        // set1.add(-5);
        // set1.add(1);
        // set1.add(2);
        // set1.add(3);
        // System.out.println("Initial Set1: " + set1);
        //
        // HashIntSet set2 = new HashIntSet();
        // set2.add(2);
        // set2.add(44);
        // set2.add(3);
        // set2.add(6);
        // set2.add(79);
        // System.out.println("Set2: " + set2);
        //
        // set1.addAll(set2);
        // System.out.println("Updated Set1 after addAll: " + set1);
    }
}
