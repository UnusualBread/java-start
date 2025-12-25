package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM01_behavioral_patterns.L02_command;

/*
Suppose you are building a remote control application. It performs three
commands: turning on the TV, changing the channel to a specific number, and
turning off the TV. Use the command pattern to implement this application.
*/

import java.util.Scanner;

class Client {

    public static void main(String[] args) {

        Controller controller = new Controller();
        TV tv = new TV();

        int[] channelList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            channelList[i] = scanner.nextInt();
        }

        Command3 turnOnTV = new TurnOnCommand(tv);
        controller.setCommand(turnOnTV);
        controller.executeCommand();

        for (int i = 0; i < 3; i++) {
            Command3 changeChannel = new ChangeChannelCommand(new Channel(tv, channelList[i]));
            controller.setCommand(changeChannel);
            controller.executeCommand();
        }

        Command3 turnOffTV = new TurnOffCommand(tv);
        controller.setCommand(turnOffTV);
        controller.executeCommand();
    }
}

class TV {

    Channel channel;

    void turnOn() {
        System.out.println("Turning on the TV");
        setChannel(new Channel(this, 0));
    }

    void turnOff() {
        System.out.println("Turning off the TV");
    }

    void setChannel(Channel channel) {
        this.channel = channel;
    }
}

class Channel {
    private TV tv;
    private int channelNumber;

    Channel(TV tv, int channelNumber) {
        this.tv = tv;
        this.channelNumber = channelNumber;
    }

    void changeChannel() {
        tv.setChannel(this);
        System.out.println("Channel was changed to " + channelNumber);
    }
}

interface Command3 {
    void execute();
}

class TurnOnCommand implements Command3 {
    TV tv;

    TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}

class TurnOffCommand implements Command3 {
    TV tv;

    TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}

class ChangeChannelCommand implements Command3 {

    private Channel channel;

    ChangeChannelCommand(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void execute() {
        channel.changeChannel();
    }
}

class Controller {
    private Command3 command;

    void setCommand(Command3 command) {
        this.command = command;
    }

    void executeCommand() {
        command.execute();
    }
}
