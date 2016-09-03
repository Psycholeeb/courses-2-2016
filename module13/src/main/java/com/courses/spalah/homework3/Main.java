package com.courses.spalah.homework3;

/**
 * Created by Татьяна on 31.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyLinkedList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("abc");
        myList.add("11f");
        System.out.println(myList.size());
        System.out.println(myList);
        System.out.println(myList.get(2));
        myList.add(0, "*");
        myList.add(5, "*");
        myList.set(3, null);
        System.out.println(myList);
        myList.remove(6);
        System.out.println(myList);
        System.out.println(myList.contains("11f"));

    }
}
