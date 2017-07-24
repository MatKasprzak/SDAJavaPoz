package oop.abstractExample;

/**
 * Created by RENT on 2017-07-21.
 */
public class Kwadrat extends Figura {

    private int a;

    public int getA() {
        return a;
    }
    public void setA(int a){
        this.a = a;
    }

    public Kwadrat (int a) {
        this.a = a;
    }
    @Override
    public double ObliczPole() {
        System.out.println("POLE KWADRATU " + a*a);
        return a*a;
    }

    @Override
    public double ObliczObwod() {
        System.out.println("Obwód Kwadratu " + 4*a);
        return 4*a;
    }
}
