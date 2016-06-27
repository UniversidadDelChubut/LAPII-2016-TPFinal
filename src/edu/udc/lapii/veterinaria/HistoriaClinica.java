package edu.udc.lapii.veterinaria;

import java.util.LinkedList;


public class HistoriaClinica {
	private Animal animal;
	private LinkedList<Registro> registro = null;
	private LinkedList<Atencion> atenciones = null;
	
	public HistoriaClinica( Animal animal) {
		this.animal = animal;
		this.registro = new LinkedList<Registro>();
		this.atenciones = new LinkedList<Atencion>();
	}
	
	public void setRegistro(Registro registro) {
		this.registro.add(registro);
	}

	public LinkedList<Registro> getRegistro() {
		return this.registro;
	}
	
	public void setAtencion(Atencion atencion) {
		this.atenciones.add(atencion);
		
	}

	public LinkedList<Atencion> getAtencion() {
	return this.atenciones;
	}
	
	public Animal getAnimal(){
		return animal;
	}
}
