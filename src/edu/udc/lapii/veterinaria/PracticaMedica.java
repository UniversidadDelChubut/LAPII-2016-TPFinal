package edu.udc.lapii.veterinaria;

import java.util.Date;

public class PracticaMedica {
	private String tipo;
	private Atencion atencion;
	private Date fecha;
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Atencion getAtencion() {
		return atencion;
	}
	
	public void setAtencion(Atencion atencion) {
		this.atencion = atencion;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
