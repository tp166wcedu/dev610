package ch17;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        IntSearchTree tree7 = new IntSearchTree();
        tree7.add(3);
        tree7.add(6, "L");
        tree7.add(7, "R");
        tree7.add(0, "LL");
        tree7.add(9, "RL");
        tree7.add(2, "RR");
        tree7.add(8, "LLR");

        IntSearchTree tree6 = new IntSearchTree();
        tree6.add(3);
        tree6.add(4, "L");
        tree6.add(7, "R");
        tree6.add(0, "LL");
        tree6.add(9, "LR");
        tree6.add(2, "RR");
        tree6.add(8, "LRR");


        System.out.println("21. ");
        System.out.println(tree6.matches(tree7));
        System.out.println(tree7.matches(tree6));

        // IntSearchTree tree5 = constructTree5();
        // IntSearchTree tree4 = constructRefTree1();
        // IntSearchTree tree3 = constructRefTree3();
        // IntSearchTree tree2 = constructRefTree2();
        // IntSearchTree tree1 = constructRefTree1();
        // System.out.println("20. ");
        // tree2.makePerfect();
        // tree2.printSideways();

        // System.out.println("19. ");
        // tree2.evenLevels();
        // tree2.printSideways();

        // System.out.println("18. ");
        // System.out.println(tree3.inOrderList());

        // System.out.println("17. ");
        // IntSearchTree combinedT = tree2.combineWith(tree3);
        // combinedT.printSideways();

        // System.out.println("16. Original Tree:");
        // tree2.printSideways();
        // tree2.tighten();
        // System.out.println("\n16. Tightened Tree:");
        // tree2.printSideways();

        // System.out.println("15. Original Tree:");
        // tree5.printSideways();
        // tree5.trim(15, 65);
        // System.out.println("\n15. Trimmed Tree (values between 15 and 65):");
        // tree5.printSideways();

        // System.out.println("14.");
        // tree2.completeToLevel(4);
        // tree2.printSideways();

        // IntSearchTree tree5 = tree3.copy();
        // System.out.println("13. "tree5.hashCode() == tree3.hashCode());
        // System.out.println(tree5.equals(tree3));
        // System.out.println(tree5);
        // System.out.println(tree3);

        // System.out.println("12. Before removing leaves:");
        // tree1.printSideways();
        // System.out.println();
        // tree2.printSideways();
        // System.out.println();
        // tree1.removeLeaves();
        // tree2.removeLeaves();
        // System.out.println("\nAfter removing leaves:");
        // tree1.printSideways();
        // System.out.println();
        // tree2.printSideways();

        // System.out.println("11. Before numbering:");
        // tree1.printSideways();
        // int numberOfNodes = tree1.numberNodes();
        // System.out.println("\nAfter numbering:");
        // tree1.printSideways();
        // System.out.println("\nNumber of nodes: " + numberOfNodes);

        // System.out.println("10. Before doublePositives: " + tree2);
        // tree2.printSideways();
        // System.out.println();
        //
        // tree2.doublePositives();
        // System.out.println("10. After doublePositives: " + tree2);
        // tree2.printSideways();
        // System.out.println();

        // System.out.println("9. tree1=tree2? " + tree1.equals(tree2));
        // System.out.println("9. tree1=tree3? " + tree1.equals(tree3));
        // System.out.println("9. tree1=tree4? " + tree1.equals(tree4));
        // System.out.println();
        //
        // System.out.println("8. tree #2 - toString: " + tree2);
        // System.out.println();
        //
        // System.out.println("7. tree #3 - isFull: " + tree3.isFull());
        // System.out.println("7. tree #2 - isFull: " + tree2.isFull());
        // System.out.println("7. tree #1 - isFull: " + tree1.isFull());
        // System.out.println();
        //
        // System.out.println("6. tree #2 - printLeaves():");
        // tree2.printLeaves();
        // System.out.println();
        //
        // System.out.println("5. tree #2 - printLevel(3):");
        // tree2.printLevel(3);
        // System.out.println();
        //
        // System.out.println("4. Number of branch nodes with even values in tree #2: " + tree2.countEvenBranches());
        // System.out.println();
        //
        // System.out.println("3. Depth sum of tree #1: " + tree1.depthSum());
        // System.out.println();
        //
        // System.out.println("2. Number of empty branches in tree #1: " + tree1.countEmpty());
        // System.out.println();
        //
        // System.out.println("1. Number of left children in tree #1: " + tree1.countLeftNodes());
    }

    @NotNull
    private static IntSearchTree constructTree5() {
        IntSearchTree tree5 = new IntSearchTree();

        // Adding some values to the tree.
        tree5.add(40);
        tree5.add(20);
        tree5.add(60);
        tree5.add(10);
        tree5.add(30);
        tree5.add(50);
        tree5.add(70);
        tree5.add(5);
        tree5.add(15);
        tree5.add(45);
        tree5.add(55);
        tree5.add(65);
        tree5.add(75);
        return tree5;
    }

    @NotNull
    private static IntSearchTree constructRefTree1() {
        IntSearchTree tree1 = new IntSearchTree();
        tree1.add(3);
        tree1.add(5, "L");
        tree1.add(2, "R");
        tree1.add(1, "LL");
        tree1.add(4, "RL");
        tree1.add(6, "RR");
        return tree1;
    }

    @NotNull
    private static IntSearchTree constructRefTree2() {
        IntSearchTree tree2 = new IntSearchTree();
        tree2.add(2, "");
        tree2.add(8, "L");
        tree2.add(1, "R");
        tree2.add(0, "LL");
        tree2.add(7, "RL");
        tree2.add(4, "RLL");
        tree2.add(6, "RR");
        tree2.add(9, "RRR");
        return tree2;
    }

    @NotNull
    private static IntSearchTree constructRefTree3() {
        IntSearchTree tree3 = new IntSearchTree();
        tree3.add(2);
        tree3.add(3, "L");
        tree3.add(1, "R");
        tree3.add(8, "LL");
        tree3.add(7, "LF");
        return tree3;
    }
}

