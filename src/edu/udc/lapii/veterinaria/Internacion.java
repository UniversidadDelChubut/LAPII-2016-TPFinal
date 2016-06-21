package edu.udc.lapii.veterinaria;

import java.util.Date;

public class Internacion extends Atencion {
	
	private Date fechaDeAlta;

	public Internacion(int numeroAtencion,Date fechaDeAtencion, String dianostico, String observaciones
			, PracticaMedica practicaMedica, Veterinario veterinario,
			Vacunacion vacunacion) {
		super(numeroAtencion,fechaDeAtencion, dianostico, observaciones,  practicaMedica, veterinario,
				vacunacion);

	}

	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(Date fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Internacion";
	}

	@Override
	public String toString() {
		return "Internacion";
	}
	
	
}
