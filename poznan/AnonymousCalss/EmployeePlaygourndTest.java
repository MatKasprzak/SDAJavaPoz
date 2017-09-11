package pl.sda.poznan.AnonymousCalss;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class EmployeePlaygourndTest {
    @Test
public void getEmployeesWithSalary() throws Exception {
        EmployeeOperations employeeOperations = new EmployeeOperations();
        List<Employee> employeesWithSalary = employeeOperations.getEmployeesWithSalary(3000);
        employeesWithSalary.forEach(System.out::println);
    }
    @Test
    public void streamTest(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Piotr", "Ziutek", 20, 2000));
        Stream<Employee> employeeStream = employees.stream().filter(x -> x.getSalary() > 2600);

        employees.add(new Employee("Pirwaeyr", "Ziaerh", 20, 2000));

        Stream<Employee> employeeStream1 = employeeStream.filter(x -> x.getSalary() < 4500);
        List<Employee> result = employeeStream1.collect(Collectors.toList());

        System.out.println(result.size());
        
    }
}