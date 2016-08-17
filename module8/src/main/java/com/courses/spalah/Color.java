package com.courses.spalah;

/**
 * Created by Татьяна on 01.08.2016.
 */
public enum Color {
    RED, BLACK, GREEN;

    public Color setColor(boolean n) {
        if (n) {
            return RED;
        } else
            return BLACK;
    }
}
