package com.courses.spalah.homework;

import java.util.Arrays;

/**
 * @author Ievgen Tararaka
 */
public class RubberIntArray {
    private int[] ints = new int[10];
    private int size = 0;

    /**
     * Добавляет элемент в массив. Если размер массива не позволяет добавить элемент - его необходимо увеличить на 5.
     *
     * @param i элемент, который необходимо добавить в массив
     */
    public void add(int i) {
        if(size == ints.length) {
            ints = Arrays.copyOf(ints, ints.length + 5);
        }
        ints[size] = i;
        size ++;
    }

    public int getByIndex(int index) {
        return ints[index];
    }
}
