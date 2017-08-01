import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wielkość");
        int size = sc.nextInt();

        int[] tab = new int[size];
        System.out.println("Podaj elementy tablicy");
        for (int i = 0; i < size; i++){
            tab[i] = sc.nextInt();
        }
    }
}
