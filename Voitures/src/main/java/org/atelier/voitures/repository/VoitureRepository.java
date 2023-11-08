package org.atelier.voitures.repository;

import org.atelier.voitures.core.Voitures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voitures, Integer> {

    }

