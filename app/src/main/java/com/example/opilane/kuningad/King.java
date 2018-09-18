package com.example.opilane.kuningad;
//Lihtne mudeli klass, kus saame oma andmed
public class King {

    //variables that will be used
    private String name;
    private int from, to;

    //konstruktorid
    public King(String name, int from, int to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }
    //getterid
    public String getName() {
        return name;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
    //toString mehtod that will retun the value for each object in the ListView container

    @Override
    public String toString() {
        return name;
    }
}
