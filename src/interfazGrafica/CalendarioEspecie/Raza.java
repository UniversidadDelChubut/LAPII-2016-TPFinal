package interfazGrafica.CalendarioEspecie;

public class Raza {
	
	private Especie especie;
	private String nombre;
	public Raza(Especie Especie, String Nombre) {
		this.especie = Especie;
		this.nombre = Nombre;
		
	}
	public Especie getEspecie() {
		return especie;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
