package Hafta1Odevler.Odev3;

public class Course {

    private String name;
    private Student[] students;
    private int capacity;
    private int numberOfStudent;

    public Course(String name) {
        this.name = name;
        this.capacity=40;
        this.numberOfStudent=0;
        students =new Student[capacity];
    }

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.numberOfStudent=0;
        students =new Student[capacity];
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean addStudent(Student s){
        if(getNumberOfStudent() == 0){
            students[0] = s;
            this.numberOfStudent++;
            return true;
        }
        if(getNumberOfStudent() < this.capacity){

            for (int i = 0; i <getNumberOfStudent() ; i++) {
                if(students[i].getId() == s.getId()){
                    System.out.println("ayni kisi eklenemez");
                    return false;

                }
            }

        }

        students[getNumberOfStudent()] = s;
        this.numberOfStudent++;
        return true;



    }

    public boolean dropStudent(Student s){
        int ogrenciIndex=-1;
        for (int i = 0; i <getNumberOfStudent() ; i++) {
            if(students[i].getId() == s.getId()){
                ogrenciIndex=i;
                break;
            }
        }
        if(ogrenciIndex != -1){
            for (int i = ogrenciIndex; i <getNumberOfStudent()-1 ; i++) {
                students[i] = students[i+1];

            }
            students[getNumberOfStudent()-1]=null;
            this.numberOfStudent--;
            return true;
        }
        return false;

    }

    public void increaseCapacity(){
        Student[] ogrenciListesi = new Student[5 * this.capacity];
        for (int i = 0; i < getNumberOfStudent(); i++) {
            ogrenciListesi[i] = students[i];

        }
        students=ogrenciListesi;

    }
    public Student getBestStudent(){
        double enYuksekNot = 0;
        int enYuksekNotIndex=0;
        for (int i = 0; i <getNumberOfStudent() ; i++) {
            if(students[i].getGpa() > enYuksekNot){
                enYuksekNot = students[i].getGpa();
                enYuksekNotIndex = i;
            }
        }
        return students[enYuksekNotIndex];

    }
    public Student getYoungestStudent(){
        Student youngeststudent = null;
        //Student s1 = new Student("ahmet",111L,65.5,new PersonalData(1999,3,25,1111l));
        for (int i = 0; i <getNumberOfStudent()-1 ; i++) {
            if(students[i].getPd().getBirthDate().isAfter(students[i+1].getPd().getBirthDate())){
                youngeststudent=students[i];
            }
        }
        return youngeststudent;
    }
    public void clear(){
        for (int i = 0; i <getNumberOfStudent() ; i++) {
            students[i] = null;
        }
        this.numberOfStudent=0;
    }
    public void list(){
        if(getNumberOfStudent() == 0){
            System.out.println("ders boş. ogrenci yok");
        }else{
            for (int i = 0; i <getNumberOfStudent() ; i++) {

                System.out.println( toString()+" ogrenci adı : " + students[i].getName());
            }
        }
    }
    public String toString(){
        String s = "\nders adı  : " + getName() + "\n + kapasitesi : " + this.capacity;
        return s;
    }
}
