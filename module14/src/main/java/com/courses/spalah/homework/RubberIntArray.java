package com.courses.spalah.homework;

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
        // TODO ваш код должен быть тут
        boolean flag = false;
        for(int j=0;j<ints.length && !flag;j++) {
            if(ints[j] == 0) {
                ints[j] = i;
                flag = true;
            }
        }
        if(!flag) {
            int[] ints2 = new int[ints.length+5];
            for(int j=0;j<ints.length && !flag;j++) {
                ints2[j] = ints[j];
            }
            ints2[ints.length+1] = i;
        }
        size ++;
    }

    public int getByIndex(int index) {
        return ints[index];
    }
}
