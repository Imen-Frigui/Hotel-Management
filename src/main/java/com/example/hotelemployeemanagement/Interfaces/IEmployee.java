package com.example.hotelemployeemanagement.Interfaces;

import com.example.hotelemployeemanagement.Entities.Employee;

import java.util.List;

public interface IEmployee {
    public Employee add(Employee E);

    public Employee update(Employee E);

    public List<Employee> getAll();

    public Employee getById(long id);

    public void delete(long id);
}
