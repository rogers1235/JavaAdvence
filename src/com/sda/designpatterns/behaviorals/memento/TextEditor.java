package com.sda.designpatterns.behaviorals.memento;

public class TextEditor {

    private TextWindow textWindow;
    private TextWindowState state;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String  text){
        textWindow.addText(text);
    }
    public  void pressSave(){
         state = textWindow.save();
    }
    public  void  pressUndo(){
     if(state != null){
         textWindow.restore(state);
     }
    }

    public  void  showText(){
        System.out.println(textWindow.getCurrentText());
    }

}
