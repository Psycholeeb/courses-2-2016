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
        float result = 0;
        String oper = "";
        float first = 0;
        float second = 0;
        boolean exit = false;

        while (exit == false) {
            String[] inputstr = readFromConsole();
            if (inputstr[0].equals("exit")) {
                exit = true;
                break;
            }
            else {
                if (inputstr.length == 3) {
                    first = Float.parseFloat(inputstr[0]);
                    second = Float.parseFloat(inputstr[2]);
                    oper = inputstr[1];
                }
                if (inputstr.length == 2) {
                    oper = inputstr[0];
                    first = result;
                    second = Float.parseFloat(inputstr[1]);
                }
                result = doCalculate(first, second, oper);
                System.out.println(result);
            }
        }
    }

    public static float doCalculate (float first, float second, String oper) {
        float result = 0;
        switch (oper.charAt(0)) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '/':
                result = first / second;
                break;
            case '*':
                result = first * second;
                break;
            default:
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
