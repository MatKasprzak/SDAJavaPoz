package oop.mathematic;


import java.util.Scanner;

public class Pracownicy {
    public String[] pracownicy;
    public int liczbapracownikow = 0;


    public void LiczbaPracownikow () {
        System.out.println("Wpisz liczbe pracowników");
        Scanner scanner = new Scanner(System.in);
        liczbapracownikow = scanner.nextInt();
        pracownicy = new String[liczbapracownikow];

    }
    public void WypiszPracownikow () {
        System.out.println("Lista pracowników");
        for (String elem : pracownicy){
            System.out.println(pracownicy);
        }
    }
    public void DodajPracwnika () {


    }


}
