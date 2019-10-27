package by.epam.unit06.tree;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<>();

        tree.add(15);
        tree.add(14);
        tree.add(10);
        tree.add(30);
        tree.add(36);
        tree.add(42);
        tree.add(33);
        System.out.println("Tree: " + tree.showString());

        tree.add(100);
        System.out.println();
        System.out.println("Add element(100): " + tree.showString());

        tree.delete(36);
        System.out.println();
        System.out.println("Delete element(36): " + tree.showString());

        System.out.println();
        System.out.println("Find the element(30): " + (tree.find(30) ? "Yes" : "No"));
        System.out.println("Find the element(36): " + (tree.find(36) ? "Yes" : "No"));


        System.out.println();
        System.out.println("Iterator:");
        for (Integer integer : tree) {
            System.out.print(integer + " ");
        }
    }
}
