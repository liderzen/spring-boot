package com.curso.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.java.models.Cliente;
import com.curso.java.services.ClienteService;
import com.curso.java.utils.WebUtil;

@RestController
@RequestMapping("/api")
public class ClienteController extends BaseController {
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping()
	public ResponseEntity<?> obtener() {
		List<Cliente> clientes = clienteService.obtenerClientes();
		if(clientes == null || clientes.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(clientes);
	}

	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody @Validated Cliente cliente, BindingResult result) {
		if(result.hasErrors()) {
			return WebUtil.getErrors(result);
		}
		
		Cliente newCliente = clienteService.guardarCliente(cliente);
		
		if(newCliente == null) {
			throw new DataIntegrityViolationException("Ya existe un Cliente: " + cliente.getNombres());
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(newCliente);
	}

	@PutMapping
	public ResponseEntity<?> actualizar(@RequestBody Cliente cliente) {
		Cliente clienteUpdate = clienteService.actualizarCliente(cliente);
		if(clienteUpdate == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("El Cliente que desea actualizar no existe");
		}

		return ResponseEntity.status(HttpStatus.OK).body(clienteUpdate);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> eliminar(@PathVariable(value = "id") Long id) {
		if (clienteService.eliminarCliente(id)) {
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
}
