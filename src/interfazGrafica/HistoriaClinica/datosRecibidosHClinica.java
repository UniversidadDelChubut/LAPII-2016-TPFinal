package interfazGrafica.HistoriaClinica;

import java.awt.print.Printable;
import java.text.ParseException;

import cargaDeDatos.CargaDeAnimales;
import edu.udc.lapii.veterinaria.Animal;

public class datosRecibidosHClinica {


	private static Animal ObjetAnimal;
	
	public static  void recibidosAnimal() throws ParseException {	
		String matricula = new PruebaPasajeMatricula().getMatricula();
		
		System.out.println("____________"+matricula);
		CargaDeAnimales.cargaAnimal();
		for (int i = 0; i < Animal.getAnimal().size(); i++) {
			
			if (Animal.getAnimal().get(i).getMatricula().equals(matricula)) {
					
				ObjetAnimal = Animal.getAnimal().get(i);
				
				System.out.println("su matricula es " + matricula);
			}
		}
	}
	
	public static Animal MostrarAnimal(){
		
		return ObjetAnimal;
	}

}
