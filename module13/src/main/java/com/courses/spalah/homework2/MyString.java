package com.courses.spalah.homework2;

/**
 * Created by Татьяна on 31.08.2016.
 */
class MyString {
    private char[] chars;

    MyString(char... chars) {
        this.chars = chars;
    }

    void print() {
        System.out.println(new String(this.chars));
    }

    int length() {
        return chars.length;
    }

    char[] revers() {
        char[] reversChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversChars[i] = chars[chars.length - i - 1];
        }
        System.arraycopy(reversChars, 0, chars, 0, chars.length);
        return chars;
    }

    char getByIndex(int index) {
        char c = ' ';
        try {
            c = chars[index];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid index!");
        }
        return c;
    }

}
