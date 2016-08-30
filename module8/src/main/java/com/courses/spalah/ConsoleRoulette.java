package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс-стартер для вашей реализации рулетки
 */
public class ConsoleRoulette {
    public static void main(String[] args) {
        Roulette roulette = new Roulette();
        RouletteTable rouletteTable = new RouletteTable();
        System.out.println("Добро пожаловать! Игра начнется, как только игроки сядут за стол");
        System.out.println("Ведите свое имя и баланс. Пример: \"NEW_USER Ivan 500\"");


        while(true) {
            String[] arguments = readFromConsole();
            CommandParser commandParser = new CommandParser();
            Command command = commandParser.getCommand(arguments);
            if(command != null ) {
                command.setRoulette(roulette);
                command.setRouletteTable(rouletteTable);
                command.execute();
            } else {
                System.out.println("Неизвестная команда");
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
