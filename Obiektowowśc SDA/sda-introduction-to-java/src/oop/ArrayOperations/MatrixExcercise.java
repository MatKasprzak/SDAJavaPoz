package oop.ArrayOperations;
import oop.ArrayOperations.Matrix;

import java.util.Scanner;

public class MatrixExcercise {
    public void start() {
        //inicjalizowanie obu macierz
        Scanner scanner = new Scanner(System.in);
        int m =scanner.nextInt();
        int n =scanner.nextInt();
        int o =scanner.nextInt();
        int p =scanner.nextInt();

        Matrix macierz1 = new Matrix(m,n);
        Matrix macierz2 = new Matrix(o,p);

        macierz1.initializeMatrix();
        macierz1.printMatrix();
        macierz2.initializeMatrix();
        macierz2.printMatrix();
        System.out.println();
//Dodawanie macierzy
        /*Matrix wynik = macierz1.addMatrix(macierz2);
        wynik.printMatrix();*/
        // odejmowanie macierzy
       /* Matrix wynik = macierz1.substractMatrix(macierz2);
        wynik.printMatrix();*/
        //mnożenie macierzy
        /*Matrix wynik = macierz1.multiplyMatrix(macierz2);
        wynik.printMatrix();*/
    }
}
