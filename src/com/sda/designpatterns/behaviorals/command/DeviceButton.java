package com.sda.designpatterns.behaviorals.command;

public class DeviceButton {

    private Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void pushButton(){
        command.execute();



    }

}
