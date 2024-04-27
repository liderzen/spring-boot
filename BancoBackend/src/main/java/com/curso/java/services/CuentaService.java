package com.curso.java.services;

import java.util.List;
import com.curso.java.models.Cuenta;

public interface CuentaService {

	List<Cuenta> obtenerCuenta();
	Cuenta guardarCuenta(Cuenta cliente);
	Cuenta actualizarCuenta(Cuenta cliente);
	Cuenta eliminarCuenta(Long id);
}
