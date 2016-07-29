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
        float res = 0;


        while (true) {
            float arg1 = 0;
            String op = " ";
            float arg2 = 0;
            String arg[] = readFromConsole();

            if (arg.length == 3) {
                arg1 = Float.parseFloat(arg[0]);
                op = (arg[1]);
                arg2 = Float.parseFloat(arg[2]);
                res = cul(arg1, arg2, op);
            }

            if (arg.length == 2) {
                op = (arg[0]);
                arg2 = Float.parseFloat(arg[1]);
                res = cul(res, arg2, op);

            }

            System.out.println(res);

            if (arg[0].equals("exit")) {
                System.out.println("exit");
                break;

            }
        }
    }


    public static float cul(float arg1, float arg2, String op) {
        float result = 0;
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

    public static float culc(float a, float b, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
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


