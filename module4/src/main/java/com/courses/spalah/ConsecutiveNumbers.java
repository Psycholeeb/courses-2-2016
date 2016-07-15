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
     * <p>
     * Входные параметры программы:
     * 1. Строка с числами (только целые числа, которые не больше, чем int)
     * 2. Разделительный символ для этой строки. Разделительный символ в строке может быть любой, пустой в том числе.
     * <p>
     * Например:
     * Строка - 1*2*3*6*7
     * Символ - *
     * Ответ - false
     *
     * @param args - аргументы коммандной строки
     */
    public static void main(String[] args) throws IOException {
        boolean result = true;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку с числами: ");
        String str = bufferRead.readLine();

        System.out.println("Введите разделительный символ: ");
        String sym = bufferRead.readLine();

        String[] strings = str.split(sym);
        int[] array = new int[strings.length];
        array[0] = Integer.parseInt(strings[0]);
        for (int i = 1; i < array.length; i++) {
            array[i] = Integer.parseInt(strings[i]);
            if (array[i] != array[i - 1] + 1) {
                result = false;
                break;
            }
        }
        System.out.println("Result: " + result);
    }
}
