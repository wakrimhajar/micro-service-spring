package com.example.demo;

import com.example.demo.entities.Compte;
import com.example.demo.enums.TypeCompte;
import com.example.demo.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BanqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanqueApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository){
		return args -> {
			compteRepository.save(new Compte(null,98000,new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null,12000,new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null,2000,new Date(), TypeCompte.COURANT));
			compteRepository.findAll().forEach(cp->{
				System.out.println(cp.getType());
				System.out.println(cp.getSolde());
			});
		};
	}
}
