package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class PrintMatrix {
    /**
     * Написать программу, печатает двумерный массив заданного размера
     * квадратом и 4-мя треугольниками.
     * <p>
     * Входные параметры программы:
     * 1. Размер массива
     * 2. Символ для печати
     * <p>
     * Пример
     * Размер массива - 5
     * Символ для печати - #
     * <p>
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
     * <p>
     * #
     * # #
     * # # #
     * # # # #
     * # # # # #
     * <p>
     * # # # # #
     * # # # #
     * # # #
     * # #
     * #
     * <p>
     * #
     * # #
     * # # #
     * # # # #
     * # # # # #
     * <p>
     * # # # # #
     * # # # #
     * # # #
     * # #
     * #
     *
     * @param args - размер массива
     */
    public static void main(String[] args) {

        int size = 5;

        for(int i = 0; i < size; i++) {
            for(int k = 0; k < size; k++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int b = 0; b < i + 1; b++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }

        for (int i = size; i >= 0; i--) {
            for (int b = 0; b < i + 1; b++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for(int i = 0; i <= size; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = size; k >= i; k--)
            {
                System.out.print("#");
            }
            System.out.println();
   }
}
}




