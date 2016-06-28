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

	public Object[][] set(int rowIndex,int columnIndex,String string) {
			for (int i = 0; i <= columnIndex; i++) {
				for (int j = 0; j <= rowIndex; j++) {
					if (i == columnIndex && j == columnIndex ){
						Fechas[j][i] = string;
					}
				}
			}
			return Fechas;
	}

	public String[] get(int rowIndex) {
		// TODO Auto-generated method stub
		return Animal.this.Vacunas;
	}
	
	
}
