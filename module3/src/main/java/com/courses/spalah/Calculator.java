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
        String last_result = "";
        while(true) {
            String str0 = readFromConsole();
            /*for(int i=0;i<str0.split("\\s").length;i++)
                System.out.println(str0.split("\\s")[i]);*/
            if(str0.toLowerCase().trim() == "exit\n")
                System.exit(0);
            else {
                if(last_result != "" && last_result.split("\\s").length == 3) {
                    String[] str1 = (last_result+" "+str0).split("\\s");
                    last_result = doCalculation(str1);
                    System.out.println("The result is "+last_result);
                }
                else {
                    String[] str1 = str0.split("\\s");
                    last_result = doCalculation(str1);
                    System.out.println("The result is "+last_result);
                }
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
    public static String doCalculation(String[] str1) {
        switch (str1[1]) {
            case "+":
                return ""+(Double.parseDouble(str1[0])+Double.parseDouble(str1[2]));
            case "-":
                return ""+(Double.parseDouble(str1[0])-Double.parseDouble(str1[2]));
            case "*":
                return ""+(Double.parseDouble(str1[0])*Double.parseDouble(str1[2]));
            case "/":
                return ""+(Double.parseDouble(str1[0])/Double.parseDouble(str1[2]));
            default:
                return "Error! Type data in correct formft (number1 operator number2).";
        }
    }
    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}
