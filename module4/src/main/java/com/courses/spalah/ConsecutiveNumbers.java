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
    public static void main(String[] args) {
        String string = "";
        String symbol = "";
        Boolean result = true;
        while(true) {
            result = true;
            string = readFromConsole();
            if(string.toLowerCase().trim() == "exit\n")
                System.exit(0);
            else {
                symbol = readFromConsole();
                String[] str1 = string.split(symbol);
                for(int i=0;i<str1.length-1;i++)
                        if(Integer.parseInt(str1[i])+1 != Integer.parseInt(str1[i+1]))
                            result = false;
                System.out.println(result);
                }
            }
    }
    public static String readFromConsole() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferRead.readLine();
            return input;
        } catch (IOException e) {
            return "";
        }
    }
}
