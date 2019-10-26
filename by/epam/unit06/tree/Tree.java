package by.epam.unit06.tree;

import java.util.Iterator;

public class Tree<T> implements Iterable<T>{

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            TreeElement<T> element=root;

            @Override
            public boolean hasNext() {
                return ((Comparable)element.data).compareTo((Comparable)findMax(root).data)<0;
            }

            @Override
            public T next() {
                T result;
                element=go(element);
                result=element.data;
                return result;
            }
        };
        return iterator;
    }

    private TreeElement<T> go(TreeElement<T> treeElement){
        if(treeElement!=null){
            if(treeElement.left!=null){
                treeElement=go(treeElement.left);
                return treeElement;
            }

            if(treeElement.right!=null){
                treeElement=go(treeElement.right);
                return treeElement;
            }
        }
        return null;
    }

    private TreeElement<T> findMax(TreeElement<T> treeElement){
        while(treeElement.right!=null){
            treeElement=treeElement.right;
        }
        return treeElement;
    }

    class TreeElement<Type>{
        Type data;
        TreeElement left;
        TreeElement right;

        TreeElement(Type data, TreeElement left, TreeElement right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        TreeElement(Type data) {
            this.data = data;
        }

        TreeElement() {
            super();
        }
    }

    private TreeElement<T> root;

    public void add(T inf){
        root=add(root, inf);
    }

    private TreeElement<T> add(TreeElement<T> treeElement, T inf){
        if(treeElement==null){
            treeElement=new TreeElement<>(inf);
            return treeElement;
        }else if(((Comparable)inf).compareTo((Comparable)treeElement.data)<0){
            treeElement.left=add(treeElement.left, inf);
            return treeElement;
        }else if(((Comparable)inf).compareTo((Comparable)treeElement.data)>0){
            treeElement.right=add(treeElement.right, inf);
            return treeElement;
        }
        return null;
    }

    public void show(){
        show(root);
    }

    private void show(TreeElement<T> treeElement){

        if(treeElement!=null){
            System.out.println("Element: "+treeElement.data);

            if(treeElement.left!=null){
                show(treeElement.left);
            }

            if(treeElement.right!=null){
                show(treeElement.right);
            }
        }
    }

    public void delete(T inf){
        TreeElement<T> deleteOne=find(root, inf);
        if(deleteOne==null){
            return;
        }
        if(deleteOne==root){
            TreeElement<T> temp=root.left;
            root=root.right;
            TreeElement<T> temp1=root;
            while (temp1.left!=null){
                temp1=temp1.left;
            }
            temp1.left=temp;
            return;
        }
        TreeElement<T> elementBeforeDelete=findBefore(root, inf);
        TreeElement<T> leftDelete=deleteOne.left;
        TreeElement<T> rightDelete=deleteOne.right;
        if(((Comparable)elementBeforeDelete.data).compareTo((Comparable)deleteOne.data)>0){
            if(rightDelete==null){
                elementBeforeDelete.left=leftDelete;
                return;
            }
            elementBeforeDelete.left=rightDelete;
            while(rightDelete.left!=null){
                rightDelete=rightDelete.left;
            }
            rightDelete.left=leftDelete;
        }else{
            if(leftDelete==null){
                elementBeforeDelete.right=rightDelete;
                return;
            }
            elementBeforeDelete.right=leftDelete;
            while (leftDelete.right!=null){
                leftDelete=leftDelete.right;
            }
            leftDelete.right=rightDelete;
        }
    }

    private TreeElement<T> find(TreeElement<T> treeElement, T inf){
        if(treeElement==null){
            return null;
        }
        if(inf.equals(treeElement.data)){
            return treeElement;
        }else if(((Comparable)inf).compareTo((Comparable)treeElement.data)<0){
            treeElement=find(treeElement.left, inf);
            return treeElement;
        }else {
            treeElement=find(treeElement.right, inf);
            return treeElement;
        }
    }

    private TreeElement<T> findBefore(TreeElement<T> treeElement, T inf){
        if(treeElement==null){
            return null;
        }
        if(inf.equals(treeElement.left.data) || inf.equals(treeElement.right.data)) {
            return treeElement;
        }else if(((Comparable)inf).compareTo((Comparable)treeElement.data)<0){
            treeElement=findBefore(treeElement.left, inf);
            return treeElement;
        }else {
            treeElement=findBefore(treeElement.right, inf);
            return treeElement;
        }
    }

    public boolean find(T inf){
        return find(root, inf)!=null;
    }

    public T findTheElementBefore(T inf){
        TreeElement<T> result=root;
        result=findBefore(result, inf);
        if(result!=null){
            return result.data;
        }
        return null;
    }
}
