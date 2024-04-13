package com.tecsus.backendtecsus.services;

import com.tecsus.backendtecsus.models.ContaAgua;
import com.tecsus.backendtecsus.repositories.ContaAguaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaAguaService {

    @Autowired
    private ContaAguaRepository contaAguaRepository;

    @Transactional
    public List<ContaAgua> findAll(){
        return contaAguaRepository.findAll();
    }

}
