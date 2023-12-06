package com.example.hotelemployeemanagement.Repositories;

import com.example.hotelemployeemanagement.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
