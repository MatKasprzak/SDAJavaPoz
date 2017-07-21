package oop.Inheritance;


public class Punkt2D {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Punkt2D () {
        this.x = 0;
        this.y = 0;
    }
    public Punkt2D (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void printPunkt2D () {
        System.out.println("x = " + x + " " + "y = " + y);
    }
}
