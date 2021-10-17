package com.margueritas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.margueritas.domain.model.Insumo;

@Repository
public interface InsumoRepository extends JpaRepository<Insumo, Long> {

}
