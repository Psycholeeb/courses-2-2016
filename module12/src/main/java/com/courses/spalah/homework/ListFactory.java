package com.courses.spalah.homework;

/**
 * @author Ievgen Tararaka
 */
public class ListFactory {
    public static <E> MyCustomList<E> createList(ListType listType) {
        if (listType == ListType.SINGLY_LINKED_LIST) {
            // возвращаем вашу имплементацию односвязного списка
            return new MyCustomList<E>();
        }
        return null;
    }
}
