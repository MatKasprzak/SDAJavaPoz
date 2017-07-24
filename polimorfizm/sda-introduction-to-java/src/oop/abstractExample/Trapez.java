package oop.abstractExample;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by RENT on 2017-07-24.
 */
public class Trapez extends Figura {
public int a;
    public int b;
    public int h;

    public Trapez(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double ObliczPole() {
        System.out.println("Pole Trapezu " + ((a*b) / 2 ) * h);
        return ((a*b) / 2 ) * h;
    }

    public double ObliczObwod() {
        System.out.println("Obwów Trapezu " + a+b+2*h);
        return a+b+2*h;
    }
}
