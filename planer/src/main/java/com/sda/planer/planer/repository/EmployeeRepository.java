package com.sda.planer.planer.repository;

import com.sda.planer.planer.model.Employee;
import org.springframework.data.repository.CrudRepository;

import javax.sql.rowset.CachedRowSet;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
}
