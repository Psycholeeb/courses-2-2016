package com.courses.spalah.homework3;

/**
 * Created by Татьяна on 31.08.2016.
 */
class Node<E> {
    private Node next;
    private Node previous;
    private E element;

    public Node() {
    }

    //    public Node(Node<E> previous, Node<E> next) {
//        this.previous = previous;
//        this.next = next;
//        element = null;
//    }

    public Node(E element, Node<E> previous, Node<E> next) {
        this.element = element;
        this.previous = previous;
        this.next = next;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public E getElement() {
        return element;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
