package com.courses.spalah;

import java.util.Random;

/**
 * Класс который представляет рулетку
 */
public class Roulette {
    Color color = Color.GREEN;
    Cell[] cells = new Cell[37];

    public void generate() {
        Color newColor;
        int count = 0;
        cells[0] = new Cell(0, color.GREEN);
        for (int i = 1; i < cells.length; i++) {
            newColor = color.setColor(new Random().nextBoolean());
            if (newColor == color.RED) {
                count++;
            }
            if (count < 19) {
                cells[i] = new Cell(i, newColor);
            } else {
                cells[i] = new Cell(i, color.BLACK);
            }
        }
    }

    public void print() {
        for (Cell cell : cells) {
            System.out.println(cell);
        }
    }

    public int winningCell() {
        return new Random().nextInt(38);
    }

    public Cell getWinningCell() {

        return cells[winningCell()];
    }

    public void printWinningCell() {
        System.out.println("Winning cell:" + cells[winningCell()]);
    }

}
