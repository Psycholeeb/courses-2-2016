package com.courses.spalah;

import java.util.Random;

/**
 * Класс который представляет ячейку на рулетке
 */
public class Cell {
    private int cellNumber = 0;
    private String RED = "RED";
    private String BLACK = "BLACK";
    private String GREEN = "GREEN";

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getColor(){
        if (cellNumber <=18 && cellNumber > 0){
            return RED;
        }
        if (cellNumber == 0){
            return GREEN;
        }else {
            return BLACK;
        }
    }
}





