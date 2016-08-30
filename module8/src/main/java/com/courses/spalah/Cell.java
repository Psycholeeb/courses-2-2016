package com.courses.spalah;

import java.util.Random;

/**
 * Класс который представляет ячейку на рулетке
 */
public class Cell {
    private int cellNumber = 0;
    private boolean isRed = false;

    public void setCellNumber(int cellNumber){
          this.cellNumber = cellNumber;
    }

    public void setIsRed(boolean isRed){
        this.isRed = isRed;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public boolean getIsRed() {
        return isRed;
    }

    public void print(){
        System.out.print(cellNumber + "(");
        if (cellNumber == 0) {
            System.out.print("Green), ");
        }
        if (isRed == true) {
            System.out.print("Red), ");
        }
        if (isRed == false & cellNumber != 0) {
            System.out.print("Black), ");
        }
    }
}
