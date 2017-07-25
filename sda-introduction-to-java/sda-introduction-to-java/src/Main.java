
import oop.abstractExample.Figura;
import oop.abstractExample.Kwadrat;
import oop.abstractExample.Prostokat;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean czyWyjsc = false;

        Figura[] figury = new Figura[10];
        int liczbaFigur = 0;


        while (czyWyjsc == false) {
            System.out.println("1.Dodawanie kwadratu");
            System.out.println("2.Dodawanie prostokata");
            System.out.println("3.Oblicz wszystkie pola");
            int wybor = scanner.nextInt();
            Figura jakasFigura = null;

            switch (wybor) {
                case 1: {
                    System.out.println("Podaj bok kwadratu");
                    int bok = scanner.nextInt();
                    jakasFigura = new Kwadrat(bok);
                    figury[liczbaFigur] = jakasFigura;
                    liczbaFigur++;
                    break;
                }
                case 2: {
                    System.out.println("Podaj boki prostokata");
                    int bokPierwszy = scanner.nextInt();
                    int bokDrugi = scanner.nextInt();
                    jakasFigura = new Prostokat(bokPierwszy, bokDrugi);
                    figury[liczbaFigur] = jakasFigura;
                    liczbaFigur++;

//                    figury[liczbaFigur++] = new Prostokat(bokPierwszy, bokPierwszy);
                    break;
                }
                case 3: {
                    System.out.println("Pola figur to: ");
                    for (int i = 0; i < liczbaFigur; i++) {
                        Figura figuraZTablicy = figury[i];
                        double pole = figuraZTablicy.ObliczPole();
                        System.out.println("Licze pole dla: ");
                        figuraZTablicy.Opisz();
                        System.out.println("Pole to :" + pole);
                    }
                    break;
                }
                case 0: {
                    System.out.println("Wychodze z programu");
                    czyWyjsc = true;
                    break;
                }
            }
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
