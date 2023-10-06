package ch17;

import java.util.ArrayList;
import java.util.List;

public class IntSearchTree {
    // region Textbook provided
    private IntTreeNode overallRoot;

    // post: constructs an empty tree
    public IntSearchTree() {
        overallRoot = null;
    }

    // post: value is added to overall tree to preserve the
    //       binary search tree property
    public void add(int value) {
        overallRoot = add(overallRoot, value);
    }

    // post: value is added to given tree to preserve the
    //       binary search tree property
    private IntTreeNode add(IntTreeNode root, int value) {
        if (root == null) {
            root = new IntTreeNode(value);
        } else if (value <= root.data) {
            root.left = add(root.left, value);
        } else {
            root.right = add(root.right, value);
        }
        return root;
    }

    // post: returns true if overall tree contains value
    public boolean contains(int value) {
        return contains(overallRoot, value);
    }

    // post: returns true if given tree contains value
    private boolean contains(IntTreeNode root, int value) {
        if (root == null) {
            return false;
        } else if (value == root.data) {
            return true;
        } else if (value < root.data) {
            return contains(root.left, value);
        } else {  // value > root.data
            return contains(root.right, value);
        }
    }


    // post: prints the tree contents using an inorder traversal
    public void print() {
        printInorder(overallRoot);
        System.out.println();
    }

    // post: prints contents of the tree with given root using an
    //       inorder traversal
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    // post: prints the tree contents, one per line, following an
    //       inorder traversal and using indentation to indicate
    //       node depth; prints right to left so that it looks
    //       correct when the output is rotated.
    public void printSideways() {
        printSideways(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given
    //       root, indenting each line to the given level
    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }
    // endregion

    // region Ex1
    public int countLeftNodes() {
        return countLeftNodes(overallRoot);
    }

    private int countLeftNodes(IntTreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.left != null) {
            count = 1;
        }
        return count + countLeftNodes(root.left) + countLeftNodes(root.right);
    }
    // endregion

    // region Ex2
    public int countEmpty() {
        return countEmpty(overallRoot);
    }

    private int countEmpty(IntTreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.left == null) {
            count++;
        }
        if (root.right == null) {
            count++;
        }
        return count + countEmpty(root.left) + countEmpty(root.right);
    }
    // endregion

    // region Ex3
    public int depthSum() {
        return depthSum(overallRoot, 1);
    }

    private int depthSum(IntTreeNode root, int depth) {
        if (root == null) {
            return 0;
        }
        return depth * root.data
                + depthSum(root.left, depth + 1)
                + depthSum(root.right, depth + 1);
    }
    // endregion

    // region Ex4
    public int countEvenBranches() {
        return countEvenBranches(overallRoot);
    }

    private int countEvenBranches(IntTreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.left != null || root.right != null) {
            if (root.data % 2 == 0) {
                count = 1;
            }
        }
        count += countEvenBranches(root.left) + countEvenBranches(root.right);
        return count;
    }
    // endregion

    // region Ex5
    public void printLevel(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Level must be 1 or greater.");
        }
        printLevel(overallRoot, n, 1);
    }

    private void printLevel(IntTreeNode root, int targetLevel, int currentLevel) {
        if (root != null) {
            if (currentLevel == targetLevel) {
                // This is just for formatting output
                System.out.println("   " + root.data);
                // System.out.println(root.data);
            } else {
                printLevel(root.left, targetLevel, currentLevel + 1);
                printLevel(root.right, targetLevel, currentLevel + 1);
            }
        }
    }

    public void add(int value, String path) {
        overallRoot = add(overallRoot, value, path, 0);
    }

    private IntTreeNode add(IntTreeNode root, int value, String path, int index) {
        if (index == path.length()) {
            // We're at the desired spot in the tree
            return new IntTreeNode(value);
        } else {
            if (root == null) {
                root = new IntTreeNode(0);  // dummy node
            }
            if (path.charAt(index) == 'L') {
                root.left = add(root.left, value, path, index + 1);
            } else {  // 'R'
                root.right = add(root.right, value, path, index + 1);
            }
            return root;
        }
    }
    // endregion

    // region Ex6
    public void printLeaves() {
        if (overallRoot == null) {
            System.out.println("no leaves");
        } else {
            System.out.print("leaves: ");
            printLeaves(overallRoot);
            System.out.println();
        }
    }

    private void printLeaves(IntTreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.print(root.data + " ");
            }
            printLeaves(root.right);
            printLeaves(root.left);
        }
    }
    // endregion

    // region Ex7
    public boolean isFull() {
        return isFull(overallRoot);
    }

    private boolean isFull(IntTreeNode root) {
        // if the current node is null, return true
        if (root == null) {
            return true;
        }
        // if it's a leaf node, return true
        if (root.left == null && root.right == null) {
            return true;
        }
        // if it has two children, check for fullness recursively on both subtrees
        if (root.left != null && root.right != null) {
            return isFull(root.left) && isFull(root.right);
        }
        // if none of the above conditions are met, return false
        return false;
    }
    // endregion

    // region Ex8
    @Override
    public String toString() {
        return toString(overallRoot);
    }

    private String toString(IntTreeNode root) {
        if (root == null) {
            return "empty";
        }
        if (root.left == null && root.right == null) {
            return String.valueOf(root.data);
        }
        return "(" + root.data + ", " + toString(root.left) + ", " + toString(root.right) + ")";
    }
    // endregion

    // region Ex9
    public boolean equals(IntSearchTree other) {
        return equals(this.overallRoot, other.overallRoot);
    }

    private boolean equals(IntTreeNode node1, IntTreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.data != node2.data) {
            return false;
        }
        return equals(node1.left, node2.left) && equals(node1.right, node2.right);
    }
    // endregion

    // region Ex10
    public void doublePositives() {
        doublePositives(overallRoot);
    }

    private void doublePositives(IntTreeNode node) {
        if (node != null) {
            if (node.data > 0) {
                node.data *= 2;
            }
            doublePositives(node.left);
            doublePositives(node.right);
        }
    }
    // endregion

    // region Ex11
    private int count;

    public int numberNodes() {
        count = 0;
        numberNodes(overallRoot);
        return count;
    }

    private void numberNodes(IntTreeNode node) {
        if (node != null) {
            count++;
            node.data = count;
            numberNodes(node.left);
            numberNodes(node.right);
        }
    }

    // endregion

    // region Ex12
    public void removeLeaves() {
        overallRoot = removeLeaves(overallRoot);
    }

    private IntTreeNode removeLeaves(IntTreeNode node) {
        if (node == null) {
            return null;
        }
        if (node.left == null && node.right == null) {
            return null;
        }
        node.left = removeLeaves(node.left);
        node.right = removeLeaves(node.right);
        return node;
    }

    // endregion

    // region Ex13
    public IntSearchTree copy() {
        IntSearchTree copiedTree = new IntSearchTree();
        copiedTree.overallRoot = copy(overallRoot);
        return copiedTree;
    }

    private IntTreeNode copy(IntTreeNode node) {
        if (node == null) {
            return null;
        }
        IntTreeNode newNode = new IntTreeNode(node.data);
        newNode.left = copy(node.left);
        newNode.right = copy(node.right);
        return newNode;
    }

    // endregion

    // region Ex14
    public void completeToLevel(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Level should be 1 or greater");
        }
        completeToLevel(overallRoot, 1, n);
    }

    private void completeToLevel(IntTreeNode node, int currentLevel, int n) {
        if (node == null || currentLevel > n) {
            return;
        }

        if (node.left == null && currentLevel < n && node.right != null) {
            node.left = new IntTreeNode(-1);
        } else if (node.right == null && currentLevel < n && node.left != null) {
            node.right = new IntTreeNode(-1);
        }

        completeToLevel(node.left, currentLevel + 1, n);
        completeToLevel(node.right, currentLevel + 1, n);
    }
    // endregion

    // region Ex15
    public void trim(int min, int max) {
        overallRoot = trim(overallRoot, min, max);
    }

    private IntTreeNode trim(IntTreeNode node, int min, int max) {
        if (node == null) {
            return null;
        }
        // If the node's value is less than the minimum, then we should discard this node
        // and its entire left subtree, and return the trimmed version of its right subtree.
        if (node.data < min) {
            return trim(node.right, min, max);
        }
        // Similarly, if the node's value is more than the maximum, discard this node and
        // its entire right subtree, returning the trimmed version of its left subtree.
        if (node.data > max) {
            return trim(node.left, min, max);
        }
        // If the node's value is within the range, then recursively trim its left and right subtrees.
        node.left = trim(node.left, min, max);
        node.right = trim(node.right, min, max);
        return node;
    }

    // endregion

    // region Ex16
    public void tighten() {
        overallRoot = tighten(overallRoot);
    }

    private IntTreeNode tighten(IntTreeNode node) {
        if (node == null) {
            return null;
        }
        node.left = tighten(node.left);
        node.right = tighten(node.right);
        // If the node has only a left child, return the left child.
        if (node.left != null && node.right == null) {
            return node.left;
        }
        // If the node has only a right child, return the right child.
        if (node.right != null && node.left == null) {
            return node.right;
        }
        // If the node has two children or no children, return the node itself.
        return node;
    }

    // endregion

    // region Ex17
    public IntSearchTree combineWith(IntSearchTree other) {
        IntSearchTree combined = new IntSearchTree();
        combined.overallRoot = combineWith(this.overallRoot, other.overallRoot);
        return combined;
    }

    private IntTreeNode combineWith(IntTreeNode node1, IntTreeNode node2) {
        // Base case: If both nodes are null, return null
        if (node1 == null && node2 == null) {
            return null;
        }
        int value = 0; // Initialize the value for the new node
        // Determine the value of the new node
        if (node1 != null) value += 1;
        if (node2 != null) value += 2;
        // Recursively combine the left and right children of the nodes
        IntTreeNode leftNode1 = (node1 != null) ? node1.left : null;
        IntTreeNode leftNode2 = (node2 != null) ? node2.left : null;
        IntTreeNode rightNode1 = (node1 != null) ? node1.right : null;
        IntTreeNode rightNode2 = (node2 != null) ? node2.right : null;

        IntTreeNode left = combineWith(leftNode1, leftNode2);
        IntTreeNode right = combineWith(rightNode1, rightNode2);

        // Create a new node with the determined value and left and right children
        return new IntTreeNode(value, left, right);
    }

    // endregion

    // region Ex18
    public List<Integer> inOrderList() {
        List<Integer> result = new ArrayList<>();
        inOrderList(overallRoot, result);
        return result;
    }

    private void inOrderList(IntTreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inOrderList(node.left, list);
        list.add(node.data);
        inOrderList(node.right, list);
    }
    // endregion

    // region Ex19
    public void evenLevels() {
        overallRoot = evenLevels(overallRoot, 1);
    }

    private IntTreeNode evenLevels(IntTreeNode node, int level) {
        if (node == null) {
            return null;
        }
        node.left = evenLevels(node.left, level + 1);
        node.right = evenLevels(node.right, level + 1);
        if (node.left == null && node.right == null && level % 2 != 0) {
            return null;
        }

        return node;
    }
    // endregion

    // region Ex20
    public void makePerfect() {
        int depth = getDepth(overallRoot);
        makePerfect(overallRoot, 1, depth);
    }

    private void makePerfect(IntTreeNode node, int currentDepth, int maxDepth) {
        if (node == null) {
            return;
        }
        if (currentDepth < maxDepth) {
            if (node.left == null) {
                node.left = new IntTreeNode(0);
            }
            if (node.right == null) {
                node.right = new IntTreeNode(0);
            }
        }
        makePerfect(node.left, currentDepth + 1, maxDepth);
        makePerfect(node.right, currentDepth + 1, maxDepth);
    }

    private int getDepth(IntTreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getDepth(node.left), getDepth(node.right));
    }
    // endregion

    // region Ex21
    public int matches(IntSearchTree otherTree) {
        return matches(this.overallRoot, otherTree.overallRoot);
    }

    private int matches(IntTreeNode node1, IntTreeNode node2) {
        if (node1 == null || node2 == null) {
            return 0;
        }
        int count = (node1.data == node2.data) ? 1 : 0;
        count += matches(node1.left, node2.left);
        count += matches(node1.right, node2.right);
        return count;
    }
    // endregion

    static class IntTreeNode {
        public int data;
        public IntTreeNode left;
        public IntTreeNode right;

        // constructs a leaf node with given data
        public IntTreeNode(int data) {
            this(data, null, null);
        }

        // constructs a branch node with given data, left subtree,
        // right subtree
        public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

}