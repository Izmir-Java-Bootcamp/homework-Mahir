package Hafta1Odevler.Odev3;


import java.util.Random;

public class TestStudent {
    public static void main(String[] args) {

        PersonalData p1 = new PersonalData(2000,1,1,2001l);
        PersonalData p2 = new PersonalData(2001,2,2,2002l);
        PersonalData p3 = new PersonalData(2002,3,3,2003l);
        PersonalData p4 = new PersonalData(2003,4,4,2004l);
        PersonalData p5 = new PersonalData(2004,5,5,2005l);
        Student s1 = new Student("ahmet",5005l, 65.5,p1);
        Student s2 = new Student("mehmet",5006l, 70,p2);
        Student s3 = new Student("ayşe",5007l, 48,p3);
        Student s4 = new Student("fatma",5008l, 86.7,p4);
        Student s5 = new Student("veli",5009l, 12,p5);

        Course K129 = new Course("matematik",3);
        // Student nesneleri bir listeye eklendi
        Student[] s = new Student[5];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        s[3] = s4;
        s[4] = s5;
        // random yaratilan id'ye gore yaratilan Student nesneleri eklendi
        for (int i = 0; i < 3; i++) {
            int id = rassalEkle();
            for (int j = 0; j < s.length; j++) {
                if( s[j].getId() == id){
                   if( K129.addStudent(s[j]) == false){
                       i--;
                       break;
                   };
                    break;
                }
            }



        }
        System.out.println("---------");
        K129.list();// ekrana yazdirildi
        System.out.println("---------");
        K129.dropStudent(s1); // 5005 eger random eklenmis ise listeden silindi.
        System.out.println("---------");
        K129.list();// ekrana yazdirildi
        System.out.println("---------");
        System.out.println("kayıtlı ogrenci sayisi : "+ K129.getNumberOfStudent()); // kayitli ogrencilerin sayisi
        System.out.println("---------");
        System.out.println("en iyi ogrencinin dogum yili : "+K129.getBestStudent().getPd().getBirthDate().getYear());
        System.out.println("---------");
        Course K130 = new Course("kimya ",3);
        // K129 daki ogrenciler K130 ' a eklendi
        for (int i = 0; i < K129.getNumberOfStudent(); i++) {
            K130.addStudent(K129.getStudents()[i]);
        }

        // K129 ogrencileri cikarildi.
        for (int i = 0; i <K129.getNumberOfStudent() ; i++) {
            K129.clear();
        }

        K130.list(); // ekrana yazdirildi.

        K130.dropStudent(K130.getBestStudent()); // en iy ogrenci dusuruldu
        K130.list(); // ekrana yazdirildi.
        System.out.println("en iyi ogrenci GPA : "+K130.getYoungestStudent().getGpa());


    }
    public static int rassalEkle(){
        // rassal id yaratildi
        Random rassal = new Random();
        int x =0;

        x = 5005+rassal.nextInt(5);
            

        return x;
    }

}
