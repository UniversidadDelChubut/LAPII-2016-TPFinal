package edu.udc.lapii.veterinaria;

public class Veterinario {
	
	private String nombre;
	private String apellido;
	private int matricula;
	private String telefono;

	
	
	
	public Veterinario(String nombre, String apellido, int matricula, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricula;
		this.telefono = telefono;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public void setTelefono(String telefono) {
		//Verificar si es valido
		boolean error = false;
		error = error || telefono.length() != 12;
		error = error || ! telefono.matches("^0\\d{2,4}-\\d{6,8}$");
		if (error) {
			//Lanzar error si no es valido
			System.out.println("Malo");
			return;
		}
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public int getMatricula() {
		return matricula;
	}


	public String getTelefono() {
		return telefono;
	}
	
	@Override
	public String toString() {
		return this.nombre+" "+this.apellido;
	}
	
	
}
