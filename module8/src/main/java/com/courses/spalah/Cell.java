package com.courses.spalah;

/**
 * Класс который представляет ячейку на рулетке
 */
public class Cell {
    int number;
    Color color;

    public Cell(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return number + "-" + color;
    }
}
