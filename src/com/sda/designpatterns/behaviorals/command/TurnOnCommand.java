package com.sda.designpatterns.behaviorals.command;

public class TurnOnCommand implements Command{

    private  ElectronicDevice device;

    public TurnOnCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
