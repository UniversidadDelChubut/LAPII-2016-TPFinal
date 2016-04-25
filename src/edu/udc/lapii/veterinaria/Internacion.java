package edu.udc.lapii.veterinaria;

import java.util.Date;

public class Internacion extends Atencion {
	
	private Date fechaDeAlta;

	public Internacion(Date fechaDeAtencion, String dianostico, String observaciones, Ambulatorio ambulatorio,
			Domiciliaria domiciliaria, Internacion internacion, PracticaMedica practicaMedica, Veterinario veterinario,
			Vacunacion vacunacion) {
		super(fechaDeAtencion, dianostico, observaciones, ambulatorio, domiciliaria, internacion, practicaMedica, veterinario,
				vacunacion);

	}

	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(Date fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}


	
	
}
