package com.esprit.microservices.reclamation.service;

import com.esprit.microservices.reclamation.entity.Reclamation;
import com.esprit.microservices.reclamation.repository.ReclamationRepository;
import com.esprit.microservices.reclamation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamationService {
    @Autowired
    private ReclamationRepository reclamationRepository;
    @Autowired
    private UserRepository userRepository;
    public Reclamation addReclamation(Reclamation reclamation){
      //  User user = userRepository.findById(userId).orElse(null);

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
            existingReclamation.setStatus(newReclamation.getStatus());
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
    public Reclamation acceptReclamation(int id) {
        Reclamation reclamation = reclamationRepository.findById(id).orElse(null);

        if (reclamation!=null) {
            reclamation.accept();
            return reclamationRepository.save(reclamation);
        } else {
            return null;
        }
    }

    public Reclamation rejectReclamation(int id) {
        Reclamation reclamation = reclamationRepository.findById(id).orElse(null);

        if (reclamation!=null) {
            reclamation.reject();
            return reclamationRepository.save(reclamation);
        } else {
           return null;
        }
    }

}
