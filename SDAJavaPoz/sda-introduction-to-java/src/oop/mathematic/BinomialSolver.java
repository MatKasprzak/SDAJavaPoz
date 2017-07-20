package oop.mathematic;


import java.util.Scanner;

public class BinomialSolver {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    public  BinomialSolver ( double a , double b , double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }





    public double count () {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            x1 = (( - b - Math.sqrt(delta)) / (2 * a));
            x2 = (( - b + Math.sqrt(delta)) / (2 * a));
            System.out.println(x1 + " " + x2);
        }else if ( delta == 0) {
            x1 = ( - b ) / (2 * a);
            System.out.println(x1);
        }else {
            System.out.println("Brak pierwiastków bo delta ujemna");
        }
        return delta;
    }
    public double calculate (double x) {
        double result = a * (x * x) + b * x + c;
        System.out.println(result);
        return result;
    }


}
