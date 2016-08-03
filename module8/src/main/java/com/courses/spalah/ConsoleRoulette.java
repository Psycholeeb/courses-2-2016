package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс-стартер для вашей реализации рулетки
 */
public class ConsoleRoulette {
    public static void main(String[] args) {
        System.out.println("Game Started!");
        Roulette roulette = new Roulette();
        roulette.generate();
        roulette.print();
        Table table = new Table();


        while (true) {
            String[] arguments = readFromConsole();
            CommandParser commandParser = new CommandParser();
            try {
                Command command = commandParser.getCommand(arguments);
                command.setRoulette(roulette);
                command.setTable(table);
                command.execute();
            } catch (Exception ex) {
                System.out.println("Invalid command!");
            }
        }
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
