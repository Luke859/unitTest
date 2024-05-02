package com.sip.ams;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sip.ams.entities.Etudiant;
import com.sip.ams.repositories.EtudiantRepository;

@DataJpaTest
public class TestDemoDataController {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Test
    @Order(1)
    public void test_CreateEtudiant() {
        Etudiant savedEtudiant = etudiantRepository.save(new Etudiant("Luke", 21));
        assertThat(savedEtudiant.getId()).isGreaterThan(0);
    }

    @Test
    @Order(2)
    public void test_FindByName() {
        Etudiant etudiant = etudiantRepository.findByName("Luke");
        assertThat(etudiant.getName()).isEqualTo("Luke");
    }
}