package ch16;

import java.util.NoSuchElementException;

public class LinkedIntList {
    private ListNode front;  // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // Ex1
    public void set(int index, int value) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        ListNode current = nodeAt(index);
        current.data = value;
    }

    // Ex2
    public int min() {
        if (front == null) {
            throw new NoSuchElementException("List is empty");
        }

        int min = front.data;
        ListNode current = front.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    // Ex3
    public boolean isSorted() {
        if (front == null) {
            return true;
        }

        ListNode current = front;
        while (current.next != null) {
            if (current.data > current.next.data) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    // Ex4
    public int lastIndexOf(int value) {
        int lastIndex = -1;
        int currentIndex = 0;
        ListNode current = front;

        while (current != null) {
            if (current.data == value) {
                lastIndex = currentIndex;
            }
            current = current.next;
            currentIndex++;
        }
        return lastIndex;
    }

    // Ex5
    public int countDuplicates() {
        if (front == null) {
            return 0;
        }

        ListNode current = front;
        int duplicates = 0;
        while (current.next != null) {
            if (current.data == current.next.data) {
                duplicates++;
            }
            current = current.next;
        }
        return duplicates;
    }

    // Ex6
    public boolean hasTwoConsecutive() {
        if (front == null || front.next == null) {
            return false;
        }

        ListNode current = front;
        while (current.next != null) {
            if (current.data + 1 == current.next.data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Ex7
    public int deleteBack() {
        if (front == null) {
            throw new NoSuchElementException("List is empty");
        }

        // If there's only one element in the list
        if (front.next == null) {
            int value = front.data;
            front = null;
            return value;
        }

        ListNode current = front;
        while (current.next.next != null) {
            current = current.next;
        }

        int value = current.next.data;
        current.next = null;
        return value;
    }

    // Ex8
    public void switchPairs() {
        if (front == null || front.next == null) {
            return;
        }

        ListNode prev = null;
        ListNode current = front;
        while (current != null && current.next != null) {
            ListNode nextPairStart = current.next.next;
            if (prev == null) {
                front = current.next;
            } else {
                prev.next = current.next;
            }
            current.next.next = current;
            current.next = nextPairStart;
            prev = current;
            current = nextPairStart;
        }
    }

    // Ex9
    public void stutter() {
        if (front == null) {
            return;
        }

        ListNode current = front;
        while (current != null) {
            ListNode duplicate = new ListNode(current.data, current.next);
            current.next = duplicate;
            current = duplicate.next;
        }
    }

    // Ex10
    public void stretch(int n) {
        if (n <= 0) {
            front = null;
            return;
        }

        ListNode current = front;
        while (current != null) {
            for (int i = 1; i < n; i++) {
                ListNode duplicate = new ListNode(current.data, current.next);
                current.next = duplicate;
                current = duplicate;
            }
            current = current.next;
        }
    }

    // Ex11
    public void compress() {
        if (front == null || front.next == null) {
            return;
        }

        ListNode current = front;
        while (current != null && current.next != null) {
            current.data += current.next.data;
            current.next = current.next.next;
            current = current.next;
        }
    }

    // Ex12
    public void split() {
        if (front == null || front.next == null) {
            return;
        }

        ListNode negativeEnd = null;
        ListNode current = front;
        ListNode prev = null;

        while (current != null) {
            if (current.data < 0) {
                if (negativeEnd == null) {
                    if (prev != null) {
                        prev.next = current.next;
                        current.next = front;
                        front = current;
                        negativeEnd = front;
                    } else {
                        negativeEnd = current;
                    }
                } else {
                    if (negativeEnd != current) {
                        prev.next = current.next;
                        current.next = negativeEnd.next;
                        negativeEnd.next = current;
                    }
                    negativeEnd = current;
                }
            }
            prev = current;
            current = prev.next;
        }
    }

    // Ex13
    public void transferFrom(LinkedIntList other) {
        if (this.front == null) {
            this.front = other.front;
        } else {
            ListNode current = this.front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = other.front;
        }
        other.front = null;
    }

    // Ex14
    public void removeAll(int value) {
        while (front != null && front.data == value) {
            front = front.next;
        }

        if (front != null) {
            ListNode current = front;
            while (current.next != null) {
                if (current.next.data == value) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
        }
    }

    // Ex15
    public boolean equals(LinkedIntList other) {
        if (this.size() != other.size()) {
            return false;
        }
        ListNode current1 = this.front;
        ListNode current2 = other.front;
        while (current1 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return true;
    }

    // Ex16
    public LinkedIntList removeEvens() {
        LinkedIntList evens = new LinkedIntList();

        if (front == null) {
            return evens;
        }

        evens.front = front;
        ListNode evenTail = evens.front;
        if (front.next != null) {
            front = front.next;
            evenTail.next = null;
        }

        ListNode current = front;

        while (current.next != null) {
            evenTail.next = current.next;
            evenTail = evenTail.next;

            current.next = evenTail.next;
            if (current.next != null) {
                current = current.next;
            }

            evenTail.next = null;
        }

        return evens;
    }

    // Ex17
    public void removeRange(int start, int end) {
        if (start < 0 || end < 0 || start > end) {
            throw new IllegalArgumentException("Invalid range.");
        }

        if (front == null) {
            return;
        }
        if (start == 0) {
            for (int i = 0; i <= end && front != null; i++) {
                front = front.next;
            }
        } else {
            ListNode current = front;
            for (int i = 0; i < start - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null || current.next == null) {
                return;
            }
            ListNode tail = current.next;
            for (int i = 0; i <= end - start && tail != null; i++) {
                tail = tail.next;
            }
            current.next = tail;
        }
    }

    // Ex18
    public void doubleList() {
        if (front == null) {
            return;
        }

        ListNode current = front;
        ListNode copyStart = new ListNode(current.data);
        ListNode copyCurrent = copyStart;

        while (current.next != null) {
            current = current.next;
            copyCurrent.next = new ListNode(current.data);
            copyCurrent = copyCurrent.next;
        }

        current.next = copyStart;
    }

    // Ex19
    public void rotate() {
        if (front == null || front.next == null) {
            return;
        }

        ListNode oldFront = front;
        front = front.next;
        ListNode current = front;

        while (current.next != null) {
            current = current.next;
        }

        current.next = oldFront;
        oldFront.next = null;
    }

    // Ex20
    public void shift() {
        if (front == null || front.next == null) {
            return;
        }

        ListNode evenEnd = front;
        while (evenEnd.next != null) {
            evenEnd = evenEnd.next;
        }
        ListNode current = front;
        while (current.next != null && current.next != evenEnd) {
            ListNode odd = current.next;
            current.next = odd.next;
            evenEnd.next = odd;
            odd.next = null;
            evenEnd = evenEnd.next;
            current = current.next;
        }
    }

    // Ex21
    public void surroundWith(int x, int y) {
        if (front == null) {
            return;
        }

        ListNode current = front;
        while (current != null) {
            if (current.data == x) {
                if (current != front) {
                    ListNode before = new ListNode(y, current);
                    ListNode prev = getPreviousNode(current);
                    prev.next = before;
                    current = before.next;
                } else {
                    front = new ListNode(y, current);
                    current = current.next;
                }

                // Insert node with value y after the node with value x
                ListNode after = new ListNode(y, current.next);
                current.next = after;

                // Move current pointer two positions ahead
                current = after.next;
            } else {
                current = current.next;
            }
        }
    }

    // Ex22
    public void reverse() {
        if (front == null || front.next == null) {
            return;
        }
        ListNode prev = null;
        ListNode current = front;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        front = prev;
    }


    private ListNode getPreviousNode(ListNode node) {
        if (node == front) {
            return null;
        }
        ListNode current = front;
        while (current.next != null && current.next != node) {
            current = current.next;
        }
        return current;
    }


    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public class ListNode {
        public int data;       // data stored in this node
        public ListNode next;  // link to next node in the list

        // post: constructs a node with data 0 and null link
        public ListNode() {
            this(0, null);
        }

        // post: constructs a node with given data and null link
        public ListNode(int data) {
            this(data, null);
        }

        // post: constructs a node with given data and given link
        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

}
