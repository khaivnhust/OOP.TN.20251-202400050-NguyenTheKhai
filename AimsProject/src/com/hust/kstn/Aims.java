package models;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();


        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 30.00);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 25.50);

        cart.addDVD(dvd1);

      
        cart.addDVD(dvd2, dvd3);

      
        cart.addDVD(dvd4, dvd5, dvd1); 

        DigitalVideoDisc[] moreDVDs = {dvd2, dvd3, dvd4};
        cart.addDVD(moreDVDs); 

       
        cart.print();

        cart.removeDVD(dvd2);

  
        cart.print();

        System.out.println("\nTotal cost: " + cart.calculateTotalCost() + " $");
    }
}
