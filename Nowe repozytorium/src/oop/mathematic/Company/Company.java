package oop.mathematic.Company;


public class Company {
    private String name;
    private Emplpyee[] emplpyees;
    private int numberOfEmployees = 0;

    public Company () {
        emplpyees = new Emplpyee[10];
    }
    public void printEmoployees() {
        for ( Emplpyee elem : emplpyees ) {
            elem.describeEmployee();
        }
    }
    //Metoda do dodawania pracowników
    public void addEmployee ( Emplpyee nextemplpyee ) {
        emplpyees[numberOfEmployees] = nextemplpyee;
        numberOfEmployees++;
    }
}
