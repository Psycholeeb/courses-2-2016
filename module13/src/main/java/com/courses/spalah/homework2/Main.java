package com.courses.spalah.homework2;

/**
 * Created by Татьяна on 31.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyString myString1 = new MyString('a', 'b');
        MyString myString2 = new MyString('a', 'b','d','t');
        myString1.print();
        System.out.println(myString1.length());
        myString2.print();
        myString2.revers();
        myString2.print();
        System.out.println(myString2.getByIndex(2));
        System.out.println(myString2.getByIndex(5));
    }
}
