package com.courses.spalah;

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
    public static void main(String[] args) {
        String a = "1/2/3/4/5";
        boolean w = check(a);
        System.out.println(w);
    }

    public static boolean check(String a) {
        String[] b = a.split("/");
        boolean res = false;
        for (int i = 0; i < b.length - 1; i++) {
            int d = Integer.valueOf(b[i]);
            int e = Integer.valueOf(b[i + 1]);
            if (d - e != -1) {
            res = false;
            break;
        }
           res = true;
        }
        return res;
    }
}