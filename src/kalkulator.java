import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        float b;
        float wynik;

        String operacja;
        System.out.println("Podaj pierwszą liczbę");
        a = scanner.nextInt();

        System.out.println("Podaj operację (+, -, *, /)");
        operacja = scanner.next();

        System.out.println("Podaj drugą liczbę");
        b = scanner.nextInt();

        switch (operacja) {
            case "+":
                wynik = a + b;
                break;
            case "-":
                wynik = a - b;
                break;
            case "*":
                wynik = a * b;
                break;
            case "/":
                wynik = a / b;
                if ( b == 0 ) {
                    System.out.println("Nie dziel przez 0");
                }
                break;
            default:
                wynik = 0;
                System.out.println("Nie można obliczyć");;
                break;

        } System.out.println("Wynik " + wynik);
    }
}