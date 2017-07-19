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

    /*public Matrix(){
        m = 3;
        n = 3;
    }*/
    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        if (m > 0 && n > 0) {
            this.mtrx = new int[m][n];
        } else {
            System.out.println("nie można zbudować macierzy z ujemnych wartości");
        }
    }
    public void printMatrix(){
        //wypisanie elementów na konsole
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(mtrx[i][j]);

            }
        }
        System.out.println();
    }

    public void initializeMatrix() {
        Matrix matrix1 = new Matrix( m, n);
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
        if (this.m == drugaMacirz.getM() && this.n == drugaMacirz.getN()) {
            Matrix wynikowa = new Matrix(m, n);


            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    wynikowa.mtrx[i][j] = this.mtrx[i][j] + drugaMacirz.mtrx[i][j];
                }
            }
            return wynikowa;

        }else
            return wynikowa;
    }

    public Matrix substractMatrix(Matrix drugaMacierz) {
        Matrix wynikowa = new Matrix(m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                wynikowa.mtrx[i][j] = this.mtrx[i][j] - drugaMacierz.mtrx[i][j];

            }

        }
        return wynikowa;
    }
//Do poprawy
   /* public Matrix multiplyMatrix(Matrix drugaMacierz) {
        Matrix wynikowa = new Matrix();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                wynikowa.mtrx[i][j] = this.mtrx[0][j] * drugaMacierz.mtrx[i][0] + this.mtrx[1][j] * drugaMacierz.mtrx[i][1] +
                        this.mtrx[2][j] * drugaMacierz.mtrx[i][2];
            }
        }

        return wynikowa;
    }*/
}