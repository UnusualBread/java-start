package projects.D04_challenging.P03_battleship.battleship.game;

public class Ship {
    private final ShipType type;
    private final int[][] cells;
    private boolean isSunk = false;

    public Ship(ShipType type, int[][] ends) {
        this.type = type;
        sortShipEnds(ends);
        this.cells = calculateCells(ends);
    }

    private void sortShipEnds(int[][] ends) {
        if (ends[0][0] > ends[1][0] || ends[0][1] > ends[1][1]) {
            int[] temp = ends[0];
            ends[0] = ends[1];
            ends[1] = temp;
        }
    }

    private int[][] calculateCells(int[][] ends) {
        int size = getSize();
        int[][] shipCells = new int[size][2];
        if (ends[0][0] == ends[1][0]) {
            for (int i = 0; i < size; i++) {
                shipCells[i][0] = ends[0][0];
                shipCells[i][1] = ends[0][1] + i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                shipCells[i][0] = ends[0][0] + i;
                shipCells[i][1] = ends[0][1];
            }
        }
        return shipCells;
    }

    public void validateState(Board board) {
        for (int[] cell : getCells()) {
            if (board.getCell(cell[0], cell[1]) == 'O') {
                return;
            }
        }
        isSunk = true;
    }

    public int[][] getCells() {
        return cells;
    }

    public int getSize() {
        return type.getSize();
    }

    public boolean isSunk() {
        return isSunk;
    }
}
