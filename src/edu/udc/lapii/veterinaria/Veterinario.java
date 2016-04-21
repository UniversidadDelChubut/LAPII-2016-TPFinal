package edu.udc.lapii.veterinaria;

public class Veterinario {
	private String Nombre;
	private String Apellido;
	private int Matricula;
	private int NCelular;
	
	
	public Veterinario(String nombre, String apellido, int matricula, int nCelular) {
		setNombre(nombre);
		setApellido(apellido); //El apellido
		setApellido(apellido);//nueva actualizacion
		setMatricula(matricula);
		setNCelular(nCelular);
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public void setMatricula(int matricula) {
		Matricula = matricula;
	}


	public void setNCelular(int nCelular) {
		NCelular = nCelular;
	}
	
}
