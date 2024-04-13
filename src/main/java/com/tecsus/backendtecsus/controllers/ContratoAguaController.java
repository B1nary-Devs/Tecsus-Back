package com.tecsus.backendtecsus.controllers;

import com.tecsus.backendtecsus.models.ContratoAgua;
import com.tecsus.backendtecsus.services.ContratoAguaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contrato_agua")
@CrossOrigin
public class ContratoAguaController {

    @Autowired
    private ContratoAguaService contratoAguaService;

    @GetMapping
    public ResponseEntity<List<ContratoAgua>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body( contratoAguaService.findAll());
    }

}
