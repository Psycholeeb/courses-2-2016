package com.courses.spalah.homework3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Татьяна on 31.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyLinkedList<>();
        System.out.println(myList.size());
        if(myList.isEmpty()){
            System.out.println("Empty");
        }

        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("abc");
        myList.add("11f");
        System.out.println(myList.size());
        System.out.println(myList);
        System.out.println(myList.get(4));
        myList.add(0, "*");
        myList.set(3,"*");
        System.out.println(myList);
        myList.remove(4);
        System.out.println(myList);
        System.out.println(myList.contains("11f"));

    }
}
