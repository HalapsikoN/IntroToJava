package by.epam.unit06.bidirectionalList;

import java.util.Iterator;

public class Main {

    public static void main(String argv[]){

        BidirectionalList<Integer> list=new BidirectionalList<>();

        list.addToEnd(5);
        list.addToEnd(8);
        list.addToEnd(10);

        list.print();

        System.out.println();


        list.addAtIndex(6,-10);

        list.print();

        System.out.println();
        list.deleteAtIndex(4);
        list.print();

        System.out.println();
        System.out.println(list.getData(2));
        list.setData(1, 15);
        System.out.println();
        list.print();

        System.out.println();
        System.out.println();
        System.out.println();

        Iterator<Integer> it=list.iterator();

        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
