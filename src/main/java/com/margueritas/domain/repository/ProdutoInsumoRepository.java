package com.margueritas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.margueritas.domain.model.ProdutoInsumo;

@Repository
public interface ProdutoInsumoRepository extends JpaRepository<ProdutoInsumo, Long> {

}
