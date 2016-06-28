package interfazGrafica.Test;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;

import javax.swing.JFrame;

import cargaDeDatos.CargaDeAnimales;
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
	private static void mostrarVentana() throws ParseException{
        //Creo un JFrame//
        JFrame frame = new JFrame("AtencionVentana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //cargo los datos de Carga de DAtos para ectuar las consultas
        CargaDeAnimales.cargaAnimal();
		
		//llamo al animal
		 HistoriaClinica hc = Animal.getAnimal().get(0).getHistoriaClinica();

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
         
        
        
        
        hc.setAtencion(amb);
        
        AtencionVentana atv = new AtencionVentana(hc,misVacunas);
       
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
