package models;

public class Cart {

    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int quantityOrdered = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (quantityOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full. Cannot add more DVDs.");
            return;
        }
        itemsInCart[quantityOrdered] = disc;
        quantityOrdered++;
        System.out.println("The disc \"" + disc.getTitle() + "\" has been added successfully.");
    }

   
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (quantityOrdered + 2 > MAX_NUMBER_ORDERED) {
            System.out.println("The cart does not have enough space for 2 more DVDs.");
            return;
        }
        itemsInCart[quantityOrdered] = disc1;
        itemsInCart[quantityOrdered + 1] = disc2;
        quantityOrdered += 2;
        System.out.println("Two discs have been added successfully.");
    }

   
    public void addDVD(DigitalVideoDisc... discs) {
        if (discs == null || discs.length == 0) {
            System.out.println("No disc provided.");
            return;
        }

        int spaceLeft = MAX_NUMBER_ORDERED - quantityOrdered;
        int addedCount = 0;

        for (DigitalVideoDisc disc : discs) {
            if (addedCount >= spaceLeft) {
                break;
            }
            if (disc != null) {
                itemsInCart[quantityOrdered + addedCount] = disc;
                addedCount++;
            }
        }

        quantityOrdered += addedCount;

        if (addedCount == discs.length) {
            System.out.println("All " + addedCount + " disc(s) have been added successfully.");
        } else {
            System.out.println("Only " + addedCount + " disc(s) added. Cart is full ("
                    + (discs.length - addedCount) + " disc(s) skipped).");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (quantityOrdered == 0) {
            System.out.println("The cart is empty.");
            return;
        }

        int foundIndex = -1;
        for (int i = 0; i < quantityOrdered; i++) {
            if (itemsInCart[i] == disc) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            for (int i = foundIndex; i < quantityOrdered - 1; i++) {
                itemsInCart[i] = itemsInCart[i + 1];
            }
            itemsInCart[quantityOrdered - 1] = null;
            quantityOrdered--;
            System.out.println("The disc has been removed successfully.");
        } else {
            System.out.println("The disc does not exist in the cart.");
        }
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (int i = 0; i < quantityOrdered; i++) {
            total += itemsInCart[i].getCost();
        }
        return total;
    }

    public void print() {
       
        if (quantityOrdered == 0) {
            System.out.println("The cart is empty.");
        } else {
            for (int i = 0; i < quantityOrdered; i++) {
                DigitalVideoDisc disc = itemsInCart[i];
                System.out.println((i + 1) + ". " + disc.toString());
            }
        }
        System.out.println("Total cost: " + calculateTotalCost() + "$");
    
    }
}
