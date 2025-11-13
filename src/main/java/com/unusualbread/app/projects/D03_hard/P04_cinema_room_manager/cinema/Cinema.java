package com.unusualbread.app.projects.D03_hard.P04_cinema_room_manager.cinema;

import com.unusualbread.app.projects.D03_hard.P04_cinema_room_manager.controller.CinemaController;

import java.util.Scanner;

public class Cinema {
    private final int defaultPrice;
    private final int promotionalPrice;
    private final int seatThreshold;
    private final int rows;
    private final int cols;
    private final int totalSeats;
    private final char[][] seats;
    private final int totalIncome;

    public Cinema(int defaultPrice, int promotionalPrice, int seatThreshold, int rows, int cols, int totalSeats, char[][] seats, int totalIncome) {
        this.defaultPrice = defaultPrice;
        this.promotionalPrice = promotionalPrice;
        this.seatThreshold = seatThreshold;
        this.rows = rows;
        this.cols = cols;
        this.totalSeats = totalSeats;
        this.seats = seats;
        this.totalIncome = totalIncome;
    }

    private int soldCount = 0;
    private int currentIncome = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CinemaController cinemaController = new CinemaController();

        cinemaController.ask("Enter the number of rows:");
        int rows = cinemaController.getRowsNumber(sc);

        cinemaController.ask("Enter the number of seats in each row:");
        int cols = cinemaController.getColsNumber(sc);

        System.out.println();

        int totalSeats = cinemaController.calculateTotalSeats(rows, cols);

        char[][] seats = cinemaController.getInitSeats(rows, cols);

        int seatThreshold = 60;

        int defaultPrice = 10;

        int promotionalPrice = 8;

        int totalIncome = cinemaController.calculateTotalIncome(totalSeats, seatThreshold, defaultPrice, rows, cols, promotionalPrice);

        Cinema cinema = new Cinema(10, 8, seatThreshold, rows, cols, totalSeats, seats, totalIncome);

        cinemaController.run(sc, cinema);

        sc.close();
    }

    public int getDefaultPrice() {
        return defaultPrice;
    }

    public int getPromotionalPrice() {
        return promotionalPrice;
    }

    public int getSeatThreshold() {
        return seatThreshold;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public char[][] getSeats() {
        return seats;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(int soldCount) {
        this.soldCount = soldCount;
    }

    public int getTotalIncome() {
        return totalIncome;
    }

    public int getCurrentIncome() {
        return currentIncome;
    }

    public void setCurrentIncome(int currentIncome) {
        this.currentIncome = currentIncome;
    }
}
