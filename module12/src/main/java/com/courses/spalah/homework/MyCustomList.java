package com.courses.spalah.homework;

import java.util.Iterator;

/**
 * Created by Artem Uskov on 22.08.2016.
 */
public class MyCustomList<E> implements MyList<E>{

    //private Node first;
    private int listCount;

//    public MyCustomList(Node first) {
//        this.first = first;
//        listCount = 0;
//    }

    public void myCustomList() {
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
