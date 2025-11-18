package com.hust.kstn.models;

public abstract class Disc extends Media {
    protected String director;
    protected int length;

    public Disc(String title, double cost, String category, String director, int length) {
        super(title, cost, category);
        this.director = director;
        this.length = length;
    }

    public String getDirector() { return director; }
    public int getLength() { return length; }


}
