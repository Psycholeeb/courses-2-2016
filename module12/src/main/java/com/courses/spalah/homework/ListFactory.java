package com.courses.spalah.homework;

import spalah.MyLinkedList;

/**
 * @author Ievgen Tararaka
 */
public class ListFactory {
    public static <E> MyList<E> createList(ListType listType) {
        if (listType == ListType.SINGLY_LINKED_LIST) {

            return new MyLinkedList<>();
        }
        return null;
    }
}
