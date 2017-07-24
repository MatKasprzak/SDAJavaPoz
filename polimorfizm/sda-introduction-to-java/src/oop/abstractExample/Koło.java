package oop.abstractExample;

/**
 * Created by RENT on 2017-07-24.
 */
public class Koło extends Figura {
    private int r;

    public Koło (int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double ObliczPole (){
        System.out.println("Pole koła: " + Math.PI*r*r);
        return Math.PI*r*r;
    }
    @Override
    public double ObliczObwod () {
        System.out.println("Obwód koła: " + 2 * Math.PI * r);
        return 2 * Math.PI * r;

    }
}
