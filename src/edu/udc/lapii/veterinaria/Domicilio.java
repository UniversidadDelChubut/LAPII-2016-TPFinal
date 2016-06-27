package edu.udc.lapii.veterinaria;

public class Domicilio {
	
	private String calle;
	private int numeroCasa;
	
	
	
	public Domicilio(String calle, int numeroCasa) {
		super();
		this.calle = calle;
		this.numeroCasa = numeroCasa;
	}

	public String getCalle() {
		return calle;
	}
	
	public int getNumeroCasa() {
		return numeroCasa;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
}
