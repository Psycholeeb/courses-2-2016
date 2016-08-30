package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class BetCommand extends Command {
    @Override
    public void execute() {
        try {
           if (arguments.length == 4){
               getRouletteTable().addBets(new Bets(getArguments()[1], Double.parseDouble(getArguments()[2]),
                       (getArguments()[3])));
           }
            if (arguments.length == 5) {
                getRouletteTable().addBets(new Bets(getArguments()[1], Double.parseDouble(getArguments()[2]),
                        (getArguments()[3]), Integer.parseInt(getArguments()[4])));
            }
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e){
            System.out.println("Некорректно введены данные. Пример: \"Имя игрока ставка тип ставки\"");
        }
    }
}
