package com.sda.designpatterns.behaviorals.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {



        private List<DeviceButton> buttons;


        public RemoteControl( ElectronicDevice device){
            buttons = new ArrayList<>();


            buttons.add(new DeviceButton(new TurnOnCommand(device)));
            buttons.add(new DeviceButton(new TurnOffCommand(device)));
        }
    }

