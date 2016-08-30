package com.courses.spalah;

import java.util.*;

/**
 * Класс который представляет рулетку
 */
public class Roulette {
    Cell[] cells = new Cell[37];

    public void generate() {
        // заполняем массив ячейками
        for (int i = 0; i < cells.length; i++) {
            cells[i] = new Cell();
            cells[i].setCellNumber(i);
        }
        List<Cell> tempList = new ArrayList<>();
        for (Cell i : cells) {
            tempList.add(i);
        }
        Collections.shuffle(tempList);
        for (int i = 0; i < 37; i++) {
            cells[i] = tempList.get(i);
        }
        for (int i = 1; i < 37; i++) {
            cells[i].setIsRed(true);
            i++;
        }
    }

    public Cell spinRoulette() {
        Cell cell = new Cell();
        Random randomCell = new Random();
        int random = randomCell.nextInt(cells.length);
        return cells[random];
    }


    public void print() {
        for (int i = 0; i < 37; i++) {
            cells[i].print();
        }
    }
}
