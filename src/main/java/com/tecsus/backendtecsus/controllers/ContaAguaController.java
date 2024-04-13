package com.tecsus.backendtecsus.controllers;


import com.tecsus.backendtecsus.models.ContaAgua;
import com.tecsus.backendtecsus.services.ContaAguaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/conta_agua")
@CrossOrigin
public class ContaAguaController {

    @Autowired
    private ContaAguaService contaAguaService;

    @GetMapping
    public ResponseEntity<List<ContaAgua>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(contaAguaService.findAll());
    }

}
