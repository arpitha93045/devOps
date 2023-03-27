package com.springrest.springrest.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tbl_employee")
public class Employee {
  
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer   id;
  @Column
  private String name;
  @Column
  private String gender;
  @Column
  private String department;
  @Column
  private Date dob;
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  public void setDepartment(String department) {
    this.department = department;
  }
  
  public void setDob(Date dob) {
    this.dob = dob;
  }
  
  public Integer getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
  
  public String getGender() {
    return gender;
  }
  
  public String getDepartment() {
    return department;
  }
  
  public Date getDob() {
    return dob;
  }
}
