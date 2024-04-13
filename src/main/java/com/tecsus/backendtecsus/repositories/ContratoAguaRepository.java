package com.tecsus.backendtecsus.repositories;

import com.tecsus.backendtecsus.models.ContratoAgua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoAguaRepository extends JpaRepository<ContratoAgua, Long> {
}
