package interfazGrafica.HistoriaClinica;
import edu.udc.lapii.veterinaria.Animal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import edu.udc.lapii.veterinaria.*;

public class CargaDeAnimales {
	
	public List<Animal> llenarDatos() throws ParseException{
		
		List<Animal> animales = new LinkedList<Animal>(); 
	
			Domicilio domicilio1 = new Domicilio("25 de mayo", 123);
			Localidad localidad1 = new Localidad("Trelew");
			Propietario propietario1 = new Propietario("Juan", "Perez", "2804405500", domicilio1, localidad1);
			
			Especie especie1 = new Especie("Canino");
			Raza raza1 = new Raza(especie1, "Pitbull");
					
			Date fNac1;
			Date fNac2;

			fNac1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-03");
			fNac2 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-03-08");
			Animal animal1 = new Animal("Rocky", fNac1, true, "123", "Rawson", "Negro", "perro2.jpg", true, false, raza1, especie1, propietario1);
			Animal animal2 = new Animal("Luna", fNac2, true, "321", "Trelew", "Marron","perro1.jpg", true, false, raza1, especie1, propietario1);

			animales.add(animal1);
			animales.add(animal2);
			
			//listaAnimal.addAll(animales);
			
		return animales;
	}
	
	
}
