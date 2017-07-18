package oop.ArrayOperations;

import java.util.Scanner;

public class Matrix {
    private int[][] mtrx;
    private int m;
    private int n;

    public int[][] getMtrx() {
        return mtrx;
    }

    public void setMtrx(int[][] mtrx) {
        this.mtrx = mtrx;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    Scanner scanner = new Scanner(System.in);

    public Matrix() {
        m = 3;
        n = 3;
        mtrx = new int[m][n];
    }

    public void printMatrix() {
        //wypisanie elementów na konsole
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(mtrx[i][j]);

            }
        }
    }

    public void initializeMatrix() {
        Matrix matrix1 = new Matrix();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Podaj element " + i + " " + j + " macierzy");
                mtrx[i][j] = scanner.nextInt();
            }
        }
    }
//this.mtrx - obiekt o nazwie macierz
    //
    public Matrix addMatrix(Matrix drugaMacirz) {
        Matrix wynikowa = new Matrix();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                wynikowa.getMtrx()[i][j] = this.mtrx[i][j] + drugaMacirz.getMtrx()[i][j];
            }
        }return wynikowa;

    }

}
