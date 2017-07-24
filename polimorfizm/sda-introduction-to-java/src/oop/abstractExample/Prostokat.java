package oop.abstractExample;

/**
 * Created by RENT on 2017-07-21.
 */
public class Prostokat extends Figura{
    private int a;
   private int b;


public Prostokat (int a , int b) {
    this.a = a;
    this.b = b;
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

    @Override
    public double ObliczPole() {
        System.out.println("POLE PROSTOKATA " + a*b);
        return a*b;

    }

    @Override
    public double ObliczObwod() {
        System.out.println("Obwód prostokąta: " + 2*a + 2*b);
        return 2*a + 2*b;
    }
}
