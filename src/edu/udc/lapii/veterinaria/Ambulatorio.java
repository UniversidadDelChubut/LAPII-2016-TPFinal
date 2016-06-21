package edu.udc.lapii.veterinaria;

import java.util.Date;

public class Ambulatorio extends Atencion {

	public Ambulatorio(int numeroAtencion,Date fechaDeAtencion, String dianostico, String observaciones,
			PracticaMedica practicaMedica, Veterinario veterinario,
			Vacunacion vacunacion) {
		super(numeroAtencion,fechaDeAtencion, dianostico, observaciones,  practicaMedica, veterinario,
				vacunacion);
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Ambulatoria";
	}
	
	@Override
	public String toString() {
		return "Ambulatoria";
	}
	
	
	
}
