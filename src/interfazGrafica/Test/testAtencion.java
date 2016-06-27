package interfazGrafica.Test;

import java.util.Date;
import java.util.LinkedList;

import javax.swing.JFrame;

import edu.udc.lapii.veterinaria.Ambulatorio;
import edu.udc.lapii.veterinaria.Animal;
import edu.udc.lapii.veterinaria.Domicilio;
import edu.udc.lapii.veterinaria.Especie;
import edu.udc.lapii.veterinaria.HistoriaClinica;
import edu.udc.lapii.veterinaria.Localidad;
import edu.udc.lapii.veterinaria.PracticaMedica;
import edu.udc.lapii.veterinaria.Propietario;
import edu.udc.lapii.veterinaria.Raza;
import edu.udc.lapii.veterinaria.Vacuna;
import edu.udc.lapii.veterinaria.Vacunacion;
import edu.udc.lapii.veterinaria.Veterinario;
import interfazGrafica.Atencion.AtencionVentana;

public class testAtencion extends JFrame {
	private static void mostrarVentana(){
        //Creo un JFrame//
        JFrame frame = new JFrame("AtencionVentana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Creo una historia clinica//
		Domicilio domicilio1 = new Domicilio("25 de mayo", 123);
		Localidad localidad1 = new Localidad("Trelew");
       Especie especie = new Especie("Canino");
       Propietario propietario = new Propietario("Juan", "Perez", "2804405500", domicilio1, localidad1);
       
        Animal nuevoAnimal = new Animal("Roco", new Date(),
    			false,  "JAS456",
    			"Trelew", "Colorado", true,
    			new Raza(especie, "Desconocida"), especie, propietario);
        HistoriaClinica hc = nuevoAnimal.getHistoriaClinica();
        Veterinario veterinario1 = new Veterinario("Juan", "Perez", 21, "2804-864530");
        Vacuna vacuna = new Vacuna("Anti-Rabia", "Pa' gato");
        Vacunacion vacunacion = new Vacunacion(vacuna);
        PracticaMedica practicamedica = new PracticaMedica("Cirugia", "gydh");
       
        
        
       Ambulatorio amb=new Ambulatorio(1, new Date(), "boluditis", "cronica",practicamedica, veterinario1, vacunacion);
        
        /*Creo un listado de vacunas*/
        Vacuna v1=new Vacuna("", "");
        Vacuna v2=new Vacuna("Triple", "se aplica en perros a las 6 semanas de vida");
        Vacuna v3=new Vacuna("Parvovirus","se aplica en perros a 8 semanas de vida");
        Vacuna v4=new Vacuna("Rabia","se aplica a 16 semanas de vida");
        Vacuna v5=new Vacuna("Rinotraquetitis","se aplica en gatos");
        Vacuna v6=new Vacuna("Bonipra 1","se aplica en aves con sintomas de bronquitis");
        Vacuna v7=new Vacuna("Adenovirus tipo 2","se aplica en perros(cachorros)a las 9 semanas de vida");
        Vacuna v8=new Vacuna("Viruela","se aplica en aves a los 60 dias de vida");
        Vacuna v9=new Vacuna("Coronavirus","se aplica en perros a las 10 semanas de vida(opcional)");
        Vacuna v10=new Vacuna("Brucelosis Bovina","Vacuna Preventiva del aborto por brucelosis,se aplica en hembras bovinas");
         
       
        /*Inserto todas las vacunas en una lista*/
        LinkedList<Vacuna> misVacunas=new LinkedList<Vacuna>();
        misVacunas.add(v1);
        misVacunas.add(v2);
        misVacunas.add(v3);
        misVacunas.add(v4);
        misVacunas.add(v5);
        misVacunas.add(v6);
        misVacunas.add(v7);
        misVacunas.add(v8);
        misVacunas.add(v9);
        misVacunas.add(v10);
        
        /*Creo un listado de veterinarios*/
        Veterinario vet1=new Veterinario("Oscar", "Gonzales", 34, "2804-541211");
        Veterinario vet2=new Veterinario("Juan", "Gomez", 501, "2945-582555");
        Veterinario vet3=new Veterinario("Agustina", "Saavedra", 703, "2804-953317");
        Veterinario vet4=new Veterinario("Florencia", "Amparo", 47, "2804-634429");
        Veterinario vet5=new Veterinario("Federico", "Sosa", 1708, "2804-762213");
        Veterinario vet6=new Veterinario("Helena", "Medina", 910, "2804-052318");
         
        /*Inserto los veterinarios en una lista*/
        LinkedList<Veterinario> misVeterinarios=new LinkedList<Veterinario>();
        misVeterinarios.add(vet1);
        misVeterinarios.add(vet2);
        misVeterinarios.add(vet3);
        misVeterinarios.add(vet4);
        misVeterinarios.add(vet5);
        misVeterinarios.add(vet6);
        
        
        
        
        hc.setAtencion(amb);
        
        AtencionVentana atv = new AtencionVentana(hc,misVacunas,misVeterinarios);
       
        //La a�ado al frame//
        frame.getContentPane().add(atv);
        frame.pack();
        frame.setVisible(true);
	}

	//main de prueba//
	public static void main(String[] args) {
		
	javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
            	mostrarVentana();
            }
		
		});	
	
	}

}
