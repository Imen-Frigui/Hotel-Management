package com.esprit.microservices.reclamation.service;

import com.esprit.microservices.reclamation.entity.Reclamation;
import com.esprit.microservices.reclamation.repository.ReclamationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamationService {
    @Autowired
    private ReclamationRepository reclamationRepository;

    public Reclamation addReclamation(Reclamation reclamation){
        return reclamationRepository.save(reclamation);
    }
    public List<Reclamation> getAllReclamations(){
        return reclamationRepository.findAll();
    }
    public Reclamation update(int id,Reclamation newReclamation){
        if (reclamationRepository.findById(id).isPresent()) {
            Reclamation existingReclamation = reclamationRepository.findById(id).get();
            existingReclamation.setDescription(newReclamation.getDescription());
            existingReclamation.setDate(newReclamation.getDate());
            existingReclamation.setStatut(newReclamation.getStatut());
            existingReclamation.setType(newReclamation.getType());
            return reclamationRepository.save(existingReclamation);
        } else
            return null;
    }
    public String delete(int id) {
        if (reclamationRepository.findById(id).isPresent()) {
            reclamationRepository.deleteById(id);
            return "reclamation deleted";
        } else
            return "reclamation not deleted";
    }

}
