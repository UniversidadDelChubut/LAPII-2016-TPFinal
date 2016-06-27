package interfazGrafica.CalendarioEspecie;

public class Animal {
	private Object[][] Fechas;
	private String[] Vacunas;
	private Raza raza;
	
	public Animal(Object[][]fechas,String[]vacunas,Raza Raza){
		
		try{
			this.Fechas = fechas;
			this.Vacunas = vacunas;
		} catch (NullPointerException e) {
			System.err.println("Error , Arreglos vacios");
		}
		this.raza = Raza;
		
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setFechas(Object[][] fechas) {
		Fechas = fechas;
	}

	public void setVacunas(String[] vacunas) {
		Vacunas = vacunas;
	}

	public Object[][] getFechas() {
		return Fechas;
	}

	public String[] getVacunas() {
		return Vacunas;
	}

	public Animal get(int rowIndex) {
	
		return null;
	}
	
	
}
