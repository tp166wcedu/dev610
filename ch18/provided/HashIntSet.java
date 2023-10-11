package ch18.provided;

import java.util.Arrays;

// Implements a set of integers using a hash table.
// The hash table uses separate chaining to resolve collisions.
public class HashIntSet {

    // region Provided
    private static final double MAX_LOAD_FACTOR = 0.75;
    private HashEntry[] elementData;
    private int size;

    // Constructs an empty set.
    public HashIntSet() {
        elementData = new HashEntry[10];
        size = 0;
    }

    // Adds the given element to this set, if it was not already
    // contained in the set.
    public void add(int value) {
        if (!contains(value)) {
            if (loadFactor() >= MAX_LOAD_FACTOR) {
                rehash();
            }

            // insert new value at front of list
            int bucket = hashFunction(value);
            elementData[bucket] = new HashEntry(value, elementData[bucket]);
            size++;
        }
    }

    // Removes all elements from the set.
    public void clear() {
        Arrays.fill(elementData, null);
        size = 0;
    }

    // Returns true if the given value is found in this set.
    public boolean contains(int value) {
        int bucket = hashFunction(value);
        HashEntry current = elementData[bucket];
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Returns true if there are no elements in this queue.
    public boolean isEmpty() {
        return size == 0;
    }

    // Removes the given value if it is contained in the set.
    // If the set does not contain the value, has no effect.
    public void remove(int value) {
        int bucket = hashFunction(value);
        if (elementData[bucket] != null) {
            // check front of list
            if (elementData[bucket].data == value) {
                elementData[bucket] = elementData[bucket].next;
                size--;
            } else {
                // check rest of list
                HashEntry current = elementData[bucket];
                while (current.next != null && current.next.data != value) {
                    current = current.next;
                }

                // if the element is found, remove it
                if (current.next != null) {
                    current.next = current.next.next;
                    size--;
                }
            }
        }
    }

    // Returns the number of elements in the queue.
    public int size() {
        return size;
    }

    // Returns the preferred hash bucket index for the given value.
    private int hashFunction(int value) {
        return Math.abs(value) % elementData.length;
    }

    private double loadFactor() {
        return (double) size / elementData.length;
    }

    // Resizes the hash table to twice its former size.
    private void rehash() {
        // replace element data array with a larger empty version
        HashEntry[] oldElementData = elementData;
        elementData = new HashEntry[2 * oldElementData.length];
        size = 0;

        // re-add all of the old data into the new array
        for (HashEntry oldElementDatum : oldElementData) {
            HashEntry current = oldElementDatum;
            while (current != null) {
                add(current.data);
                current = current.next;
            }
        }
    }

    // Represents a single value in a chain stored in one hash bucket.
    private static class HashEntry {
        public int data;
        public HashEntry next;

        public HashEntry(int data) {
            this(data, null);
        }

        public HashEntry(int data, HashEntry next) {
            this.data = data;
            this.next = next;
        }
    }

    // endregion

    // region Ex1
    public void addAll(HashIntSet other) {
        for (HashEntry bucket : other.elementData) {
            HashEntry current = bucket;
            while (current != null) {
                this.add(current.data);
                current = current.next;
            }
        }
    }
    // endregion

    // region Ex2
    public boolean containsAll(HashIntSet other) {
        for (HashEntry bucket : other.elementData) {
            HashEntry current = bucket;
            while (current != null) {
                if (!this.contains(current.data)) {
                    return false;
                }
                current = current.next;
            }
        }
        return true;
    }
    // endregion

    // region Ex3
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HashIntSet other)) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        for (HashEntry bucket : this.elementData) {
            HashEntry current = bucket;
            while (current != null) {
                if (!other.contains(current.data)) {
                    return false;
                }
                current = current.next;
            }
        }
        return true;
    }
    // endregion

    // region Ex4
    public void removeAll(HashIntSet other) {
        for (HashEntry bucket : other.elementData) {
            HashEntry current = bucket;
            while (current != null) {
                this.remove(current.data);
                current = current.next;
            }
        }
    }
    // endregion

    // region Ex5
    public void retainAll(HashIntSet other) {
        for (HashEntry bucket : this.elementData) {
            HashEntry current = bucket;
            while (current != null) {
                if (!other.contains(current.data)) {
                    this.remove(current.data);
                }
                current = current.next;
            }
        }
    }
    // endregion

    // region Ex6
    public int[] toArray() {
        int[] result = new int[size];
        int index = 0;
        for (HashEntry bucket : this.elementData) {
            HashEntry current = bucket;
            while (current != null) {
                result[index] = current.data;
                index++;
                current = current.next;
            }
        }
        return result;
    }

    // endregion

    // region Ex7
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        boolean first = true;
        if (!isEmpty()) {
            for (HashEntry elementDatum : elementData) {
                HashEntry current = elementDatum;
                while (current != null) {
                    if (!first) {
                        result.append(", ");
                    }
                    result.append(current.data);
                    first = false;
                    current = current.next;
                }
            }
        }
        return result + "]";
    }
    // endregion

    // region Ex8
    // endregion

    // region Ex9
    // endregion
}

