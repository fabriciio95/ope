package com.margueritas.domain.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Pedido {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "idcliente")
	private Usuario cliente;
	
	@ManyToOne
	@JoinColumn(name = "idformapagamento")
	private FormaPagamento formaPagamento;
	
	@ManyToOne
	@JoinColumn(name = "idstatus")
	private StatusPedido status;
	private LocalDate data;
	
	@Column(name = "obs")
	private String observacoes;
}
