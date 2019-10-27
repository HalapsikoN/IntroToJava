package by.epam.unit06.bidirectionalList;

import java.util.Iterator;

public class Main {

    public static void main(String argv[]) {

        BidirectionalList<Integer> list = new BidirectionalList<>();

        list.addToEnd(5);
        list.addToEnd(8);
        list.addToEnd(10);
        list.addToEnd(30);
        list.addToEnd(42);

        System.out.println("List: " + list.getStringOfList());
        System.out.println();

        list.addAtIndex(6, 3);
        System.out.println("Add element (6) at index (3): " + list.getStringOfList());

        System.out.println();
        list.deleteAtIndex(2);
        System.out.println("Delete element at index (2): " + list.getStringOfList());

        System.out.println();
        System.out.println("Element at index (2): " + list.getData(2));

        list.setData(1, 15);
        System.out.println();
        System.out.println("Change data at (1) element: " + list.getStringOfList());

        System.out.println();
        System.out.println("Iterator:");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
