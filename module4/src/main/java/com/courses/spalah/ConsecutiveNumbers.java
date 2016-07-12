package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ievgen Tararaka
 */
public class ConsecutiveNumbers {
    /**
     * Написать программу, которая отвечает на вопрос:
     * "Содержит ли введенная строка правильную последовательность цифр?"
     *
     * Входные параметры программы:
     * 1. Строка с числами (только целые числа, которые не больше, чем int)
     * 2. Разделительный символ для этой строки. Разделительный символ в строке может быть любой, пустой в том числе.
     *
     * Например:
     * Строка - 1*2*3*6*7
     * Символ - *
     * Ответ - false
     *
     * @param args - аргументы коммандной строки
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку с числами: ");
        String str = bufferRead.readLine();

        System.out.println("Введите разделительный символ: ");
        String sym = bufferRead.readLine();

        System.out.println(check(str, sym));


    }

    public static boolean check(String str, String sym) {
        boolean result = true;

        int[] intArray;

        if (sym.equals("")) {
            char[] charArray = str.toCharArray();
            intArray = new int[charArray.length];

            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = Character.getNumericValue(charArray[i]);
            }
        } else {
            if (sym.equals("*"))
                sym = "\\*";

            String[] strArray = str.split(sym);
            intArray = new int[strArray.length];

            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
        }

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] != ++intArray[i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
