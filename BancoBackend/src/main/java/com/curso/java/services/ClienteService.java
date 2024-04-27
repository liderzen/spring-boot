package com.curso.java.services;

import java.util.List;
import com.curso.java.models.Cliente;

public interface ClienteService {

	List<Cliente> obtenerClientes();
	Cliente guardarCliente(Cliente cliente);
	Cliente actualizarCliente(Cliente cliente);
	Boolean eliminarCliente(Long id);
}
