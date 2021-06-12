package com.sda.designpatterns.structurals.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        PC computer = new PC();
        Paper paper = new Paper("Ana are mere");
        ScannerApplication scanner = new ScannerAdapter(paper);

        computer.scanPaper(scanner);

        System.out.println(computer.getTextInPdf());
    }
}
