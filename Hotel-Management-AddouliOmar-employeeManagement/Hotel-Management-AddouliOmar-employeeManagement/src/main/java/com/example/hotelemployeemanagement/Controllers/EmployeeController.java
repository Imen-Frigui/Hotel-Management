package com.example.hotelemployeemanagement.Controllers;


import com.example.hotelemployeemanagement.Entities.Employee;
import com.example.hotelemployeemanagement.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee add(@RequestBody Employee s) {
        return employeeService.add(s);
    }

    @GetMapping("/getAll")
//    @CrossOrigin(origins = "*")
    public List<Employee> findAll() {
        return employeeService.getAll();
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee s) {
        return employeeService.update(s);
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
