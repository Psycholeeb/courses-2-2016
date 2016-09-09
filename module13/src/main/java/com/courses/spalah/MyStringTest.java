package com.courses.spalah;

import com.courses.spalah.Task2.MyString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Artem Uskov on 01.09.2016.
 */
public class MyStringTest {

    public static void main(String[] args) {
        char[] inputchars = readFromConsole();
        MyString string1 = new MyString(inputchars);
        string1.reverse();
        string1.print();
        System.out.println();
        System.out.print(string1.length());
        System.out.println();
        System.out.print(string1.getByIndex(5));
    }

    public static char[] readFromConsole() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferRead.readLine();
            String[] strArray = input.split("\\s");
            char[] newchar = new char[strArray.length];
            for(int i = 0; i < strArray.length; i++) {
                newchar[i] = strArray[i].charAt(0);
            }
            return newchar;
        } catch (IOException e) {
            return new char[0];
        }
    }
}
