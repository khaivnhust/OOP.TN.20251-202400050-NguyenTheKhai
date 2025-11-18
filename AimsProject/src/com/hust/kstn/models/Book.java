package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();
    private int numOfTokens;

    public Book(String title, double cost, String category, int numOfTokens, List<String> authors) {
        super(title, cost, category);
        this.numOfTokens = numOfTokens;
        this.authors.addAll(authors);
    }

    @Override
    public String toString() {
        String result = "Book[" + getId() + "][" + getTitle() + "][" + getCost() + "][" 
                      + getCategory() + "][" + numOfTokens + "]\n";
        result += "Authors: ";
        for (int i = 0; i < authors.size(); i++) {
            result += authors.get(i);
            if (i < authors.size() - 1) result += ", ";
        }
        return result;
    }
}
