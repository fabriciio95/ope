package com.margueritas.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.margueritas.domain.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query("from Usuario where isStaff = false and lower(nome) like lower(concat('%', :nome, '%')) order by nome")
	List<Usuario> buscarClientesPorNome(String nome);
	
	@Query("from Usuario where isStaff = false and telefone like concat('%', :telefone, '%') order by nome")
	List<Usuario> buscarClientesPorTelefone(String telefone);
	
	@Query("from Usuario where isStaff = false order by nome")
	List<Usuario> buscarClientes();
}
