package ID;

import java.util.Scanner;

public class ID {


    public static void main(String[] args) {

        //Wpisywanie numeru dowodu
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer dowodu");

        String nrDowodu = sc.nextLine();

        char litera1 = nrDowodu.charAt(0);
        char litera2 = nrDowodu.charAt(1);
        char litera3 = nrDowodu.charAt(2);
        int cyfra1 = nrDowodu.charAt(3) - 48;
        int cyfra2 = nrDowodu.charAt(4) - 48;
        int cyfra3 = nrDowodu.charAt(5) - 48;
        int cyfra4 = nrDowodu.charAt(6) - 48;
        int cyfra5 = nrDowodu.charAt(7) - 48;
        int cyfra6 = nrDowodu.charAt(8) - 48;

        /*System.out.println("Podaj pierwszą literę");
        char litera1 = sc.next().charAt(0);
        System.out.println("Podaj drugą literę");
        char litera2 = sc.next().charAt(0);
        System.out.println("Podaj trzecią literę");
        char litera3 = sc.next().charAt(0);
        System.out.println("Podaj pierwszą liczbę");
        int cyfra1 = sc.nextInt();
        System.out.println("Podaj drugą liczbę");
        int cyfra2 = sc.nextInt();
        System.out.println("Podaj trzecią liczbę");
        int cyfra3 = sc.nextInt();
        System.out.println("Podaj czwartą liczbę");
        int cyfra4 = sc.nextInt();
        System.out.println("Podaj piątą liczbę");
        int cyfra5 = sc.nextInt();
        System.out.println("Podaj szóstą liczbę");
        int cyfra6 = sc.nextInt();*/
//Obliczanie wartości liter
        int wartoscLitery1 = (int) litera1 - 55;
        System.out.println(wartoscLitery1);
        int wartoscLitery2 = (int) litera2 - 55;
        System.out.println(wartoscLitery2);
        int wartoscLitery3 = (int) litera3 - 55;
        int suma = obliczanieSumy(wartoscLitery1, wartoscLitery2, wartoscLitery3, cyfra2, cyfra3, cyfra4, cyfra5, cyfra6);
        //Sprawdzanie legitności
        if (suma % 10 == cyfra1){
            System.out.println("legitnie");
        }else {
            System.out.println("Nie legitnie");
            System.out.println("Policja poinformowana");
        }

    }
    private static int obliczanieSumy(int wartoscLitery1, int wartoscLitery2, int wartoscLitery3, int cyfra2, int cyfra3, int cyfra4, int cyfra5, int cyfra6) {
        int suma;
        suma = 7 * wartoscLitery1 + 3 * wartoscLitery2 + 1 * wartoscLitery3 +  + 7 * cyfra2 + 3 * cyfra3 + 1 * cyfra4 + 7 * cyfra5 + 3 * cyfra6;
        System.out.println(suma);
        return suma;
    }

}
