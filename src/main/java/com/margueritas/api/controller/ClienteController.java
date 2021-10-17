package com.margueritas.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.margueritas.api.mapper.ClienteMapper;
import com.margueritas.api.model.ClienteDto;
import com.margueritas.domain.model.Usuario;
import com.margueritas.domain.repository.UsuarioRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/usuarios/clientes")
@AllArgsConstructor
public class ClienteController {

	private UsuarioRepository usuarioRepository;
	private ClienteMapper clienteMapper;
	
	@GetMapping
	public ResponseEntity<List<ClienteDto>> buscarClientes(@RequestParam(required = false) String nome, 
			@RequestParam(required = false) String telefone) {
		
		if(nome != null && telefone != null)
			return ResponseEntity.badRequest().build();
		
		List<Usuario> clientes;
		
		if(nome != null) 
			clientes = usuarioRepository.findByNomeContainingIgnoreCase(nome);
		else if (telefone != null) 
			clientes = usuarioRepository.findByTelefoneContaining(telefone);
		else
			clientes = usuarioRepository.findAll();
		
		return ResponseEntity.ok(clienteMapper.toListaDto(clientes));
	}
	
}
