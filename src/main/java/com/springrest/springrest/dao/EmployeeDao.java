package com.springrest.springrest.dao;

import com.springrest.springrest.entities.Employee;
import java.util.List;

public interface EmployeeDao {

  List<Employee> get();
  
  Employee get(int i);
  
  void save (Employee employee);
  
  void delete(int id);

}
