package org.atelier.voitures.controller;

import org.atelier.voitures.core.Voitures;
import org.atelier.voitures.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@RestController
@RequestMapping("/cars")
public class VoitureController {
    @Autowired
    private VoitureService voitureService;
     @GetMapping
     public Iterable<Voitures> getVoitures() {
         return voitureService.getVoitures();
     }

    @GetMapping("/{id}")
    public Optional<Voitures> getVoiture(@PathVariable Integer id){
        return voitureService.getVoiture(id);
    }

    @PostMapping
    public void addVoiture(@RequestBody Voitures voiture) {
         voitureService.addVoiture(voiture);
    }

    @PutMapping("/{id}")
    public void editVoiture(@RequestBody Voitures voiture, @PathVariable Integer id) {
        voitureService.editVoiture(id, voiture);
    }

    @DeleteMapping("/{id}")
    public void deleteVoiture(@PathVariable Integer id) {
        voitureService.deleteVoiture(id);
    }

}