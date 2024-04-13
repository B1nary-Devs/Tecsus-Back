package com.tecsus.backendtecsus.repositories;

import com.tecsus.backendtecsus.models.ContaAgua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaAguaRepository extends JpaRepository <ContaAgua, Long> {
}
