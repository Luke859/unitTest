package com.sip.ams.repositories;

import org.springframework.stereotype.Repository;

import com.sip.ams.entities.Etudiant;

@Repository
public interface EtudiantRepository {

    public Etudiant findByName(String name);

    public Etudiant save(Etudiant etudiant);
}
