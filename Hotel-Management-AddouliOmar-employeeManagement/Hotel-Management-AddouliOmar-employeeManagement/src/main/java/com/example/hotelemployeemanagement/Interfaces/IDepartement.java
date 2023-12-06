package com.example.hotelemployeemanagement.Interfaces;

import com.example.hotelemployeemanagement.Entities.Departement;
import com.example.hotelemployeemanagement.Entities.Employee;

import java.util.List;

public interface IDepartement {
    public Departement add(Departement E);

    public Departement update(Departement E);

    public List<Departement> getAll();

    public Departement getById(long id);

    public void delete(long id);
}
