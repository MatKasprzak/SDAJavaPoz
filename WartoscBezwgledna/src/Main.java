import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartośc");
        int value = sc.nextInt();
        int absolutevalue;
       // int absolutevalue = Math.abs(wartosc);
        if (value < 0 ) {
            absolutevalue = Math.abs(value);
        }else {
            absolutevalue = value;
        }
        System.out.println("Wartość bezwzględna to: " + absolutevalue );

    }
}
