package edu.udc.lapii.veterinaria;

import java.util.Date;

public class Vacunacion {

	private Date fechaDeVacunacion;
	private Vacunas vacunas;
	
	public Date getFechaDeVacunacion() {
		return fechaDeVacunacion;
	}
	
	public void setFechaDeVacunacion(Date fechaDeVacunacion) {
		this.fechaDeVacunacion = fechaDeVacunacion;
	}
	
	public Vacunas getVacunas() {
		return vacunas;
	}
	
	public void setVacunas(Vacunas vacunas) {
		this.vacunas = vacunas;
	}
	
	
}
