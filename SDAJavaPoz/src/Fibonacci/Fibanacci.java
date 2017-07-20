package Fibonacci;

import java.util.Scanner;

public class Fibanacci {

    public static int Fibanaci(int n) {
        int fib0 = 0;
        int fib1 = 1;
        int wynik = 0;

        for (int i = 1; i < n; i++){
            wynik = fib0 + fib1;
            fib0 = fib1;
            fib1 = wynik;
        }return wynik;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz wielkość");
        int n = scanner.nextInt();
        int wynik = Fibanaci(n);
        System.out.println(wynik);
    }
}
