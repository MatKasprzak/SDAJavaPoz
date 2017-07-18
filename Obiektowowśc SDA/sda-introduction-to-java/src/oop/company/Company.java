package oop.company;


public class Company {

    private String name;
    private Employee[] employees;
    private int numberOfEmployees;

    public Company() {
        employees = new Employee[10];
        numberOfEmployees = 0;
    }


    //napisac metode ktora wyswietli wszystkich pracownikow
    // Wadliwa metoda bo po wypisaniu pierwszego pracownika pojawia sie bład Nullpointer exception kiedy próbuje wypisac pozostałych niewpisanych
    public void printEmployeesBad() {
        for (Employee emp : employees) {
            emp.describeEmployee();
        }
    }

    public void printEmployees() {
        if (numberOfEmployees > 0) {
            for (int i = 0; i < numberOfEmployees; i++) {
                Employee emp = employees[i];
                emp.describeEmployee();
            }
        } else
            System.out.println("Nie ma pracowników do wyświetlenia");
    }

    //Metoda do dodawania pracownika do tablica pracownikow

    public void addEmployee(Employee nextEmployee) {
        employees[numberOfEmployees] = nextEmployee;
        numberOfEmployees++;
    }
// return nie jest potrzebny jesli go dalej nigdzie nie wykorzystujemy
    //w tym wariancie kiedy funkcja drukuje wynik nie jest on potrzebny do jego uzyskania
    public double countAvarageSalary() {
        //policzyć średnia pensje dla praconwików
        double avarageSalary = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            avarageSalary += employees[i].getSalary();
        }
        avarageSalary = avarageSalary / numberOfEmployees;
        System.out.println("Srednia pensja to: " + avarageSalary);
        return avarageSalary;
    }

    public double countAverageAge() {
        double avarageAge = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            avarageAge += employees[i].getAge();
        }
        avarageAge = avarageAge / numberOfEmployees;
        System.out.println("Sredni wiek to: " + avarageAge);
        return avarageAge;
    }

    public double getEmployeeHighiesSalary() {
        double highiestSalary = 0;
        int idHighiestSalary = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            if (highiestSalary < employees[i].getSalary()) {
                highiestSalary = employees[i].getSalary();
                idHighiestSalary = i;
            }
        }
        System.out.println("Najwięcej zarabia: " + employees[idHighiestSalary].getName() + " " + employees[idHighiestSalary].getSurname() +
                "\n"+ "Jego pensja to: " + highiestSalary);
        return highiestSalary;
    }

}

