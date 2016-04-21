package edu.udc.lapii.veterinaria;

public class Propietario {

	private String nombre;
	private String apellido;
	private String telefono;
	private Domicilio dominiclio;
	private Localidad localidad;
	
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
	
	public String getTelefono() {
		return telefono;
	}
}
