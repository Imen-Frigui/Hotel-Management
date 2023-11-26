package com.example.hotelemployeemanagement.Services;


import com.example.hotelemployeemanagement.Entities.Departement;
import com.example.hotelemployeemanagement.Entities.Employee;
import com.example.hotelemployeemanagement.Interfaces.IDepartement;
import com.example.hotelemployeemanagement.Repositories.DepartementRepository;
import com.example.hotelemployeemanagement.Repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartementService implements IDepartement {
    private DepartementRepository departementRepository;
    @Override
    public Departement add(Departement E) {
        return departementRepository.save(E);
    }

    @Override
    public Departement update(Departement E) {
        return departementRepository.save(E);
    }

    @Override
    public List<Departement> getAll() {
        return departementRepository.findAll();
    }

    @Override
    public Departement getById(long id) {
        return departementRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        departementRepository.deleteById(id);
    }
}
