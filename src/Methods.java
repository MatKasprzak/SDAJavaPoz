import sun.security.krb5.internal.crypto.Des;

import java.util.Random;
import java.util.Scanner;

public class Main {
//Definicja
    public  static void PrintMessage(String imie) {
        System.out.println("Witaj " + imie);
        }
        public static void DescribeUser(String name, String surname, int age) {
            System.out.println(name + " " + surname + " " + age);
        }
        public static void PrintArray(int[] array) {
            for (int i: array) {
                System.out.println(i);
            }
            System.out.println();
        }
        public static int AddElement (int a, int b) {
            int suma = a + b;

            return suma;
        }

        public static int Factorial(int n) {
            int wynik = 1;
            for(int i = 1; i<= n;i++){
                wynik += i;
            }return wynik;
        }
        //SumArray oblicza sume w tablicy
        public static int SumArray (int[] array) {
            int sum = 0;
            for(int i = 0; i < array.length; i++) {
                sum += array[i];
            }return sum;
        }

        public static float sredniaArray (float[] array){
            float suma = 0;
            float srednia = 0;
            for(int i = 0; i < array.length; i++) {
                suma += array[i];
                srednia = suma / array.length;
            }return srednia;
        }
        public static float[] InitializeArray(float[] array) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj elementy tablicy ");
            for( int i = 0; i < array.length; i++) {
                System.out.println("Podaj " + (i + 1) + " elementy tablicy");
                array[i] = scanner.nextFloat();
            }return array;
            }
        public static float[] InitializeRandomArray(float[] array) {
            Random random = new Random();
            for ( int i = 0; i < array.length; i++) {
                array[i] = random.nextFloat() * 50 + 5;
            }return array;
        }


    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imieUzytkownika = scanner.nextLine();

        System.out.println("Wyświetla tablice");
        int[] tab = new int[] {1,2,3};
        for (int i = 0; i < 3; i++) {
        }
        PrintArray(tab);


        PrintMessage(imieUzytkownika);
//przywołanie funkcji addelement
        DescribeUser("Piotr", "Nowacki", 25);*/
        /*int pierwszaliczba = 5;//to niepotrzebne
        int drugaLicza = 15;
        int wynik = AddElement(5,15);
        System.out.println(wynik);*/
        //Wyświetla wynik silni
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int n = scanner.nextInt();
        int wynik = Factorial(n);
        System.out.println("Wynik to " + wynik);*/

        Scanner scanner = new Scanner(System.in);

//funkcja sumowania
        /*System.out.println("Wielkośc tablicy");
        int wielkosc = scanner.nextInt();
        int[] array = new int[wielkosc];
        for (int i = 0; i < wielkosc; i++) {
            System.out.println("Podaj liczbe");
            array[i] = scanner.nextInt();
        }
        int result = SumArray(array);
        System.out.println("Sum is " + result);*/
// sredniej obliczanie na podstawie danych użytkownika
        System.out.println("Wielkośc tablicy");
        int wielkosc = scanner.nextInt();
        float[] array = new float[wielkosc];
        for (int i = 0; i < wielkosc; i++) {
            System.out.println("Podaj liczbe " + (i + 1));
            array[i] = scanner.nextFloat();
        }
        int result = (int)sredniaArray(array);
        System.out.println("Srednia to " + result);
        System.out.println("Podaj wielkość tablicy");
        int wielkosc = scanner.nextInt();

        float[] tablica = new float[wielkosc];
        tablica = InitializeRandomArray(tablica);
        for(float elem: tablica) {
            System.out.println(elem);
        }
        float result = sredniaArray(tablica);
        System.out.println("Srednia to " + result);






    }
}
