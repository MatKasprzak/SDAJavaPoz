package excercise;


import com.sun.org.apache.xpath.internal.SourceTree;
import oop.mathematic.Company.Company;
import oop.mathematic.Company.Emplpyee;

import java.util.Scanner;

public class CompanyExcercise {
    private Company myCompany;
    private Scanner scanner;

    public CompanyExcercise() {
        this.myCompany = new Company();
        scanner = new Scanner(System.in);

    }

    public void start() {

        boolean exit = false;


        while (exit == false) {


            System.out.println("Wybierz opcję: ");
            System.out.println("1. Dodaj nowego pracownika");
            System.out.println("2. Usuń pracownika");
            System.out.println("3. Wypisz pracownika");
            System.out.println("0. Wyjdź z programu");
            int option = scanner.nextInt();

            switch (option) {
                case 1: {
                    addEployeeToMyCompany(); // lokalna metoda

                    break;
                }
                case 2: {
                    deleteEmployeeFromMyCompany();

                    break;
                }
                case 3: {
                    printAllEmployees();

                    break;
                }
                case 4: {

                    break;
                }
                case 0: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Nie ma takiej opcji");
                    break;
                }
            }

        }

    }

    // Metoda lokalna "z main" która służy do skrócenia switcha
    public void addEployeeToMyCompany() {
        Emplpyee nextEmp = new Emplpyee();
        System.out.println("Podaj imie");
        nextEmp.setName(scanner.next());

        System.out.println("Podaj nazwisko");
        nextEmp.setSurname(scanner.next());

        System.out.println("Podaj wiek");
        nextEmp.setAge(scanner.nextInt());

        System.out.println("Podaj pensje");
        nextEmp.setSalary(scanner.nextDouble());
//metoda wywyołana na obiekcie my company gdzie myCompany to pole prywatne tej klasy ("naszego maina")
        myCompany.addEmployee(nextEmp);

    }

    //Logika usuwania pracownika
    public void deleteEmployeeFromMyCompany() {

    }

    //logika wyświetlania pracownika
    public void printAllEmployees() {
myCompany.printEmoployees();
    }
}
