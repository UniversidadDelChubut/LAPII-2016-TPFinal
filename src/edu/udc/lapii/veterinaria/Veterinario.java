package edu.udc.lapii.veterinaria;

import java.util.LinkedList;

public class Veterinario {
	
	static LinkedList<Veterinario> veterinarios;
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
		if(veterinarios==null){
			veterinarios=new LinkedList<>();
		}
		if(veterinarios.contains(this)==false){
			
			veterinarios.add(this);
		
		}
	
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
	
	public static LinkedList<Veterinario> getVeterinarios(){
		return veterinarios;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + matricula;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Veterinario){
			if(((Veterinario) obj).getMatricula()==this.getMatricula()){
				return true;
			}
			return false;
		}
		
		return super.equals(obj);
	}
	
	
}
