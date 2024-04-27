package com.curso.java.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.java.models.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
	@Query("select c from Cuenta c where c.cuenta = : cuenta")
	Optional<Cuenta> findByIdentificacion(@Param("cuenta") String cuenta);//JPQL

}
