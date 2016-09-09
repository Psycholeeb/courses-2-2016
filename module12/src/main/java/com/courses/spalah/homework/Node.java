package com.courses.spalah.homework;

import java.util.Objects;

/**
 * Created by Artem Uskov on 01.09.2016.
 */
public class Node<E> {

    private E element;
    private Node<E> prev;
    private Node<E> next;

    Node(Node<E> prev, E element, Node<E> next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    E getElement() {
        return element;
    }

    Node<E> getPrev() {
        return prev;
    }

    Node<E> getNext() {
        return next;
    }

    void setElement(E element) {
        this.element = element;
    }

    void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    void setNext(Node<E> next) {
        this.next = next;
    }

}
