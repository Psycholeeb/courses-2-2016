package com.courses.spalah.homework;

/**
 * @author Ievgen Tararaka
 */
public class RubberIntArray {
    private int[] ints = new int[2];
    private int size = 0;

    /**
     * Добавляет элемент в массив. Если размер массива не позволяет добавить элемент - его необходимо увеличить на 5.
     *
     * @param i элемент, который необходимо добавить в массив
     */
    public void add(int i) {
        int[] tmpInts;
        if (size < ints.length) {
            ints[size] = i;
            size++;
        } else {
            tmpInts = new int[ints.length + 5];
            System.arraycopy(ints, 0, tmpInts, 0, ints.length);
            ints = tmpInts;
            ints[size] = i;
            size++;
        }
    }

    public int getByIndex(int index) {

        return ints[index];
    }

}
