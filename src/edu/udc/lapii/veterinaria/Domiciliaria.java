package edu.udc.lapii.veterinaria;

import java.util.Date;

public class Domiciliaria extends Atencion{
	
	private String donde;
	
	public Domiciliaria(int numeroAtencion,Date fechaDeAtencion, String dianostico, String observaciones,
			 PracticaMedica practicaMedica, Veterinario veterinario,
			Vacunacion vacunacion) {
		super(numeroAtencion,fechaDeAtencion, dianostico, observaciones,  practicaMedica, veterinario,
				vacunacion);
	}
	
	public String getDonde(){
		return donde;
	}
	
	public void setDonde(String donde) {
		this.donde = donde;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Domiciliaria";
		
	}

	@Override
	public String toString() {
		return "Domiciliaria";
	}

	


}
