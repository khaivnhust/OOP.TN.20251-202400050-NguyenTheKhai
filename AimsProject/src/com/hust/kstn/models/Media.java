package com.hust.kstn.models;

public class Media {
    private int id;
    private String title;
    private String category;
    private double cost;
    private static int nbMedias = 0;

    public Media(String title, double cost, String category) {
        this.id = nbMedias++;
        this.title = title;
        this.cost = cost;
        this.category = category;
    }

    public Media(String title, double cost) {
        this(title, cost, "Uncategorized");
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Media[" + id + "][" + title + "][" + cost + "][" + category + "]";
    }
}
