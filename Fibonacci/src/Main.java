import java.util.Scanner;

public class Main {

    public static int fib(int n) {

        if (n >2) {
            return fib(n-2) +fib(n-1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        byte x = sc.nextByte();

        System.out.println(fib(x));
    }
}
