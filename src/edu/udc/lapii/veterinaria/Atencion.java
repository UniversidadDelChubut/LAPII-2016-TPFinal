package edu.udc.lapii.veterinaria;

import java.util.Date;

public abstract class Atencion {
	
	private Date fechaDeAtencion;
	private String dianostico;
	private String observaciones;
	private int numeroAtencion;
	private PracticaMedica practicaMedica;
	private Veterinario veterinario;
	private Vacunacion vacunacion;
	public Atencion(int numeroAtencion,Date fechaDeAtencion, String dianostico, String observaciones, 
			PracticaMedica practicaMedica, Veterinario veterinario,
			Vacunacion vacunacion) {
		super();
		this.numeroAtencion=numeroAtencion;
		this.fechaDeAtencion = fechaDeAtencion;
		this.dianostico = dianostico;
		this.observaciones = observaciones;
		this.practicaMedica = practicaMedica;
		this.veterinario = veterinario;
		this.vacunacion = vacunacion;
	}
	
	public abstract String getTipo();
	
	
	public int getNumeroAtencion(){
		return numeroAtencion;
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
