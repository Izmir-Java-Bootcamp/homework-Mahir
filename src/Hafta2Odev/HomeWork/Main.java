package Hafta2Odev.HomeWork;


import java.util.Scanner;

public class Main {

    public static void askCustomer(Cart cart){
        String input="";


        Product product = null;
        DiscountedProduct discountedProduct = null;
        Buy2Take3Product buy2Take3Product;

        System.out.println("Enter 1 to buy a product");
        System.out.println("Enter 0 to chechout and proceed with the payment");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine(); // input string olarak alındı

        while(!input.equals("0")){

            if (input.equals("1")) {
                System.out.print("Product name: ");
                String productName = scanner.nextLine();

                System.out.print("Seller: ");
                String seller = scanner.nextLine();

                System.out.print("Price: ");
                double price = scanner.nextDouble();

                System.out.print("How many: ");
                int count = scanner.nextInt();

                System.out.print("Discount (enter 0 if no discount applies): ");
                int discount = scanner.nextInt();


                System.out.print("Does Buy2Take3 apply? Y/N: ");
                String buy2take3 =scanner.next();
                buy2take3=buy2take3.toUpperCase();

                product =new Product(seller, productName, price);
                discountedProduct = new DiscountedProduct(product, discount);
                buy2Take3Product = new Buy2Take3Product(discountedProduct);

                if(discount>0 && buy2take3.equals("Y")){
                    throw new IllegalArgumentException("please select only one discount.");

                }else if(discount>0 && buy2take3.equals("N")){

                    if (count == 1) {
                        cart.addProduct(discountedProduct);
                        // kart sınıfındaki listeye 1 tane indirimli urun eklendi

                    }
                    else{
                        cart.addProduct(discountedProduct,count);
                    }
                }else if (discount == 0 && buy2take3.equals("Y")) {


                    if (count == 1) {
                        cart.addProduct(buy2Take3Product);
                    } else {
                        cart.addProduct(buy2Take3Product, count);
                    }
                }

            }

            System.out.println("Enter 1 to buy a product");
            System.out.println("Enter 0 to chechout and proceed with the payment");
            scanner = new Scanner(System.in);
            input = scanner.nextLine();
        }




        for (Product item: cart.getProducts()) {
            if(item instanceof DiscountedProduct){

                System.out.println(item.toString()+" "+item.getPrice(cart)+"\nseller name : "+item.getSeller());
            }else{

                System.out.println(item.getName()+" "+item.getPrice(cart)+" TL."+"\nseller name : "+item.getSeller());
            }

        }





        System.out.println("Toplam Tutar : "+cart.totalPrice()+" TL");

    }


    public static void main(String[] args) {
        System.out.println("Welcome to kodluyoruz shop");
        System.out.println("What’s your name?");

        Scanner scanner = new Scanner(System.in);

        String customer = scanner.nextLine();
        System.out.println("Hi " + customer + ". Please choose one of the following options:");
        System.out.println("");

        Cart cart = new Cart();

        askCustomer(cart);

    }
}
