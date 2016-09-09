package spalah;

import com.courses.spalah.homework.MyList;

import java.util.Iterator;

/**
 * Created by Татьяна on 20.08.2016.
 */
public class MyLinkedList<T> implements MyList<T> {
    private Node<T> first;
    private Node<T> last;
    private Node<T> next;
    private Node<T> current;
    private int size;

    public MyLinkedList() {
        first = new Node<T>(null);
        last = first;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first.getNext() == null;
    }

    @Override
    public boolean add(T element) {
        Node<T> newNode = new Node<T>(element, null);
        last.setNext(newNode);
        last = newNode;
        size++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        Node<T> newNode = new Node<T>(element, null);
        current = getNode(index - 1);
        next = current.getNext();
        current.setNext(newNode);
        newNode.setNext(next);
        size++;
    }

    @Override
    public void remove(int index) {
        current = getNode(index - 1);
        next = current.getNext();
        if (next == last) {
            last = current;
        }
        current.setNext(next.getNext());
        size--;
    }

    @Override
    public T get(int index) {
        current = getNode(index);
        return current.getValue();
    }

    @Override
    public T set(int index, T element) {
        current = getNode(index);
        current.setValue(element);
        return current.getValue();
    }

    @Override
    public boolean contains(T element) {
        current = first;
        while (current.getNext() != null) {
            current = current.getNext();
            if (current.getValue().equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "";
        current = first;
        while (current.getNext()!=null){
            current = current.getNext();
            str+=current.getValue().toString();
        }
        return str;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private Node<T> getNode(int index) {
        current = first;
        for (int i = 0; i <= index; i++) {
            current = current.getNext();
        }
        return current;
    }

    private class MyIterator implements Iterator<T> {
        Node<T> current = first;
        int index;

        @Override
        public boolean hasNext() {
            if (current.getNext() != null) {
                current = current.getNext();
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            index++;
            return current.getValue();
        }

        @Override
        public void remove() {
            index--;
            MyLinkedList.this.remove(index);
            size--;
        }
    }
}
