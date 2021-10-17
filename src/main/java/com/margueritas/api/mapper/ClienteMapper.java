package com.margueritas.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.margueritas.api.model.ClienteDto;
import com.margueritas.domain.model.Usuario;

@Component
public class ClienteMapper {

	@Autowired
	private ModelMapper mapper;
	
	public ClienteDto toDto(Usuario cliente) {
		return mapper.map(cliente, ClienteDto.class);
	}
	
	public List<ClienteDto> toListaDto(List<Usuario> clientes) {
		return clientes.stream().map(this::toDto).collect(Collectors.toList());
	}
}
