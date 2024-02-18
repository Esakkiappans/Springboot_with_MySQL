package com.example.springtest.model;

import jakarta.persistence.*;

@Entity
@Table(name  = "student_registration")
public class dbmodels {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "sudentid")
    private Integer StudentId ;
    @Column(name = "name")
    private String Name ;
    @Column (name  = "department")
    private String Department;
    @Column(name = "address")
    private String Address;

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
