package oop.mathematic;

public class Circle {
    private double radius;
    //moja metoda
    public double promien;
    public double obwod;
    public double pole;

    public double ObliczaniePola() {
        pole = Math.PI * promien * promien;
        return pole;
    }

    public double ObliczanieObwodu() {
        obwod = 2 * Math.PI * promien;
        return obwod;
    }

    //hermetyzacja
    public Circle() {
        radius = 0;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        if (r < 0) {
            System.out.println("Promień nie może byc ujemny");
        } else {
            this.radius = r;
        }
        System.out.println();
    }

    public double getObwod() {
        return this.obwod;
    }

    public void setObwod(double o) {
        if (o < 0) {
            System.out.println("Promien nie może być ujemny");
        } else {
            this.radius = o;
        }

    }

}

