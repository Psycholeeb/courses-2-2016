package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ievgen Tararaka
 */
public class Calculator {

    private double buffer;

    public static void main(String[] args) {
        System.out.println("Start calculator");
        Calculator calculator = new Calculator();
        String[] input;
        double result;
        do {
            System.out.print("<<<");
            input = readFromConsole();
            if (input[0].equals("exit"))
                break;
            try {
                result = calculator.calculate(input);
                System.out.println(">>> Result: " + result);
            } catch (NumberOfOperandsException | UnsupportedOperationException | DivisionByZeroException e) {
            }
        } while (true);
        System.out.println("Good-bye!");
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

    public double calculate(String[] input) throws NumberOfOperandsException, UnsupportedOperationException, DivisionByZeroException {
        String operation = "";
        double firstOperand = 0;
        double secondOperand = 0;
        int numberOfArguments = input.length;

        if (input[0].equalsIgnoreCase("c")) {
            buffer = 0;
            return buffer;
        }

        if (numberOfArguments == 2) {
            operation = input[0];
            firstOperand = buffer;
            secondOperand = Double.parseDouble(input[1]);
        }

        if (numberOfArguments == 3) {
            operation = input[1];
            firstOperand = Double.parseDouble(input[0]);
            secondOperand = Double.parseDouble(input[2]);
        }

        switch (operation) {
            case "+":
                add(firstOperand, secondOperand);
                break;
            case "-":
                subtract(firstOperand, secondOperand);
                break;
            case "*":
                multiply(firstOperand, secondOperand);
                break;
            case "/":
                divide(firstOperand, secondOperand);
                break;
            default:
                throw new UnsupportedOperationException();
        }

        return buffer;
    }

    public double add(double a, double b) {
        buffer = a + b;
        return buffer;
    }

    public double subtract(double a, double b) {
        buffer = a - b;
        return buffer;
    }

    public double multiply(double a, double b) {
        buffer = a * b;
        return buffer;
    }

    public double divide(double a, double b) throws DivisionByZeroException {
        if (b == 0)
            throw new DivisionByZeroException();
        buffer = a / b;
        return buffer;
    }

    public void clear(){
        buffer = 0;
    }

    public class UnsupportedOperationException extends Exception {
        public UnsupportedOperationException() {
            System.out.println("No such operation supported.");
        }
    }

    public class NumberOfOperandsException extends Exception {
        public NumberOfOperandsException() {
            System.out.println("Wrong number of operands.");
        }
    }

    public class DivisionByZeroException extends Exception {
        public DivisionByZeroException() {
            System.out.println("Can't divide by zero.");
        }
    }
}
