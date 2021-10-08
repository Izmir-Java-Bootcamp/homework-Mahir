package Hafta1Odevler.Odev2;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter the pattern string: ");
        String searchWord= input.nextLine();
        boolean isTrue = true;
        String sentence;



        do{
            System.out.println("Enter a string : ");
            sentence = input.nextLine();

            isTrue=searchWord(searchWord,sentence);

            if( sentence.equals("exit")){
                break;
            }
            if(isTrue == false){
                System.out.println(searchWord +" occurs in "+ sentence );

            }else {
                System.out.println(searchWord +"  does NOT occur in"+ sentence);
            }

        }while(true);
        /*
        !sentence.equals("exit") sorgusu ile de cikis yapilabilir ama exit input'unu karsilastirmadan cikis
        yapmasi icin if sorgusu ile cikis yapildi.
         */
        System.out.println("bye");





    }
    public static boolean searchWord(String searchWord,String sentence){
        boolean isTrue=true;
        for (int i = 0; i <searchWord.length() ; i++) {
            char ch = searchWord.charAt(i);
            if(sentence.contains(String.valueOf(ch))){
                isTrue=false;
                return isTrue;
            }

        }
        return isTrue;
    }

}
