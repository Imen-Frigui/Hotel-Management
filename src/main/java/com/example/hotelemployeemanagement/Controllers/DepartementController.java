package com.example.hotelemployeemanagement.Controllers;


import com.example.hotelemployeemanagement.Entities.Departement;
import com.example.hotelemployeemanagement.Entities.Employee;
import com.example.hotelemployeemanagement.Services.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;

@RestController
@RequestMapping("/departement")
public class DepartementController {

    @Autowired
    private DepartementService departementService;

    @PostMapping("/add")
    public Departement add(@RequestBody Departement s) {
        return departementService.add(s);
    }

    @GetMapping("/getAll")
    public List<Departement> findAll() {
        return departementService.getAll();
    }

    @PutMapping("/update")
    public Departement update(@RequestBody Departement s) {
        Departement mod = departementService.getById(s.getId());
        Field[] fields = Departement.class.getDeclaredFields();
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
        return departementService.update(mod);
    }

    @GetMapping("/get/{id}")
    public Departement findById(@PathVariable long id) {
        return departementService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        departementService.delete(id);
    }
}
