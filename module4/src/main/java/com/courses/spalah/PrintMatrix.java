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
     *
     * Входные параметры программы:
     * 1. Размер массива
     * 2. Символ для печати
     *
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
     *         #
     *       # #
     *     # # #
     *   # # # #
     * # # # # #
     * <p>
     * # # # # #
     *   # # # #
     *     # # #
     *       # #
     *         #
     * @param args - размер массива
     */
    public static void main(String[] args) {
        int size= readMatrixSize();
        String symbol = readMatrixSymbol();
        printMatrix(size, symbol);
        printRectangle1(size, symbol);
        printRectangle2(size, symbol);
        printRectangle3(size, symbol);
        printRectangle4(size, symbol);
    }

    public static int readMatrixSize() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Размер массива - ");
            int mSize = (Integer.parseInt(bufferRead.readLine()));
            return mSize;
        } catch (IOException e) {
            return 0;
        }
    }
    public static String readMatrixSymbol() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Символ для печати - ");
            String mSymbol = (bufferRead.readLine());
            return mSymbol;
        } catch (IOException e) {
            return new String("");
        }
    }

    private static void printMatrix(int size, String symbol){
        for(int i = 0; i <= size; i++) {
            for(int j = 0; j <= size; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        System.out.println("<p>");
    }

    private static void printRectangle1(int size, String symbol) {
        for(int i = 0; i <= size; i++) {
            for(int j = 0; j <= size; j++){
                if (i <= j)
                    System.out.print(symbol + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("<p>");
    }

    private static void printRectangle2(int size, String symbol) {
        for(int i = 0; i <= size; i++) {
            for(int j = 0; j <= size; j++){
                if (i >= j)
                    System.out.print(symbol + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("<p>");
    }

    private static void printRectangle3(int size, String symbol) {
        for(int i = 0; i <= size; i++) {
            for(int j = 0; j <= size; j++){
                if (i >= size - j)
                    System.out.print(symbol + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("<p>");
    }

    private static void printRectangle4(int size, String symbol) {
        for(int i = 0; i <= size; i++) {
            for(int j = 0; j <= size; j++){
                if (i <= size - j)
                    System.out.print(symbol + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("<p>");
    }
}
