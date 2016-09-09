package com.courses.spalah.Task2;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Artem Uskov on 01.09.2016.
 */
public class MyString {

    private char[] chars;

    public MyString(char ... chars){
        this.chars = chars;
    }

    public void print() {
        System.out.print(Arrays.toString(chars));
    }

    public void reverse() {
        int j = 0;
        int i = chars.length - 1;
        char c;
        while(i >= j) {
            c = chars[j];
            chars[j] = chars[i];
            chars[i] = c;
            j++;
            i--;
        }
    }

    public int length() {
        return chars.length;
    }

    public char getByIndex(int index) {
          return chars[index];
    }
}
