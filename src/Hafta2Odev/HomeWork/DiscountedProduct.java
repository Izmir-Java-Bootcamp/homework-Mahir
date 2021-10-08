package Hafta2Odev.HomeWork;

/**
 * Subclass representing a discounted product to be
 * purchased. It extends the Product class with two instance variables
 */
public class DiscountedProduct extends Product {

    private final Product original;
    private final double discount;


    public DiscountedProduct(Product original, double discount) {
        super(original);

        this.original=original;
        this.discount=discount;

    }

    public double getPrice(Cart cart) {

        //indirimli fiyat
        return original.getPrice()-(this.original.getPrice()*this.discount)/100;

    }

    public String toString() {
        return this.original.getName()+" --> indirim oranı %"+discount+ " ";
    }
}