package com.example.demo.repositories;

import com.example.demo.entities.Compte;
import com.example.demo.enums.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;

@RepositoryRestController
public interface CompteRepository extends JpaRepository<Compte,Long> {
    @RestResource(path = "byType")
    List<Compte> findByType(@Param(value = "type") TypeCompte typeCompte);
}
