import oop.abstractExample.*;


import oop.abstractExample.*;
import oop.arrayoperations.MatrixExcercise;

import oop.inheritance.Osoba;
import oop.inheritance.Pracownik;
import oop.inheritance.Student;

import java.util.Scanner;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int licznik = 0;
        boolean czyWyjsc = false;

        Figura[] figury = new Figura[10];

        System.out.println("Obliczanie pól i obwodów");

        // System.out.println("0. Wyjśćie);

        while (czyWyjsc == false && licznik < 10) {
            System.out.println("1. Dodaj nowy kwadrat");
            System.out.println("2. Dodaj nowy prostokąt");
            System.out.println("3. Dodaj nowe koło");
            System.out.println("4. Dodaj nowy trapez");
            System.out.println("5. Oblicz pole");
            System.out.println("6. Oblicz obwod");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Podaj długość boku");
                    int a = sc.nextInt();
                    figury[licznik] = new Kwadrat(a);
                    licznik++;
                    break;
                case 2:
                    System.out.println("Podaj długość boków");
                    int a1 = sc.nextInt();
                    int b = sc.nextInt();
                    figury[licznik] = new Prostokat(a1, b);
                    licznik++;
                    break;
                case 3:
                    System.out.println("Podaj długość promienia");
                    int r = sc.nextInt();
                    figury[licznik] = new Koło(r);
                    licznik++;
                    break;
                case 4:
                    System.out.println("Podaj długość boków i wsokość");
                    int a2 = sc.nextInt();
                    int b2 = sc.nextInt();
                    int h = sc.nextInt();
                    figury[licznik] = new Trapez(a2, b2, h);
                    licznik++;
                    break;
                case 5:
                    System.out.println("Pola figur to");
                    for (int i = 0; i < licznik; i++) {
                        Figura figuraZTablicy = figury[i];
                        double pole = figuraZTablicy.ObliczPole();
                        // System.out.println("Licze pole dla: ");
                        //System.out.println("Pole to: " + pole);
                    }
                    break;


                case 6:
                    System.out.println("Obwody figur to");
                    for (int i = 0; i < licznik; i++) {
                        Figura figuraZTablicy = figury[i];
                        double obwod = figuraZTablicy.ObliczObwod();
                        // System.out.println("Licze pole dla: ");
                        //System.out.println("Obwód to: " + obwod);
                    }
                    break;

                case 0:
                    System.out.println("Wyjscie z programu");
                    czyWyjsc = true;
                    break;


            }
        }
        System.out.println("Koniec tabeli");
    }


//        figury[0] = new Kwadrat(5);
//        figury[1] = new Prostokat(4, 5);
//        figury[2] = new Prostokat(3, 5);
//        figury[3] = new Kwadrat(3);
//        figury[4] = new Prostokat(2, 5);
//        figury[5] = new Koło(4);
//        figury[6] = new Trapez(1, 2, 3);
//        figury[7] = new Koło(7);
//        figury[8] = new Trapez(1, 3, 5);
//        figury[9] = new Koło(3);

//
//        for (Figura f : figury) {
//            f.ObliczPole();
//        }
//        for (Figura f : figury) {
//            f.ObliczObwod();
}
//        for (Figura f: figury){
//            System.out.println(figury[f]);
//        }


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




