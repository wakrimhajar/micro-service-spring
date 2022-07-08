package com.example.demo.web;

import com.example.demo.dto.VirementRequestDTO;
import com.example.demo.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    @Autowired
    private CompteService compteService;

    @PutMapping(path = "/comptes/virement")
    public void virement(@RequestBody VirementRequestDTO requestDTO){
        compteService.virement(requestDTO.getCodeSource(), requestDTO.getCodeDestination(), requestDTO.getMontant());
    }
}
