package com.courses.spalah.homework3;

import java.util.Iterator;

/**
 * Created by Татьяна on 31.08.2016.
 */
class MyLinkedList<E> implements MyList<E> {
    private Node<E> first = new Node<>();
    private Node<E> last = first;
    private int size;

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
            size++;
        } else {
            add(this.size, element);
        }
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        Node<E> newNode = new Node<>(element, null, null);
        Node<E> current;
        if (index == 0) {
            current = first;
            current.setPrevious(newNode);
            newNode.setNext(current);
            first = newNode;
        } else if (index == size) {
            current = last;
            current.setNext(newNode);
            newNode.setPrevious(current);
            last = newNode;
        } else {
            current = getNode(index);
            current.getPrevious().setNext(newNode);
            newNode.setPrevious(current.getPrevious());
            current.setPrevious(newNode);
            newNode.setNext(current);
        }
        size++;
        return true;
    }

    @Override
    public void remove(int index) {
        Node<E> current = getNode(index);
        if (current == first) {
            first = current.getNext();
        } else if (current == last) {
            last = current.getPrevious();
        } else {
            current.getNext().setPrevious(current.getPrevious());
            current.getPrevious().setNext(current.getNext());
        }
        size--;
    }

    @Override
    public E get(int index) {
        Node<E> current = getNode(index);
        return current.getElement();
    }

    @Override
    public E set(int index, E element) {
        Node<E> current = getNode(index);
        current.setElement(element);
        return current.getElement();
    }

    @Override
    public boolean contains(E element) {
        Node<E> current = first;
        for (int i = 0; i < size; i++) {
            if (element.equals(current.getElement())) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<E> current = first;
        builder.append("[")
                .append(getElement(current));
        for (int i = 1; i < size; i++) {
            builder.append(", ");
            current = current.getNext();
            builder.append(getElement(current));
        }
        builder.append("]");

        return builder.toString();
    }

    private String getElement(Node<E> node) {
        if (node.getElement() == null) {
            return "null";
        }
        return node.getElement().toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private Node<E> getNode(int index) {
        Node<E> current = null;
        boolean checkIndex = (index < size);
        if (checkIndex) {
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
        } else {
            System.out.println("Invalid index!");
        }
        return current;
    }

    private class MyIterator implements Iterator<E> {
        Node<E> current = first;
        int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            E element = current.getElement();
            current = current.getNext();
            index++;
            return element;
        }

        @Override
        public void remove() {
            MyLinkedList.this.remove(--index);
        }
    }
}
