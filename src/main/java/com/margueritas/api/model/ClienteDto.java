package com.margueritas.api.model;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {

	private Long id;
	private OffsetDateTime lastLogin;
	private boolean isSuperUser;
	private String nome;
	private String sobrenome;
	private String telefone;
	private String email;
	private String rg;
	private String cpf;
	private boolean isStaff;
}
