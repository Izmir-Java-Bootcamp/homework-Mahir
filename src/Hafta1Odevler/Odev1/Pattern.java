package Hafta1Odevler.Odev1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi girisi yapin :");
        int sayac =1;
        double sayi = input.nextDouble();

        int satirSayisi =0;  // son yildiz satirinin yazilabilmesi icin
        int isaretSayisi=0;  // her satirdaki isaret sayisi kontrolu icin ( bosluk da bir isaret)
        int baslangic = 1;   // satir baslangicinda hangi isaretin koyulacagini kontrol etmek icin
        int artiSayisi=0;    // her satirdaki isaretlerin kontrolu icin

        for (int i = 0; i <sayi ; i++) {

            System.out.print("*");
        }   // ilk yildiz satiri

        System.out.println();


        for (int i = 0; i <(sayi -2) ; i++) { // sayinin 2 eksigi kadar satir yazilacak

            System.out.print("*");  // satirin ilk yildizi

            while(isaretSayisi < (sayi -2)){
                // baslagic degerinin 1 yada 0 olmasi durumuna gore + yada " " yazilacak
                if(baslangic==1){
                    System.out.print("+");
                    artiSayisi++;
                    isaretSayisi++;
                }else{
                    System.out.print(" ");
                    isaretSayisi++;
                }

                if(artiSayisi <= 4){
                    if(baslangic==0){
                        baslangic=1;
                    }else {
                        baslangic=0;
                    }
                }else{

                    break;
                }

            }
            artiSayisi=0;
            isaretSayisi=0;
            satirSayisi++;
            System.out.print("*");  // satirin son yildizi
            System.out.println();

            if((sayi-2) % 2 ==0){ // input sayinin cift-tek durumuna gore " " yada +
                if(baslangic==0){
                    baslangic=1;
                }else {
                    baslangic=0;
                }
            }

            if(satirSayisi == (sayi-2)){ // satir sayisinin tamamlanma sorgusu
                for (int k = 0; k <sayi ; k++) {
                    System.out.print("*");  // son yildiz satiri
                }
            }

        }









    }

}
