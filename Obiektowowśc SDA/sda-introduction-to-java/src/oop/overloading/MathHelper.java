package oop.overloading;


public class MathHelper {
// Metoda o sygnaturze addNumbers (int, int)
    public int addNumbers (int a, int b){
        return a+b;
    }
    //Metoda o sygnaturze addNumber (float, float)
    public float addNumber (float a, float b){
        return a+b;
    }
    //Metoda o sygnaturze addNumber (double, double)
    public double addNumber (double a, double b) {
        return a+b;
    }
}
// Wysztkie metody maja rózne sygnatury wiec możemy je przeciążać