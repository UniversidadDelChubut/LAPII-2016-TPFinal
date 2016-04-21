package edu.udc.lapii.veterinaria;

import java.util.Date;

public class Internacion extends Atencion {
	
	public Internacion(Date fechaDeAtencion, String dianostico, String observaciones, Ambulatorio ambulatorio,
			Domiciliaria domiciliaria, Internacion internacion, PracticaMedica practicaMedica, Veterinario veterinario,
			Vacunacion vacunacion) {
		super(fechaDeAtencion, dianostico, observaciones, ambulatorio, domiciliaria, internacion, practicaMedica, veterinario,
				vacunacion);
		// TODO Auto-generated constructor stub
	}

	private Date fechaDeAlta;

	
	
}
