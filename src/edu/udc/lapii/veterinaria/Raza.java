package edu.udc.lapii.veterinaria;

public class Raza {
	
	private Especie especie;
	private String nombre;
	
	
		
	public Raza(Especie especie, String nombre) {
		super();
		this.especie = especie;
		this.nombre = nombre;
	}

	public Especie getEspecie() {
		return especie;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
