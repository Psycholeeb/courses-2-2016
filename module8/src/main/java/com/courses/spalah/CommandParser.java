package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class CommandParser {
    public Command getCommand(String[] arguments) {
        Command command = null;
        if ("START_GAME".equals(arguments[0])) {
            command = new StartGameCommand();
        }
        if ("BET".equals(arguments[0])) {
            command = new BetCommand();
        }
        if ("EXIT".equals(arguments[0])) {
            command = new ExitCommand();
        }
        if ("NEW_USER".equals(arguments[0])) {
            command = new NewUserCommand();
        }
        command.setArguments(arguments);
        return command;
    }
}
