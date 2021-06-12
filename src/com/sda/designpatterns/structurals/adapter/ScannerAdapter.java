package com.sda.designpatterns.structurals.adapter;

public class ScannerAdapter implements ScannerApplication{

    private Paper paper;

    public ScannerAdapter(Paper paper) {
        this.paper = paper;
    }

    public String convertTextInPdf(){
        return paper.getText();
    }

}
