package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
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
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int length;
        String[][] array;
        try {
            while (true) {
                System.out.println("Введите размер массива: ");
                input = reader.readLine();

                if (input.equals("exit"))
                    break;

                length = Integer.parseInt(input);
                array = new String[length][length];

                System.out.println("Введите символ: ");
                input = reader.readLine();

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = input;
                    }
                }

                printSquare(array);
                System.out.println();

                printTriangle1(array);
                System.out.println();

                printTriangle2(array);
                System.out.println();

                printTriangle3(array);
                System.out.println();

                printTriangle4(array);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printSquare(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printTriangle1(String[][] a) {
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
            count++;
        }
    }

    public static void printTriangle2(String[][] a) {
        int count = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
            count--;
        }
    }

    public static void printTriangle3(String[][] a) {
        int count = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j < count) {
                    System.out.print("\t");
                } else
                    System.out.print(a[i][j] + "\t");
            }
            System.out.println();
            count--;
        }
    }

    public static void printTriangle4(String[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j < count) {
                    System.out.print("\t");
                } else
                    System.out.print(a[i][j] + "\t");
            }
            System.out.println();
            count++;
        }
    }


}
