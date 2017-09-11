package pl.sda.poznan.AnonymousCalss;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class EmployeeOperations {
    private List<Employee> employesList = new ArrayList<>();

    public EmployeeOperations(){
        Employee red = new Employee("Ziutek", "Ziutkowski", 20, 2000);
        Employee red1 = new Employee("Ziutek", "Fiutkowski", 20, 2500);
        Employee red2 = new Employee("Ziutek", "Kiutkowski", 20, 3000);
        Employee red3572 = new Employee("Ziutek", "Tiutkowski", 20, 6500);
        Employee red4 = new Employee("Ziutek", "Riutkowski", 20, 4000);
        Employee red5 = new Employee("Ziutek", "Piutkowski", 20, 4500);
        Employee red6 = new Employee("Ziutek", "Ziutkowski", 20, 5000);

        employesList.add(red);
        employesList.add(red1);
                employesList.add(red2);
        employesList.add(red3572);
        employesList.add(red4);
        employesList.add(red5);
        employesList.add(red6);

    }

    public void printAlllWithHighSalary() {
        for (Employee emp : employesList) {
            if (emp.getSalary() > 3000) {
                System.out.println(emp);
            }
        }
        employesList.forEach(emp -> {
            if (emp.getSalary() > 2500)
                System.out.println(emp);
        });
    }

    public void printNumber() {
        final int[] count = {0};
        employesList.forEach(emp -> {
            if (emp.getSalary() > 2500) {
                count[0]++;
            }
        });
        System.out.println("Zliczonych procowników: " + count[0]);
    }
    public long streamFilter(){
        long count = employesList.stream().filter(employee -> employee.getSalary() > 2500).count();
        return count;
    }

    public List<Employee> getEmployeesWithSalary(double salary){
        List<Employee> result = employesList.stream()
                .filter(employee -> employee.getSalary() > salary)
                .sorted(Comparator.comparing(Employee::getSurname))
                .collect(Collectors.toList());
        //To ponizej moje
       /* List<Employee> EmployeesWithSalary = employesList.stream().filter(employee -> employee.getSalary() > salary).collect(Collectors.toList());
        System.out.println(EmployeesWithSalary.toString());
        return EmployeesWithSalary;*/
       return result;
    }
}
