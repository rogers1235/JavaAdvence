package com.sda.designpatterns.behaviorals.memento;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());

        textEditor.write("Titlu\n");
        textEditor.write("Subtitle\n");

        textEditor.pressSave();
        textEditor.showText();

        System.out.println("--------------");
        textEditor.write("Continutul");
        textEditor.showText();

        System.out.println("--------------");
        textEditor.pressUndo();
        textEditor.showText();
    }

}
