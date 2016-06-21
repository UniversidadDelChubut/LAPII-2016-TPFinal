package interfazGrafica.Test;

import java.util.Date;
import java.util.LinkedList;

import javax.swing.JFrame;

import edu.udc.lapii.veterinaria.Ambulatorio;
import edu.udc.lapii.veterinaria.HistoriaClinica;
import edu.udc.lapii.veterinaria.PracticaMedica;
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
        HistoriaClinica hc = new HistoriaClinica("pepe", "ASD123");
        Veterinario veterinario1 = new Veterinario("Juan", "Perez", 21, "2804-864530");
        Vacuna vacuna = new Vacuna("Anti-Rabia", "Pa' gato");
        Vacunacion vacunacion = new Vacunacion(vacuna);
        PracticaMedica practicamedica = new PracticaMedica("Cirugia", "gydh");
       
        
        
       Ambulatorio amb=new Ambulatorio(1, new Date(), "boluditis", "cronica",practicamedica, veterinario1, vacunacion);
        
        /*Creo un listado de vacunas*/
        Vacuna ninguna=new Vacuna("", "");
        Vacuna triple=new Vacuna("triple", "se aplica en perros a las 6 semanas de vida");
        Vacuna parvovirus=new Vacuna("parvovirus","se aplica en perros a 8 semanas de vida");
        Vacuna rabia=new Vacuna("rabia","se aplica a 16 semanas de vida");
        Vacuna rinotraquetitis=new Vacuna("rinotraquetitis","se aplica en gatos");
        Vacuna bonipra1=new Vacuna("bonipra1","se aplica en aves con sintomas de bronquitis");
        Vacuna viruela=new Vacuna("viruela","se aplica en aves a los 60 dias de vida");
       
        /*Inserto todas las vacunas en una lista*/
        LinkedList<Vacuna> misVacunas=new LinkedList<Vacuna>();
        misVacunas.add(ninguna);
        misVacunas.add(triple);
        misVacunas.add(parvovirus);
        misVacunas.add(rabia);
        misVacunas.add(rinotraquetitis);
        misVacunas.add(bonipra1);
        misVacunas.add(viruela);
        /*Creo un listado de veterinarios*/
        Veterinario Dr_Gonzalez=new Veterinario("Oscar", "Gonzales", 34, "2804-541211");
        Veterinario Dra_Suarez=new Veterinario("juan", "gomez", 501, "2945-582555");
        /*Veterinario Dr_Perez=new Veterinario("Juan Perez");
        Veterinario Dra_Samuel=new Veterinario("Florencia Samuel");
        /*Inserto los veterinarios en una lista*/
        LinkedList<Veterinario> misVeterinarios=new LinkedList<Veterinario>();
        misVeterinarios.add(Dr_Gonzalez);
        misVeterinarios.add(Dra_Suarez);
        /*misVeterinarios.add(Dr_Perez);
        misVeterinarios.add(Dra_Samuel);*/
        
        
        
        
        
        hc.setAtencion(amb);
        
        AtencionVentana atv = new AtencionVentana(hc,misVacunas,misVeterinarios);
       
        //La añado al frame//
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
