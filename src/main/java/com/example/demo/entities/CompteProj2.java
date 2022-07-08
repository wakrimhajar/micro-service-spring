package com.example.demo.entities;

import com.example.demo.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p2",types = Compte.class)
public interface CompteProj2 {
    double getSolde();
    TypeCompte getType();
}
