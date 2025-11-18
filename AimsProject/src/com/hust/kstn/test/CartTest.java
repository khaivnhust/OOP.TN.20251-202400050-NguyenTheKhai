package com.hust.kstn.test;
import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;
public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        System.out.println("TEST 1: Add DVDs until cart is full");
        for (int i = 1; i <= 20; i++) {
            DigitalVideoDisc dvd = new DigitalVideoDisc("DVD " + i, "Category", "Director", 90, 10.0);
            cart.addDVD(dvd);
            cart.print();
            System.out.println();
        }
        System.out.println("TEST 1: Try adding when cart is full");
        DigitalVideoDisc overflowDisc = new DigitalVideoDisc("Overflow Disc");
        cart.addDVD(overflowDisc);
        cart.print();
        System.out.println();
        System.out.println("TEST 2: Remove DVD when cart is empty");
        Cart emptyCart = new Cart();
        emptyCart.removeDVD(new DigitalVideoDisc("Random DVD"));
        emptyCart.print();
        System.out.println();
        System.out.println("TEST 3: Remove DVD that does not exist");
        Cart cart2 = new Cart();
        DigitalVideoDisc d1 = new DigitalVideoDisc("Movie A");
        DigitalVideoDisc d2 = new DigitalVideoDisc("Movie B");
        cart2.addDVD(d1);
        cart2.print();
        System.out.println("Attempt to remove Movie C (not in cart) ");
        DigitalVideoDisc d3 = new DigitalVideoDisc("Movie C");
        cart2.removeDVD(d3);
        cart2.print();
        System.out.println();
        System.out.println("TEST 4: Add/remove operations");
        Cart cart3 = new Cart();
        DigitalVideoDisc a = new DigitalVideoDisc("A");
        DigitalVideoDisc b = new DigitalVideoDisc("B");
        DigitalVideoDisc c = new DigitalVideoDisc("C");
        cart3.addDVD(a);
        cart3.print();
        cart3.addDVD(b, c);
        cart3.print();
        System.out.println("-- Removing B --");
        cart3.removeDVD(b);
        cart3.print();
        System.out.println("-- Removing A --");
        cart3.removeDVD(a);
        cart3.print();
    }
}
