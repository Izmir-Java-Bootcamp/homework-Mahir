package Hafta2Odev.HomeWork;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    // list of products
    private final List<Product> products;

    public Cart(){
        products = new ArrayList<>();
    }


    public List<Product> getProducts(){
        // code here
        return products;
    }


    public void addProduct(Product product) {
        // code here
        this.products.add(product);
    }


    public void addProducts(List<Product> products) {
        this.products.addAll(products);
        // code here
    }


    public void addProduct(Product product, int howManyTimes) {
        // code here
        for (int i = 0; i < howManyTimes; i++) { //add multiple product
            this.products.add(product);
        }
    }


    public double totalPrice(){
        double totalPrice=0;
        for (Product item: this.products) {
            totalPrice+=item.getPrice(this);
        }
        // code here
        return totalPrice;
    }


    public String toString() {
        String result = "";
        // code here
        return result;
    }
}