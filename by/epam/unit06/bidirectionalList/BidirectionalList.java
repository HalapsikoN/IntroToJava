package by.epam.unit06.bidirectionalList;

import java.util.Iterator;

public class BidirectionalList<T> implements Iterable<T> {

    class BidirectionalListElement<Type> {
        private Type data;
        private BidirectionalListElement<Type> next;
        private BidirectionalListElement<Type> prev;

        private BidirectionalListElement(Type data, BidirectionalListElement<Type> next, BidirectionalListElement<Type> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public BidirectionalListElement(Type data) {
            this.data = data;
        }

        private BidirectionalListElement() {
            super();
        }
    }

    private BidirectionalListElement<T> head;
    private BidirectionalListElement<T> tail;
    private int length;

    public void addToEnd(T inf) {
        if (this.head == null) {
            BidirectionalListElement<T> element = new BidirectionalListElement<>(inf);
            this.head = element;
            this.tail = element;
        } else {
            BidirectionalListElement<T> element = new BidirectionalListElement<>(inf, null, this.tail);
            this.tail.next = element;
            this.tail = element;
        }
        length++;
    }

    public void addToBegin(T inf) {
        if (this.head == null && this.tail == null) {
            BidirectionalListElement<T> element = new BidirectionalListElement<>(inf);
            this.head = element;
            this.tail = element;
        } else {
            BidirectionalListElement<T> element = new BidirectionalListElement<>(inf, this.head, null);
            this.head.prev = element;
            this.head = element;
        }
        length++;
    }

    public void addAtIndex(T inf, int index) {
        BidirectionalListElement<T> temp = head;
        if (temp == null) {
            BidirectionalListElement<T> element = new BidirectionalListElement<>(inf);
            this.head = element;
            this.tail = element;
        } else {
            if (index <= 0) {
                addToBegin(inf);
                return;
            }
            while (--index > 0 && temp != null) {
                temp = temp.next;
            }
            if (temp == null) {
                addToEnd(inf);
            } else {
                BidirectionalListElement<T> temp2 = temp.next;
                BidirectionalListElement<T> element = new BidirectionalListElement<>(inf, temp2, temp);
                temp.next = element;
                if (temp2 != null) {
                    temp2.prev = element;
                }
            }
        }

        length++;
    }

    public String getStringOfList() {
        StringBuilder result = new StringBuilder();
        BidirectionalListElement<T> temp = head;
        while (temp != null) {
            result.append(temp.data + " ");
            temp = temp.next;
        }
        return result.toString();
    }

    public void deleteFromEnd() {
        if (head != null) {
            tail = tail.prev;
            tail.next = null;
            length--;
        }
    }

    public void deleteFromBegin() {
        if (head != null) {
            head = head.next;
            head.prev = null;
            length--;
        }
    }

    public void deleteAtIndex(int index) {
        BidirectionalListElement<T> temp = head;
        if (head != null) {
            if (index <= 0) {
                deleteFromBegin();
                return;
            }
            while (index-- > 0 && temp != null) {
                temp = temp.next;
            }
            if (temp == null || temp == tail) {
                deleteFromEnd();
                return;
            } else {
                BidirectionalListElement<T> prevTemp = temp.prev;
                BidirectionalListElement<T> nextTemp = temp.next;
                prevTemp.next = nextTemp;
                nextTemp.prev = prevTemp;
                length--;
            }
        }
    }

    public int length() {
        return length;
    }

    private BidirectionalListElement<T> find(int index) {
        BidirectionalListElement<T> result = head;
        if (head == null) {
            return null;
        }
        if (index <= 0) {
            return head;
        }
        while (index-- > 0 && result != null) {
            result = result.next;
        }
        if (null == result || result == tail) {
            return tail;
        }
        return result;
    }

    public T getData(int index) {
        return find(index).data;
    }

    public void setData(int index, T data) {
        BidirectionalListElement<T> temp = find(index);
        if (temp != null) {
            temp.data = data;
        }
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {

            private BidirectionalListElement<T> element = head;

            @Override
            public boolean hasNext() {
                return element != null;
            }

            @Override
            public T next() {
                T result = element.data;
                element = element.next;
                return result;
            }
        };
        return iterator;
    }
}
