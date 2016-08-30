package com.courses.spalah;

/**
 * Класс который представляет рулетку
 */
public class Roulette {
    Cell[] cells = new Cell[37];
    private int rand;

    public void generate() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = new Cell();
            cells[i].setCellNumber(i);
        }
        rand = (int) (Math.random() * cells.length);
        cells[rand].getColor();
    }

    public void print() {
        System.out.println(rand + "-" + cells[rand].getColor());
    }

    public int getRand (){
        return rand;
    }

    public String getWinColor (){
        return cells[rand].getColor();
    }
}

