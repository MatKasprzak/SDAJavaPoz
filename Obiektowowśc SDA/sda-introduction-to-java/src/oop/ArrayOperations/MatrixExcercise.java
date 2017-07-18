package oop.ArrayOperations;
import oop.ArrayOperations.Matrix;

public class MatrixExcercise {
    public void start() {
        //inicjalizowanie obu macierz
        Matrix macierz1 = new Matrix();
        Matrix macierz2 = new Matrix();

        macierz1.initializeMatrix();
        macierz1.printMatrix();
        macierz2.initializeMatrix();
        macierz2.printMatrix();
//Dodawanie macierzy
        Matrix wynik = macierz1.addMatrix(macierz2);
        wynik.printMatrix();
    }
}
