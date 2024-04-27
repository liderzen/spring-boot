package com.curso.java.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.java.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	@Query("select cl from Cliente c where cl.cliente = : cliente")
	Optional<Cliente> findByIdentificacion(@Param("cliente") String cliente);//JPQL

}
