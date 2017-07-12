import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] tablica = new int[30];

        // wypełnienie tablicy
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(100);
        }
        System.out.println("Podaj liczbe - sprawdze czy taka jest");
        int szukanaLiczba = scanner.nextInt();

        /*for( int elem: tablica) { // działa moja próba zad 5 sprawdza cyz taka liczba jest w zbiorze
            if (liczba == elem) {
                System.out.println("yes");*/
        boolean czyobecna = false;
        while (czyobecna == false) {
            for (int i = 0; i < tablica.length; i++) {
                if (tablica[i] == szukanaLiczba) {
                    czyobecna = true;
                    break;
                }

            }System.out.println("Podaj liczbe - sprawdze czy taka jest");
            szukanaLiczba = scanner.nextInt();

            if (czyobecna) {
                System.out.println("mam taką liczbę");
            } else {
                System.out.println("Nie ma takiej liczby");

            }
        }
    }
        }


