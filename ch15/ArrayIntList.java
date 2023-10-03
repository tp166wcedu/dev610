package ch15;

// Class ArrayIntList can be used to store a list of integers.

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayIntList {
    private int[] elementData; // list of integers
    private int size; // number of elements in the list

    public static final int DEFAULT_CAPACITY = 100;

    // post: constructs an empty list of default capacity
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    // pre : capacity >= 0 (throws IllegalArgumentException if not)
    // post: constructs an empty list with the given capacity
    public ArrayIntList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        elementData = new int[capacity];
        size = 0;
    }

    // post: returns the current number of elements in the list
    public int size() {
        return size;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return elementData[index];
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    // post : returns the position of the first occurrence of the
    // given value (–1 if not found)
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // pre : size() < capacity (throws IllegalStateException if not)
    // post: appends the given value to the end of the list
    public void add(int value) {
        checkCapacity(size + 1);
        elementData[size] = value;
        size++;
    }

    // pre : size() < capacity && 0 <= index <= size()
    // post: inserts the given value at the given index, shifting
    // subsequent values right
    public void add(int index, int value) {
        for (int i = size; i >= index + 1; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index, shifting
    // subsequent values left
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    public boolean contains(int value) {
        return indexOf(value) >= 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void set(int index, int value) {
        checkIndex(index);
        elementData[index] = value;
    }

    public void clear() {
        size = 0;
    }

    public void addAll(ArrayIntList other) {
        checkCapacity(size + other.size);
        for (int i = 0; i < other.size; i++) {
            add(other.elementData[i]);
        }
    }

    public void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int newCapacity = elementData.length * 2 + 1;
            if (capacity > newCapacity) {
                newCapacity = capacity;
            }
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    // post: returns the position of the last occurrence of the given value, or -1 if not found
    public int lastIndexOf(int value) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // post: returns the starting index of where the given sublist first appears in this list, or -1 if not found
    public int indexOfSubList(ArrayIntList sublist) {
        if (sublist.size() == 0) {
            return -1;
        }
        for (int i = 0; i <= size - sublist.size(); i++) {
            boolean found = true;
            for (int j = 0; j < sublist.size(); j++) {
                if (elementData[i + j] != sublist.get(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

    // post: replaces all occurrences of the oldValue with the newValue in the list
    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == oldValue) {
                elementData[i] = newValue;
            }
        }
    }

    // post: reverses the order of elements in the list
    public void reverse() {
        for (int i = 0; i < size / 2; i++) {
            int temp = elementData[i];
            elementData[i] = elementData[size - 1 - i];
            elementData[size - 1 - i] = temp;
        }
    }

    public ArrayIntList runningTotal() {
        ArrayIntList result = new ArrayIntList(this.elementData.length);
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum += this.elementData[i];
            result.add(sum);
        }
        return result;
    }

    public void fill(int value) {
        for (int i = 0; i < size; i++) {
            elementData[i] = value;
        }
    }

    public boolean isPairwiseSorted() {
        for (int i = 0; i < size - 1; i += 2) {
            if (elementData[i] > elementData[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int count(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                count++;
            }
        }
        return count;
    }

    public int maxCount() {
        if (size == 0) {
            return 0;
        }

        int currentCount = 1;
        int maxCount = 1;
        int currentValue = elementData[0];

        for (int i = 1; i < size; i++) {
            if (elementData[i] == currentValue) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentValue = elementData[i];
                currentCount = 1;
            }
        }
        return Math.max(maxCount, currentCount);
    }

    public int longestSortedSequence() {
        if (size == 0) {
            return 0;
        }
        int currentSequenceLength = 1;
        int longestSequenceLength = 1;
        for (int i = 1; i < size; i++) {
            if (elementData[i] >= elementData[i - 1]) {
                currentSequenceLength++;
            } else {
                if (currentSequenceLength > longestSequenceLength) {
                    longestSequenceLength = currentSequenceLength;
                }
                currentSequenceLength = 1;
            }
        }
        return Math.max(longestSequenceLength, currentSequenceLength);
    }

    public int removeLast() {
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        int lastValue = elementData[size - 1];
        elementData[size - 1] = 0;
        size--;
        return lastValue;
    }

    public void removeFront(int n) {
        if (n < 0 || n > size) {
            throw new IllegalArgumentException("Invalid value of n: " + n);
        }
        for (int i = 0; i < size - n; i++) {
            elementData[i] = elementData[i + n];
        }
        for (int i = size - n; i < size; i++) {
            elementData[i] = 0;
        }

        size -= n;
    }

    public void removeAll(int value) {
        int shift = 0;
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                shift++;
            } else if (shift > 0) {
                elementData[i - shift] = elementData[i];
            }
        }
        size -= shift;
    }

    public void printInversions() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (elementData[i] > elementData[j]) {
                    System.out.println("(" + elementData[i] + ", " + elementData[j] + ")");
                }
            }
        }
    }

    public void mirror() {
        for (int i = size - 1; i >= 0; i--) {
            add(elementData[i]);
        }
    }

    public void stutter() {
        for (int i = 0; i < size; i += 2) {
            add(i + 1, get(i));
        }
    }

    public void stretch(int n) {
        if (n <= 0) {
            clear();
            return;
        }

        int originalSize = size;
        for (int i = originalSize - 1; i >= 0; i--) {
            int value = get(i);
            remove(i);
            for (int j = 0; j < n; j++) {
                add(i, value);
            }
        }
    }

    public void doubleList() {
        int originalSize = size;
        for (int i = 0; i < originalSize; i++) {
            add(get(i));
        }
    }

    public void compress() {
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < size; readIndex += 2) {
            if (readIndex + 1 < size) {
                set(writeIndex, get(readIndex) + get(readIndex + 1));
            } else {
                set(writeIndex, get(readIndex));
            }
            writeIndex++;
        }
        while (size > writeIndex) {
            remove(size - 1);
        }
    }

    public void rotate() {
        if (size > 0) {
            int firstValue = get(0);
            for (int i = 0; i < size - 1; i++) {
                set(i, get(i + 1));
            }
            set(size - 1, firstValue);
        }
    }

    public void switchPairs() {
        for (int i = 0; i < size - 1; i += 2) {
            int temp = get(i);
            set(i, get(i + 1));
            set(i + 1, temp);
        }
    }

    public ArrayIntList fromCounts() {
        ArrayIntList result = new ArrayIntList();
        for (int i = 0; i < size; i += 2) {
            int count = get(i);
            int value = get(i + 1);
            for (int j = 0; j < count; j++) {
                result.add(value);
            }
        }
        return result;
    }

    // post: checks that the underlying array has the given capacity,
    // throwing an IllegalStateException if it does not
    private void checkCapacity(int capacity) {
        if (capacity > elementData.length) {
            throw new IllegalStateException("exceeds list capacity");
        }
    }

    // post: throws an IndexOutOfBoundsException if the given index is
    // not a legal index of the current list
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }
}
