package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ievgen Tararaka
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Start calculator");
        float prev = 0.0f;
        float arg1 = 0.0f;
        float arg2 = 0.0f;
        String operator = "";
        float result = 0.0f;
        while (true) {
            String[] array = readFromConsole();
            if ("exit".equals(array[0])) {
                break;
            }
            if (array.length == 2) {
                arg1 = prev;
                arg2 = Float.parseFloat(array[1]);
                operator = array[0];
            }
            if (array.length == 3) {
                arg1 = Float.parseFloat(array[0]);
                arg2 = Float.parseFloat(array[2]);
                operator = array[1];
            }
            result = culc(arg1, arg2, operator);
            prev = result;
            System.out.println(result);
        }
    }

    public static float culc(float a, float b, String operator) {
        float result = 0;
        switch (operator.charAt(0)) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        return result;
    }

    public static String[] readFromConsole() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferRead.readLine();
            return input.split("\\s");
        } catch (IOException e) {
            return new String[]{""};
        }
    }
}
