package Hafta2Odev.HomeWork;


public class Product {

    // Name of the seller
    private final String seller;
    // Name of the product
    private final String name;
    // Price of the product
    private final double price;


    public Product(String seller, String name, double price) {
        this.seller=seller;
        this.name=name;
        this.price=price;
    }


    public Product(Product original) {
        this.price=original.price;
        this.name=original.name;
        this.seller=original.seller;
    }

    public String getSeller() {
        return seller;
    }


    public final String getName() {
        // code here
        return name;
    }

    public double getPrice(){
        return price;
    }


    public double getPrice(Cart cart) {
        // code here
        return price;
    }


    public String toString() {
        // code here
        return "Product name: "+name;
    }

    public boolean canBeReduced() {
        //Nothing to do here
        return true;
    }
}