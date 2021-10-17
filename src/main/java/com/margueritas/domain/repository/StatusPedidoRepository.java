package com.margueritas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.margueritas.domain.model.StatusPedido;

@Repository
public interface StatusPedidoRepository extends JpaRepository<StatusPedido, Long> {

}
