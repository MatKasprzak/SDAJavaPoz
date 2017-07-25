package oop.abstractExample;

/**
 * Created by RENT on 2017-07-21.
 */
public class Prostokat extends Figura{
    int a;
    int b;


    @Override
    public double ObliczPole() {
        System.out.println("POLE PROSTOKATA");
        return a*b;
    }

    @Override
    public double ObliczObwod() {
        return 2*a + 2*b;
    }
}
