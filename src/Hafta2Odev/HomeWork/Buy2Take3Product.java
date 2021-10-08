package Hafta2Odev.HomeWork;
/**
 * Subclass representing a product to be purchased
 * (using the formula "buy 2 take 3")
 * It extends the Product class with one instance variable
 */


public class Buy2Take3Product extends Product {
    //original product
    private final Product original;


    public Buy2Take3Product(Product original) {
        super(original);
        if(!original.canBeReduced()){
            throw new IllegalArgumentException("No Discount");
        }
        else{
            this.original=original;
        }


    }


    public boolean canBeReduced() {
        if(original instanceof DiscountedProduct){
            return false;
        }

        return true;
    }


    public double getPrice(Cart cart) {
        int count=0;
        double p=0;
        for (Product item : cart.getProducts() ) {
            if(item instanceof Buy2Take3Product) { //Check if item buy2take3product
                count++;                           //increase product count
                p += item.getPrice();
            }
        }

        if(count>=3){              //Apply the campaign if there are more than 3 products
            double bol=count/3;
            p-=(bol*30);
            p=p/count;
        }

        return p;

    }
}