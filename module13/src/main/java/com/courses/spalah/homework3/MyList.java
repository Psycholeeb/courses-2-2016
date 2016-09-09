package com.courses.spalah.homework3;

/**
 * Created by Татьяна on 31.08.2016.
 */
public interface MyList<E> extends Iterable<E> {
    int size();

    boolean isEmpty();

    boolean add(E element);

    boolean add(int index, E element);

    void remove(int index);

    E get(int index);

    E set(int index, E element);

    boolean contains(E element);
}
