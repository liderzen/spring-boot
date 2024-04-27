package com.curso.java.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdCuenta;
	
	private String NumeroCuenta;
	
	private String DescripcionCuenta;
	
	private String TipoCuenta;
	
	private Double SaldoCuenta;
	
	private String EstadoCuenta;

	public Long getIdCuenta() {
		return IdCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		IdCuenta = idCuenta;
	}

	public String getNumeroCuenta() {
		return NumeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}

	public String getDescripcionCuenta() {
		return DescripcionCuenta;
	}

	public void setDescripcionCuenta(String descripcionCuenta) {
		DescripcionCuenta = descripcionCuenta;
	}

	public String getTipoCuenta() {
		return TipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		TipoCuenta = tipoCuenta;
	}

	public Double getSaldoCuenta() {
		return SaldoCuenta;
	}

	public void setSaldoCuenta(Double saldoCuenta) {
		SaldoCuenta = saldoCuenta;
	}

	public String getEstadoCuenta() {
		return EstadoCuenta;
	}

	public void setEstadoCuenta(String estadoCuenta) {
		EstadoCuenta = estadoCuenta;
	}
	
}
