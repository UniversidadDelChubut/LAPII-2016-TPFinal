package edu.udc.lapii.veterinaria;

import java.util.LinkedList;

public class Vacuna {

	
	public static LinkedList<Vacuna> listaDeVacunas = new LinkedList<Vacuna>();

	
	String tipo;
	String descripcion;
	public Vacuna(String tipo, String descripcion) {
		super();
		this.tipo = tipo;
		this.descripcion = descripcion;
		listaDeVacunas.add(this);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		if(descripcion==""){
			this.tipo="Ninguna";
		}
		return this.tipo;
	}
		
	public static LinkedList<Vacuna> getListaDeVacunas() {	
		return listaDeVacunas;
	}

	
}
