package com.sda.designpatterns.behaviorals.command;

public class TurnOffCommand implements Command{

public  ElectronicDevice device;

    public TurnOffCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
  device.turnOff();
    }
}
