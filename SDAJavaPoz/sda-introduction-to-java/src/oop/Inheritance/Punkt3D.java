package oop.Inheritance;


public class Punkt3D extends Punkt2D {
    private int z;


    public Punkt3D() {
        super();
        z = 0;
    }

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }


    @Override
    public void printPunkt2D() {
        System.out.println("x = " + super.getX() + " " + "y = " + super.getY() + " " + "z = " + z);
    }
}
















