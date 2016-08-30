package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class CommandParser {
    public Command getCommand(String[] arguments) {
        Command command = null;
        try {
            if ("START_GAME".equals(arguments[0])) {
                command = new StartGameCommand();
            } else if ("NEW_USER".equals(arguments[0])) {
                command = new NewUserCommand();
            } else if ("BET".equals(arguments[0])) {
                command = new BetCommand();
            } else if ("EXIT".equals(arguments[0])) {
                command = new ExitCommand();
            } else {
               return null;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return  null;
        }
        command.setArguments(arguments);
        return command;
    }
}
