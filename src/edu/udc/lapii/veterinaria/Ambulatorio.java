package edu.udc.lapii.veterinaria;

import java.util.Date;

public class Ambulatorio extends Atencion {

	public Ambulatorio(Date fechaDeAtencion, String dianostico, String observaciones, Ambulatorio ambulatorio,
			Domiciliaria domiciliaria, Internacion internacion, PracticaMedica practicaMedica, Veterinario veterinario,
			Vacunacion vacunacion) {
		super(fechaDeAtencion, dianostico, observaciones, ambulatorio, domiciliaria, internacion, practicaMedica, veterinario,
				vacunacion);
	}

}
