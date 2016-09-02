package com.courses.spalah.homework3;

import java.util.Iterator;

/**
 * Created by Татьяна on 31.08.2016.
 */
public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;
    private Node<E> last;
    private Node<E> current;
    private int size;

    public MyLinkedList() {
        first = new Node<E>();
        last = first;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean add(E element) {
        Node<E> newNode = new Node<>(element, null, null);
        if (isEmpty()) {
            first = newNode;
            last = first;
        } else {
            last.setNext(newNode);
            newNode.setPrevious(last);
            last = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        Node<E> newNode = new Node<>(element, null, null);
        if (index == 0) {
            current = first;
            current.setPrevious(newNode);
            newNode.setNext(current);
            first = newNode;
        } else {
            current = getNode(index);
            current.getPrevious().setNext(newNode);
            newNode.setPrevious(current.getPrevious());
            current.setPrevious(newNode);
            newNode.setNext(current);
            current = newNode;
        }
        size++;
        return true;
    }

    @Override
    public void remove(int index) {
        current = getNode(index);
        if (current == first) {
            first = current.getNext();
        } else if (current == last) {
            last = current.getPrevious();
        }
        else {
            current.getNext().setPrevious(current.getPrevious());
            current.getPrevious().setNext(current.getNext());
        }
        size--;
    }

    @Override
    public E get(int index) {
        current = getNode(index);
        return current.getElement();
    }

    @Override
    public E set(int index, E element) {
        current = getNode(index);
        current.setElement(element);
        return current.getElement();
    }

    @Override
    public boolean contains(E element) {
        current = first;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        current = first;
        builder.append("[")
                .append(current.getElement().toString());
        while (current.getNext() != null) {
            builder.append(", ");
            current = current.getNext();
            builder.append(current.getElement().toString());
        }
        builder.append("]");
        return builder.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private Node<E> getNode(int index) {
        if (size - index > index) {
            current = first;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
        } else {
            current = last;
            for (int i = size - 1; i > index; i--) {
                current = current.getPrevious();
            }
        }
        return current;
    }

    private class MyIterator implements Iterator<E> {
        Node<E> current = first;
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
        public E next() {
            index++;
            return current.getElement();
        }

        @Override
        public void remove() {
            index--;
            MyLinkedList.this.remove(index);
            size--;
        }
    }
}
