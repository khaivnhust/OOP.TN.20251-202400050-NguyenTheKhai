package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {

    public DigitalVideoDisc(String title, double cost, String category, String director, int length) {
        super(title, cost, category, director, length);
    }

    @Override
    public String toString() {
        return "DVD[" + id + "][" + title + "][" + cost + "][" + category + 
               "][" + director + "][" + length + " min]";
    }
}
