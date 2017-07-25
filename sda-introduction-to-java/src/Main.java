
import oop.abstractExample.Figura;
import oop.abstractExample.Kwadrat;
import oop.abstractExample.Prostokat;
import oop.arrayoperations.MatrixExcercise;

import oop.inheritance.Osoba;
import oop.inheritance.Pracownik;
import oop.inheritance.Student;


public class Main {

    public static void main(String[] args) {

        Figura[] figury = new Figura[5];
        figury[0] = new Kwadrat();
        figury[1] = new Prostokat();
        figury[2] = new Prostokat();
        figury[3] = new Kwadrat();
        figury[4] = new Prostokat();


        for(Figura f : figury){
            f.ObliczPole();
        }






//        Osoba os1 = new Osoba();
//        os1.setPesel(1234);
//
//        Osoba os2 = new Osoba();
//        os2.setPesel(1234);
//
//        String str = "Nowak";
//
//
//
//
//        if(os1.equals(str)){
//            System.out.println("To ta sama osoba");
//        }else{
//            System.out.println("Dwie rozne osoby");
//        }


        //Klasa zawierajaca zadania
//        MatrixExcercise me = new MatrixExcercise();
//        me.start();
//        Object obj1 = new Object();
//        Object obj2 = new Object();
//
//
//        String imie1 = "Ala";
//        String imie2 = "Ala";
//
//
//        if(obj1.equals(obj2)){
//            System.out.println("Sa rowne");
//        }else{
//            System.out.println("Nie sa rowne");
//        }
//
//
//        if(imie1.equals(imie2)){
//            System.out.println("Sa rowne");
//        }else{
//            System.out.println("Nie sa rowne");
//        }
//
//
//
//        Osoba nowak = new Osoba("Piotr", "Nowak", 24);
//
//        System.out.println(nowak);



//        Student stPrawa = new Student();
//
//        stPrawa.OpiszStudenta();
//
//        stPrawa.getImie();
//        stPrawa.getNazwisko();
//
//        Pracownik ksiegowy = new Pracownik();
//        ksiegowy.setStanowisko("ksiegowy");
//
//        ksiegowy.

//        Student nowak = new Student("Piotr", "Nowak", 25);
//
//        Student lysy  = nowak;
//
//        if(nowak.equals(lysy)){
//            System.out.println("rowne");
//        }else
//        {
//            System.out.println("Nie rowne");
//        }
//
//        if (nowak == lysy){
//            System.out.println("rowne");
//        }else
//        {
//            System.out.println("Nie rowne");
//        }




    }
}
