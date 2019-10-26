package by.epam.unit06.tree;

import java.util.Iterator;

public class Main {

    public static void main(String[] args){

        Tree<Integer> tree=new Tree<>();

        tree.add(15);
        tree.add(14);
        tree.add(10);
        tree.add(30);

        System.out.println();

        tree.show();

        System.out.println(tree.find(17));
        System.out.println(tree.findTheElementBefore(10));

        tree.delete(15);

        System.out.println();
        tree.show();

        System.out.println();

        Iterator<Integer> iterator=tree.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }
}
