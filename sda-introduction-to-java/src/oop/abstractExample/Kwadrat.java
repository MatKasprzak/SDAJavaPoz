package oop.abstractExample;

/**
 * Created by RENT on 2017-07-21.
 */
public class Kwadrat extends Figura {

    private int a;
    @Override
    public double ObliczPole() {
        System.out.println("POLE KWADRATU");
        return a*a;
    }

    @Override
    public double ObliczObwod() {
        return 4*a;
    }
}
