package edu.udc.lapii.veterinaria;

import java.util.Date;

public class Animal {
	private String nombre;
	private Date fechaNacimiento;
	private boolean fechaNacimientoConfirmada;
	private String matricula;
	private String municipioMatricula;
	private String color;
	private String foto;
	private boolean castrado;
	private boolean vive;
	private Raza raza;
	private Especie especie;
	private Propietario propietario;
	
	public Animal(String nombre, Date fechaNacimiento, boolean fechaNacimientoConfirmada, String matricula,
			String municipioMatricula, String color, String foto, boolean castrado, boolean vive, Raza raza,
			Especie especie, Propietario propietario) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaNacimientoConfirmada = fechaNacimientoConfirmada;
		this.matricula = matricula;
		this.municipioMatricula = municipioMatricula;
		this.color = color;
		this.foto = foto;
		this.castrado = castrado;
		this.vive = vive;
		this.raza = raza;
		this.especie = especie;
		this.propietario = propietario;
	}

	//Metodos Getters y Setters de la clase animal//
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public boolean isFechaNacimientoConfirmada() {
		return fechaNacimientoConfirmada;
	}
	
	public void setFechaNacimientoConfirmada(boolean fechaNacimientoConfirmada) {
		this.fechaNacimientoConfirmada = fechaNacimientoConfirmada;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMunicipioMatricula() {
		return municipioMatricula;
	}
	
	public void setMunicipioMatricula(String municipioMatricula) {
		this.municipioMatricula = municipioMatricula;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public Boolean getCastrado() {
		return castrado;
	}
	
	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}
	
	public boolean isVive() {
		return vive;
	}
	
	public void setVive(boolean vive) {
		this.vive = vive;
	}
	
	public Raza getRaza() {
		return raza;
	}
	
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	
	public Especie getEspecie() {
		return especie;
	}
	
	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	
	public Propietario getPropietario() {
		return propietario;
	}
	
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	//Fin de los metodos Getters y Setters
	

	
	
	
	
	
	
	
}

