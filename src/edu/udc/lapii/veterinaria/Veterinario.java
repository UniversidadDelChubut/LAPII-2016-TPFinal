package edu.udc.lapii.veterinaria;

public class Veterinario {
	
	private String nombre;
	private String apellido;
	private int matricula;
	private String telefono;

	public void setNombre(String nombre) {
		nombre = nombre;
	}


	public void setApellido(String apellido) {
		apellido = apellido;
	}


	public void setMatricula(int matricula) {
		matricula = matricula;
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
	
}
