package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

    
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Avengers", "Action", "Joss Whedon", 2012, 150);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Inception", "Sci-Fi", "Christopher Nolan", 2010, 148);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Interstellar", "Sci-Fi", "Christopher Nolan", 2014, 169);


        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

 
        store.printStore();

        store.removeDVD(dvd2);
        store.printStore();

        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4, "Avatar", "Sci-Fi", "James Cameron", 2009, 162);
        store.removeDVD(dvd4);
    }
}
