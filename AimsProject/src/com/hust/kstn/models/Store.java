package com.hust.kstn.models;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int qty; 
    public Store() {
        itemsInStore = new DigitalVideoDisc[100];
        qty = 0;
    }
    public void addDVD(DigitalVideoDisc dvd) {
        if (qty >= itemsInStore.length) {
            System.out.println("Cửa hàng đã đầy, không thể thêm DVD.");
            return;
        }
        itemsInStore[qty] = dvd;
        qty++;
        System.out.println("Đã thêm DVD: " + dvd.getTitle() + " vào cửa hàng.");
    }
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < qty; i++) {
            if (itemsInStore[i].equals(dvd)) {
               
                for (int j = i; j < qty - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qty - 1] = null;
                qty--;
                found = true;
                System.out.println("Đã xóa DVD: " + dvd.getTitle() + " khỏi cửa hàng.");
                break;
            }
        }
        if (!found) {
            System.out.println("DVD không tồn tại trong cửa hàng.");
        }
    }
    public void printStore() {
        System.out.println("Danh sách DVD trong cửa hàng:");
        for (int i = 0; i < qty; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i]);
        }
    }
    public int getQty() {
        return qty;
    }
}
