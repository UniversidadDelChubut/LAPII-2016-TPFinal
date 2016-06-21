package edu.udc.lapii.veterinaria;

import java.util.LinkedList;


public class HistoriaClinica {
	String nombre;
	String matricula;
	LinkedList<Registro> registro = null;
	LinkedList<Atencion> atenciones = null;
	
	public HistoriaClinica( String nombre, String matricula) {
		this.matricula = matricula;
		this.nombre = nombre;
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
}
