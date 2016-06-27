package interfazGrafica.CalendarioEspecie;

public class Especie {
	private String Nombre;
	private NCalendario calendarios;
	public Especie(String nombre,NCalendario Calendario) {
		this.Nombre = nombre;
		this.calendarios = Calendario;
	}
	


	public void setCalendarios(NCalendario calendarios) {
		this.calendarios = calendarios;
	}



	public NCalendario getCalendarios() {
		return calendarios;
	}



	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	
	
}
