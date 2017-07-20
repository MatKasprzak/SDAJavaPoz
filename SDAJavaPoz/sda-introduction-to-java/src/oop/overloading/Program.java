package oop.overloading;


import oop.mathematic.BinomialSolver;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String imie = scanner.nextLine();
//        String nazwisko = scanner.nextLine();
//        int wiek = scanner.nextInt();

        //kod przykladu
//        Student studentInformatyki = new Student();
//
//
//        Student studentPrawa = new Student(imie, nazwisko);
//
//        Student studentMedycyny = new Student();
//
//        Student studentAWF = new Student(wiek);
//
//        Student studentEkonomii = new Student("Anna");


        //Chainowanie konstruktorow

//        Author Mickiewicz = new Author("Adam", "Mickiewicz", 25);
//
//        Rectangle r = new Rectangle(2,3);

//        System.out.println(studentPrawa.getName());

//        MathHelper helper = new MathHelper();
//
//        float wynik = helper.addNumbers(2, 2);
//
//        Scanner sc = new Scanner(System.in);
//
//       float result  =  Math.abs(2.0f);
//
//        double abs = Math.abs(2.0);
        System.out.println("Wprowadź liczby dla a , b , c");
        BinomialSolver solver = new BinomialSolver( scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble() );
        solver.count();
        System.out.println("Podaj wartośc x");
        solver.calculate( scanner.nextDouble());
//
    }
}

