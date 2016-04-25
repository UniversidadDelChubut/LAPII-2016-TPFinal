package edu.udc.lapii.veterinaria;

import java.util.Date;

public class Domiciliaria extends Atencion{
	
	private String donde;
	
	public Domiciliaria(Date fechaDeAtencion, String dianostico, String observaciones, Ambulatorio ambulatorio,
			Domiciliaria domiciliaria, Internacion internacion, PracticaMedica practicaMedica, Veterinario veterinario,
			Vacunacion vacunacion) {
		super(fechaDeAtencion, dianostico, observaciones, ambulatorio, domiciliaria, internacion, practicaMedica, veterinario,
				vacunacion);
	}
	
	public String getDonde(){
		return donde;
	}
	
	public void setDonde(String donde) {
		this.donde = donde;
	}

}
