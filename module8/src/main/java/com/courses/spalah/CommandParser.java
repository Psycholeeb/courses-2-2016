package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class CommandParser {
    public Command getCommand(String[] arguments) {
        Command command = null;
        // создаем разные типы комманд в зависимости от аргументов
                if (arguments[0].equalsIgnoreCase("exit")) {
                    command = new ExitCommand();
                }
                if (arguments[0].equalsIgnoreCase("new_user") || arguments[0].equalsIgnoreCase("add_user")) {
                    command = new NewUserCommand();
                }
                if (arguments[0].equalsIgnoreCase("bet")) {
                    command = new BetCommand();
                }
                if (arguments[0].equalsIgnoreCase("play_game") || arguments[0].equalsIgnoreCase("start_game") ||
                        arguments[0].equalsIgnoreCase("play") || arguments[0].equalsIgnoreCase("start") || arguments[0].equalsIgnoreCase("s")){
                    command = new StartGameCommand();
                }
                if (arguments[0].equalsIgnoreCase("users")) {
                    command = new UsersCommand();
                }
                command.setArguments(arguments);

        return command;
    }
}
