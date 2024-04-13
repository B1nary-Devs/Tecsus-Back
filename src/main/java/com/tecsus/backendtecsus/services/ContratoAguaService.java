package com.tecsus.backendtecsus.services;

import com.tecsus.backendtecsus.models.ContratoAgua;
import com.tecsus.backendtecsus.repositories.ContratoAguaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoAguaService {


    @Autowired
    private ContratoAguaRepository contratoAguaRepository;

    @Transactional
    public List<ContratoAgua> findAll(){
        return contratoAguaRepository.findAll();
    }


}