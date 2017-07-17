package excercise;


import oop.mathematic.Circle;

import java.util.Scanner;

public class Zadania {
    // Zadanie 2 - strona 6 - oblczanie pola i obwodu koła
    public void Zad2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Promien");
        double promien = scanner.nextDouble();
        Circle circle = new Circle();
        circle.promien = promien;

        System.out.println(circle.ObliczanieObwodu());
        System.out.println(circle.ObliczaniePola());

    }
    //Firma i pracownicy
    public void Zad3() {


    }

}
