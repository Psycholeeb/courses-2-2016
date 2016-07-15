package com.courses.spalah;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        String symbol = reader.readLine();
        square(size, symbol);
        System.out.println();
        triangle1(size, symbol);
        System.out.println();
        triangle2(size, symbol);
        System.out.println();
        triangle3(size, symbol);
        System.out.println();
        triangle4(size, symbol);

    }

    public static void square(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void triangle1(int size, String symbol) {
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < count ; j++) {
                System.out.print(symbol+" ");
            }
            count++;
            System.out.println();
        }
    }

    public static void triangle2(int size, String symbol) {
        int count = size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < count ; j++) {
                System.out.print(symbol+" ");
            }
            count--;
            System.out.println();
        }
    }

    public static void triangle3(int size, String symbol) {

        int emptySpase = size-1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                if(emptySpase>j){
                    System.out.print("  ");
                }
                else {
                    System.out.print(symbol+" ");
                }
            }
            emptySpase--;
            System.out.println();
        }
    }

    public static void triangle4(int size, String symbol) {
        int emptySpase = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                if(emptySpase>j){
                    System.out.print("  ");
                }
                else {
                    System.out.print(symbol+" ");
                }
            }
            emptySpase++;
            System.out.println();
        }
    }
}


