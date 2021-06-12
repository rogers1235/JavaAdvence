package com.sda.designpatterns.behaviorals.memento;


// this is Memento
public class TextWindowState {

    private  String text;

    public TextWindowState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
