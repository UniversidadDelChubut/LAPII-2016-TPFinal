package edu.udc.lapii.veterinaria;

import java.util.Date;

public class Atencion {
	
	private Date fechaDeAtencion;
	private String dianostico;
	private String observaciones;
	
	private Ambulatorio ambulatorio;
	private Domiciliaria domiciliaria;
	private Internacion internacion;
	private PracticaMedica practicaMedica;
	private Veterinario veterinario;
	private Vacunacion vacunacion;
	public Atencion(Date fechaDeAtencion, String dianostico, String observaciones, Ambulatorio ambulatorio,
			Domiciliaria domiciliaria, Internacion internacion, PracticaMedica practicaMedica, Veterinario veterinario,
			Vacunacion vacunacion) {
		super();
		this.fechaDeAtencion = fechaDeAtencion;
		this.dianostico = dianostico;
		this.observaciones = observaciones;
		this.ambulatorio = ambulatorio;
		this.domiciliaria = domiciliaria;
		this.internacion = internacion;
		this.practicaMedica = practicaMedica;
		this.veterinario = veterinario;
		this.vacunacion = vacunacion;
	}
	public Date getFechaDeAtencion() {
		return fechaDeAtencion;
	}
	public String getDianostico() {
		return dianostico;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public Ambulatorio getAmbulatorio() {
		return ambulatorio;
	}
	public Domiciliaria getDomiciliaria() {
		return domiciliaria;
	}
	public Internacion getInternacion() {
		return internacion;
	}
	public PracticaMedica getPracticaMedica() {
		return practicaMedica;
	}
	public Veterinario getVeterinario() {
		return veterinario;
	}
	public Vacunacion getVacunacion() {
		return vacunacion;
	}
	
	
	
	
	
}
