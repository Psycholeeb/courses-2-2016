package com.courses.spalah;

import java.io.BufferedReader;
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
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String symbol = reader.readLine();
        if ("*".equals(symbol)) {
            symbol = "\\*";
        }
        if ("+".equals(symbol)) {
            symbol = "\\+";
        }

        String[] digits = str.split(symbol);

        boolean result = false;
        for (int i = digits.length - 1; i > 0; i--) {
            if (Integer.parseInt(digits[i]) - Integer.parseInt(digits[i - 1]) == 1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}
