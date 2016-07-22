package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
    public static void main(String[] args) {
        boolean equal = true;
        int n = 0;
        String[] inputstr = readFromConsole();

        while (n < inputstr.length - 1 & equal == true) {
            for (int i = 0; i < inputstr.length; i++) {
                if (Integer.parseInt(inputstr[i]) == Integer.parseInt(inputstr[0]) + i) {
                    n ++;
                }
                else {
                    equal = false;
                    break;
                }

            }
        }
            System.out.println("Ответ - " + equal);

    }

    private static String[] readFromConsole() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Строка - ");
            String input = bufferRead.readLine();
            System.out.print("Символ - ");
            String separate = bufferRead.readLine();
            return input.split(separate);
        } catch (IOException e) {
            return new String[]{""};
        }
    }
}
