package com.curso.java.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.curso.java.models.Cliente;
import com.curso.java.repositories.ClienteRepository;
import com.curso.java.services.ClienteService;

public class ClienteServiceImpl implements ClienteService {
	
@Autowired ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> obtenerClientes(){
		return clienteRepository.findAll();
		
	}
	
	@Override
	public Cliente guardarCliente(Cliente cliente) {
		if(!clienteRepository.findByIdentificacion(cliente.getIdentificacion()).isPresent()) {
			return clienteRepository.save(cliente);
		}
		return null;
	}
	
	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		
		if(clienteRepository.findById(cliente.getIdCliente()).isPresent()) {
			return clienteRepository.save(cliente);
		}
		else {
			return null;
		}
	}
	
	@Override
	public Boolean eliminarCliente(Long id) {
		if(clienteRepository.findById(id).isPresent()) {
			clienteRepository.deleteById(id);
			return true;
		}
		
		return false;
	}

}
