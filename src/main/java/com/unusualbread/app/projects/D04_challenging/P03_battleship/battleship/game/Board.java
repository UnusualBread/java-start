package com.unusualbread.app.projects.D04_challenging.P03_battleship.battleship.game;

import java.util.Arrays;

public class Board {
    private static final int size = 10;
    private final char[][] cells;

    public Board() {
        cells = new char[size][size];
        init();
    }

    private void init() {
        for (char[] row : cells) {
            Arrays.fill(row, '~');
        }
    }

    public void print() {
        for (int i = 0; i < size + 1; i++) {
            for (int j = 0; j < size + 1; j++) {
                if (i == 0 && j == 0) System.out.print(" ");
                else if (i == 0) System.out.print(j);
                else if (j == 0) System.out.print((char) ('A' + i - 1));
                else System.out.print(cells[i - 1][j - 1]);
                if (j != size) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void setCell(int row, int col, char value) {
        cells[row][col] = value;
    }

    public char getCell(int row, int col) {
        return cells[row][col];
    }
}
