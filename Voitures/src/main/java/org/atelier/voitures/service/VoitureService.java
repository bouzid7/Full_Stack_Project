package org.atelier.voitures.service;

import org.atelier.voitures.core.Voitures;
import org.atelier.voitures.exception.ResourceNotFoundException;
import org.atelier.voitures.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.Optional;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public Iterable<Voitures> getVoitures() {
        return  voitureRepository.findAll();
    }


    public Optional<Voitures> getVoiture(Integer id) {
        return  voitureRepository.findById(id);
    }

   public void addVoiture(Voitures voiture) {
       voitureRepository.save(voiture);

   }

    public void editVoiture(Integer id, Voitures voiture) {

        try{
            Optional<Voitures> voitureOptional = voitureRepository.findById(id);

            if (voitureOptional.isPresent()) {
                Voitures existingVoiture = voitureOptional.get();

                existingVoiture.setMarque(voiture.getMarque());
                existingVoiture.setModele(voiture.getModele());
                existingVoiture.setPrix(voiture.getPrix());
                existingVoiture.setCouleur(voiture.getCouleur());
                existingVoiture.setAnnee(voiture.getAnnee());

                voitureRepository.save(existingVoiture);
            }

        } catch (ResourceNotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Voiture with ID " + id + " not found", e);
        }

    }

    public void deleteVoiture(Integer id) {
        voitureRepository.deleteById(id);
    }

}
