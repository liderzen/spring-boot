package com.curso.java.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCliente; 
	
	private String nombres;
	
	private String direccionDomicilio;
	
	private String email;
	
	private String telefonoContacto;
	
	private String identificacion;
	
	public Cliente() {
		
	}

	public Cliente(Long idCliente, String cliente, String descripcion) {
		super();
		this.idCliente = idCliente;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccionDomicilio() {
		return direccionDomicilio;
	}

	public void setDireccionDomicilio(String direccionDomicilio) {
		this.direccionDomicilio = direccionDomicilio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
		
}
