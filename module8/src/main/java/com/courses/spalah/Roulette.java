package com.courses.spalah;

import java.util.ArrayList;
import java.util.Random;

/**
 * Класс который представляет рулетку
 */
public class Roulette {
   private ArrayList<Bets> winningBets = new ArrayList<>();
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

    public ArrayList<Bets> getWinningBets() {
        return winningBets;
    }

    public void setWinningBets(Cell cell) {
        if (cell.getNumber() % 2 == 0) {
            winningBets.add(Bets.EVEN);
        } else {
            winningBets.add(Bets.ODD);
        }
        if (cell.getColor() == Color.BLACK) {
            winningBets.add(Bets.BLACK);
        } else if (cell.getColor() == Color.RED) {
            winningBets.add(Bets.RED);
        }
        if (cell.getNumber() < 19) {
            winningBets.add(Bets.SMALL);
        } else if (cell.getNumber() > 18) {
            winningBets.add(Bets.BIG);
        }
    }

}
