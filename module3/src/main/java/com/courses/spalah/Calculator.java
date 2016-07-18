package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ievgen Tararaka
 */
public class Calculator {

    private static float result;
    private static boolean exit = true;

    public static void main(String[] args) {
        System.out.println("Start calculator");
        while (exit) {
            float res = calc();
            if (exit) {
                System.out.println(res);
            }
        }
    }

    public static float calc() {
        String[] input = readFromConsole();
        float arg1 = 0;
        String op = "";
        float arg2 = 0;

        if (input.length == 2) {
            op = input[0];
            arg1 = result;
            arg2 = Float.parseFloat(input[1]);
        }
        if (input.length == 3) {
            op = input[1];
            arg1 = Float.parseFloat(input[0]);
            arg2 = Float.parseFloat(input[2]);
        }
        if (input[0].equals("exit")) {
            exit = false;

        }

        switch (op) {
            case "+":
                result = arg1 + arg2;
                break;
            case "-":
                result = arg1 - arg2;
                break;
            case "*":
                result = arg1 * arg2;
                break;
            case "/":
                result = arg1 / arg2;
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