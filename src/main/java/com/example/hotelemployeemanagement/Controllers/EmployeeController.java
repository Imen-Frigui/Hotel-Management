package com.example.hotelemployeemanagement.Controllers;


import com.example.hotelemployeemanagement.Entities.Employee;
import com.example.hotelemployeemanagement.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee add(@RequestBody Employee s) {
        return employeeService.add(s);
    }

    @GetMapping("/getAll")
    public List<Employee> findAll() {
        return employeeService.getAll();
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee s) {
        Employee mod = employeeService.getById(s.getId());
        Field[] fields = Employee.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                Object updatedValue = field.get(s);
                if (updatedValue != null) {
                    field.set(mod, updatedValue);
                }
            } catch (IllegalAccessException error) {
                throw new RuntimeException("Failed to update entity fields", error);
            }
        }
        return employeeService.update(mod);
    }

    @GetMapping("/get/{id}")
    public Employee findById(@PathVariable long id) {
        return employeeService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        employeeService.delete(id);
    }

}
