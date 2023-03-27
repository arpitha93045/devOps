package com.springrest.springrest.service;

import com.springrest.springrest.entities.Employee;
import java.util.List;

public interface EmployeeService {
  List<Employee> get();
  
  Employee get(int i);
  
  void save (Employee employee);
  
  void delete(int id);

}
