package oop.overloading;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(){
        this.a = 0;
        this.b = 0;
    }

    public Rectangle(int a) {
        this();
        this.a = a;
    }
    public Rectangle(int a, int b){
        this(a);
        this.b = b;
    }
    public double getA(){
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
}
