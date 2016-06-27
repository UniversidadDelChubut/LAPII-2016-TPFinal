package edu.udc.lapii.veterinaria;

public class Propietario {

	private String nombre;
	private String apellido;
	private String telefono;
	private Domicilio domicilio;
	private Localidad localidad;
	
	public Propietario(){
		
	}
	
	public Propietario(String nombre, String apellido, String telefono, Domicilio domicilio, Localidad localidad) {
		super();
		setNombre(nombre);
		setApellido(apellido);
		this.telefono=telefono;
		setDomicilio(domicilio);
		setLocalidad(localidad);
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
	
	public String getTelefono() {
		return telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio dominiclio) {
		this.domicilio = dominiclio;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
	
}
