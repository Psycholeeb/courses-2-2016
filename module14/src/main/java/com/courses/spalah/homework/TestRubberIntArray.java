package com.courses.spalah.homework;

/**
 * Created by Roman Kurilko on 06.09.2016.
 */
public class TestRubberIntArray {
    public static void main(String [] args) {
        RubberIntArray arr1 = new RubberIntArray ();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(8);
        arr1.add(9);
        arr1.add(10);
        arr1.add(11);
        arr1.add(12);
        arr1.add(13);
        arr1.add(14);
        arr1.add(15);
        arr1.add(16);
        System.out.println(arr1.getByIndex(0));
        System.out.println(arr1.getByIndex(15));
    }
}
