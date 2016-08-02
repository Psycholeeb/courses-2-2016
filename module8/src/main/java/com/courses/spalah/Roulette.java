package com.courses.spalah;

import java.util.HashMap;
import java.util.Map;
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

    public int winningCell() {
        return new Random().nextInt(38);
    }

    public void print() {
        for (Cell cell : cells) {
            System.out.println(cell);
        }
    }

    public void printWinningCell() {
        System.out.println("WINNING CELL:" + cells[winningCell()]);
    }
}
