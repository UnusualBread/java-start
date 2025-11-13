package com.unusualbread.app.projects.D04_challenging.P03_battleship.battleship.game;

public class Player {
    private final String name;
    private final Board board;
    private final Board fogBoard;
    private final Ship[] ships;
    private static final int maxShips = 5;
    private int currentShips = 0;

    public Player(String name) {
        this.name = name;
        board = new Board();
        fogBoard = new Board();
        ships = new Ship[maxShips];
    }

    public void placeShip(Ship ship) {
        for (int[] cell : ship.getCells()) {
            board.setCell(cell[0], cell[1], 'O');
        }
        ships[currentShips++] = ship;
    }

    public boolean canPlaceShip(Ship newShip) {
        for (Ship existingShip : ships) {
            if (existingShip != null && areShipsTouchOrOverlap(existingShip, newShip)) {
                return false;
            }
        }
        return true;
    }

    private boolean areShipsTouchOrOverlap(Ship existingShip, Ship newShip) {
        for (int[] existingCell : existingShip.getCells()) {
            for (int[] newCell : newShip.getCells()) {
                if (Math.abs(existingCell[0] - newCell[0]) <= 1 && Math.abs(existingCell[1] - newCell[1]) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean shoot(int[] shotCords, Player opponent) {
        char cell = opponent.board.getCell(shotCords[0], shotCords[1]);
        if (cell == 'O') {
            opponent.board.setCell(shotCords[0], shotCords[1], 'X');
            opponent.fogBoard.setCell(shotCords[0], shotCords[1], 'X');
            return true;
        } else if (cell == '~'){
            opponent.board.setCell(shotCords[0], shotCords[1], 'M');
            opponent.fogBoard.setCell(shotCords[0], shotCords[1], 'M');
            return false;
        } else {
            return cell == 'X';
        }
    }

    public boolean checkIfShipSunk() {
        for (Ship ship : ships) {
            if (!ship.isSunk()) {
                ship.validateState(board);
                if (ship.isSunk()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean allShipsSunk() {
        for (Ship ship : ships) {
            for (int[] cell : ship.getCells()) {
                if (board.getCell(cell[0], cell[1]) == 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard() {
        board.print();
    }

    public void printFogBoard() {
        fogBoard.print();
    }

    public String getName() {
        return name;
    }
}
