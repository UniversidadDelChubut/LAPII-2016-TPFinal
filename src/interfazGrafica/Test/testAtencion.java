package interfazGrafica.Test;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;

import javax.swing.JFrame;

import cargaDeDatos.CargaDeAnimales;
import cargaDeDatos.ListadoDeVacunas;
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
import interfazGrafica.HistoriaClinica.objetoRecibidoAnimalHC;
import interfazGrafica.Test.*;

public class testAtencion extends JFrame {
	private static void mostrarVentana() throws ParseException{
        //Creo un JFrame//
        JFrame frame = new JFrame("AtencionVentana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CargaDeAnimales.cargaAnimal();
		ListadoDeVacunas.listadoDeVacunas();
		

		//llamo al objeto animal
		objetoRecibidoAnimalHC.SetRecibidosAnimal();
		
		HistoriaClinica hc = objetoRecibidoAnimalHC.GetsAnimal().getHistoriaClinica();
		
		 
		 //lo que se muestra en las tablas
	        Veterinario veterinario1 = new Veterinario("Juan", "Perez", 21, "2804-864530");
	        Vacuna vacuna = new Vacuna("Anti-Rabia", "Pa' gato");
	         Vacunacion vacunacion = new Vacunacion(vacuna);
	        PracticaMedica practicamedica = new PracticaMedica("Cirugia", "gydh"); 
	        Ambulatorio amb=new Ambulatorio(1, new Date(), "boluditis", "cronica",practicamedica, veterinario1, vacunacion);
        //-------------
	       
	    
        
        /*Creo un listado de veterinarios*/
        Veterinario vet1=new Veterinario("Oscar", "Gonzales", 34, "2804-541211");
        Veterinario vet2=new Veterinario("Juan", "Gomez", 501, "2945-582555");
        Veterinario vet3=new Veterinario("Agustina", "Saavedra", 703, "2804-953317");
        Veterinario vet4=new Veterinario("Florencia", "Amparo", 47, "2804-634429");
        Veterinario vet5=new Veterinario("Federico", "Sosa", 1708, "2804-762213");
        Veterinario vet6=new Veterinario("Helena", "Medina", 910, "2804-052318");
         
        
        
        
        hc.setAtencion(amb);
        
        AtencionVentana atv = new AtencionVentana(hc,Vacuna.getListaDeVacunas());
       
        //La a�ado al frame//
        frame.getContentPane().add(atv);
        frame.pack();
        frame.setVisible(true);
	}

	//main de prueba//
	public static void main(String[] args) {
		
	javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
            	try {
					mostrarVentana();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
		
		});	
	
	}

}
