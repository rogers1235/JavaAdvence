package com.sda.designpatterns.behaviorals.memento;

public class TextWindow {

    private StringBuilder currentText;

    public TextWindow() {
        currentText = new StringBuilder();
    }

    public  void addText(String newText){
        currentText.append(newText);

    }

    public String getCurrentText() {
        return currentText.toString();
    }

    public TextWindowState save(){
        return  new TextWindowState(currentText.toString());
    }

    public  void  restore(TextWindowState savedState){
        currentText = new StringBuilder(savedState.getText());
    }

}
