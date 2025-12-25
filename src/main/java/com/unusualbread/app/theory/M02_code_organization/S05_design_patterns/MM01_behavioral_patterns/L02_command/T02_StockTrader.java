package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM01_behavioral_patterns.L02_command;

/*
Suppose you are creating a stockbroker application. It performs two commands
which are buy and sell. Use the command pattern to implement this application.
*/

public class T02_StockTrader {

    public static void main(String[] args) {

        Stock stock = new Stock();

        Command buyCommand = new BuyCommand2(stock);
        Command sellCommand = new SellCommand2(stock);

        Broker2 broker = new Broker2();

        broker.setCommand(buyCommand);
        broker.executeCommand();

        broker.setCommand(sellCommand);
        broker.executeCommand();
    }
}


class Stock {

    public void buy() {
        System.out.println("Stock was bought");
    }

    public void sell() {
        System.out.println("Stock was sold");
    }
}

interface Command2 {
    void execute();
}

class BuyCommand2 implements Command {
    private Stock stock;

    public BuyCommand2(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }
}

class SellCommand2 implements Command {
    private Stock stock;

    public SellCommand2(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }
}

class Broker2 {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
