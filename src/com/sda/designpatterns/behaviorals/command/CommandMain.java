package com.sda.designpatterns.behaviorals.command;

public class CommandMain {

    public static void main(String[] args) {

        Television samsung = new Television();


        DeviceButton onButton = new DeviceButton(new TurnOnCommand(samsung));
        DeviceButton offButton = new DeviceButton(new TurnOffCommand(samsung));

        onButton.pushButton();
        offButton.pushButton();


    }


}
