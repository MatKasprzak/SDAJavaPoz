package com.sda.planer.planer.Services;

import com.sda.planer.planer.model.Employee;
import com.sda.planer.planer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Component
public class EmployeeService {


    private EmployeeRepository employeeRepository;
    
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public List<Employee> getAllEmployees(){
        return StreamSupport.stream(employeeRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }
    public Employee getEmployee(long id){
        return employeeRepository.findOne(id);
    }
    public int saveEmployee(Employee employee){
        return (int) employeeRepository.save(employee).getId();
    }


}
