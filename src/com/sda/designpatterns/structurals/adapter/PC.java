package com.sda.designpatterns.structurals.adapter;

public class PC {

    private String textInPdf;

    public void scanPaper(ScannerApplication scannerApplication){
        textInPdf = scannerApplication.convertTextInPdf();
    }

    public String getTextInPdf() {
        return textInPdf;
    }

}
