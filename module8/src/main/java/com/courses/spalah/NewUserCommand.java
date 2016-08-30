package com.courses.spalah;

import javafx.scene.control.Tab;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

/**
 * Created by Jeka on 29.07.2016.
 */
public class NewUserCommand extends Command {
    @Override
    public void execute() {
        try {
            getRouletteTable().hasPlace(new NewUsers(getArguments()[1],Integer.parseInt(getArguments()[2])));
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Некорректно введены данные. Пример: \"NEW_USER Name Balance\"");
        }
    }
}

