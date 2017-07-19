package oop.overloading;


import java.util.Scanner;

public class StudentExcercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        String surname = scanner.nextLine();


        /*//kod przykladu
        Student studentInformatyki = new Student();

        Student studentPrawa = new Student(imie,surname);


        Author Mickiewicz = new Author("Adam","Mickiewicz",66);

        System.out.println(studentPrawa.getName());*/

        Rectangle r = new Rectangle(2,3);

        MathHelper helper = new MathHelper();
        int wynik = helper.addNumbers(10,15);
    }
}
