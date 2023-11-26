package com.example.hotelemployeemanagement.Services;


import com.example.hotelemployeemanagement.Entities.Employee;
import com.example.hotelemployeemanagement.Interfaces.IEmployee;
import com.example.hotelemployeemanagement.Repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService implements IEmployee {
    private EmployeeRepository employeeRepository;

    @Override
    public Employee add(Employee E) {
        return employeeRepository.save(E);
    }

    @Override
    public Employee update(Employee E) {
        return employeeRepository.save(E);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        employeeRepository.deleteById(id);
    }
}
