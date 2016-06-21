package edu.udc.lapii.veterinaria;


public class PracticaMedica {
	private String tipo;
	
	private String descripcion;
	
	
	public PracticaMedica(String tipo, String descripcion) {
		super();
		this.tipo = tipo;
		
		this.descripcion = descripcion;
	}

	public String getDescripcion(){
		return descripcion;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
