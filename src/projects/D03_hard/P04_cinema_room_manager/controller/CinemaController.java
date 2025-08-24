package projects.D03_hard.P04_cinema_room_manager.controller;

import projects.D03_hard.P04_cinema_room_manager.cinema.Cinema;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaController {
    public void ask(String message) {
        System.out.println(message);
    }

    public void bookSeat(int rowNumber, int seatNumber, Cinema cinema) {
        cinema.getSeats()[rowNumber - 1][seatNumber - 1] = 'B';
    }

    public int calculateTotalSeats(int rowsNumber, int colsNumber) {
        return rowsNumber * colsNumber;
    }

    public void printTicketPrice(int ticketPrice) {
        System.out.printf("\nTicket price: $%d\n", ticketPrice);
    }

    public int getTicketPrice(Cinema cinema, int rowNumber) {
        if (cinema.getTotalSeats() <= cinema.getSeatThreshold() || rowNumber <= cinema.getRows() / 2) {
            return cinema.getDefaultPrice();
        }
        return cinema.getPromotionalPrice();
    }

    public int getSeatNumber(Scanner sc) {
        return sc.nextInt();
    }

    public int getRowNumber(Scanner sc) {
        return sc.nextInt();
    }

    public void printSeats(Cinema cinema) {
        System.out.println("Cinema:");
        for (int i = 0; i < cinema.getRows() + 1; i++) {
            for (int j = 0; j < cinema.getCols() + 1; j++) {
                if (i == 0 && j == 0) System.out.print(' ');
                else if (i == 0) System.out.print(j);
                else if (j == 0) System.out.print(i);
                else System.out.print(cinema.getSeats()[i - 1][j - 1]);
                if (j != cinema.getCols()) System.out.print(' ');
            }
            System.out.println();
        }
    }

    public char[][] getInitSeats(int rowsNumber, int colsNumber) {
        char[][] seats = new char[rowsNumber][colsNumber];
        for (char[] seat : seats) {
            Arrays.fill(seat, 'S');
        }
        return seats;
    }

    public void printMenu() {
        System.out.print("""
                1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit
                """);
    }

    public int getOption(Scanner sc) {
        return sc.nextInt();
    }

    public boolean doAction(Cinema cinema, int option, Scanner sc) {
        switch (option) {
            case 1 -> printSeats(cinema);
            case 2 -> buyTicket(sc, cinema);
            case 3 -> printStatistics(cinema);
            case 0 -> {
                return true;
            }
        }
        return false;
    }

    private void printStatistics(Cinema cinema) {
        System.out.printf("""
                Number of purchased tickets: %d
                Percentage: %.2f%%
                Current income: $%d
                Total income: $%d
                """, cinema.getSoldCount(), (double) cinema.getSoldCount() / cinema.getTotalSeats() * 100, cinema.getCurrentIncome(), cinema.getTotalIncome());
    }

    private void buyTicket(Scanner sc, Cinema cinema) {
        int[] seatCords = handleBuyTicket(sc, cinema);

        int ticketPrice = getTicketPrice(cinema, seatCords[0]);
        printTicketPrice(ticketPrice);

        cinema.setCurrentIncome(cinema.getCurrentIncome() + ticketPrice);
        cinema.setSoldCount(cinema.getSoldCount() + 1);

        bookSeat(seatCords[0], seatCords[1], cinema);
    }

    private int[] handleBuyTicket(Scanner sc, Cinema cinema) {
        int rowNumber;
        int seatNumber;
        while (true) {
            ask("Enter a row number:");
            rowNumber = getRowNumber(sc);

            ask("Enter a seat number in that row:");
            seatNumber = getSeatNumber(sc);

            if (rowNumber > cinema.getSeats().length || rowNumber < 1 || seatNumber > cinema.getSeats()[rowNumber - 1].length || seatNumber < 1) {
                System.out.println("\nWrong input!\n");
            } else if (cinema.getSeats()[rowNumber - 1][seatNumber - 1] == 'B') {
                System.out.println("\nThat ticket has already been purchased!\n");
            } else {
                break;
            }
        }
        return new int[]{rowNumber, seatNumber};
    }

    public void run(Scanner sc, Cinema cinema) {
        while (true) {
            printMenu();

            int option = getOption(sc);

            System.out.println();

            boolean isExit = doAction(cinema, option, sc);

            if (isExit) break;

            System.out.println();
        }
    }

    public int calculateTotalIncome(int totalSeats, int seatThreshold, int defaultPrice, int rowsNumber, int colsNumber, int promotionalPrice) {
        return totalSeats <= seatThreshold ?
                totalSeats * defaultPrice :
                rowsNumber / 2 * colsNumber * defaultPrice + Math.round((float) rowsNumber / 2) * colsNumber * promotionalPrice;
    }

    public int getRowsNumber(Scanner sc) {
        return sc.nextInt();
    }

    public int getColsNumber(Scanner sc) {
        return sc.nextInt();
    }
}
