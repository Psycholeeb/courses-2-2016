package com.courses.spalah.homework3;

/**
 * Created by Татьяна on 31.08.2016.
 */
class Node<E> {
    private Node<E> next;
    private Node<E> previous;
    private E element;

     Node() {
    }

     Node(E element, Node<E> previous, Node<E> next) {
        this.element = element;
        this.previous = previous;
        this.next = next;
    }

    Node<E> getNext() {
        return next;
    }

     Node<E> getPrevious() {
        return previous;
    }

     E getElement() {
        return element;
    }

     void setNext(Node<E> next) {
        this.next = next;
    }

     void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

     void setElement(E element) {
        this.element = element;
    }
}
