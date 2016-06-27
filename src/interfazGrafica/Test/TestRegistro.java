package interfazGrafica.Test;

import java.util.Date;

import interfazGrafica.Registro.JPanelRegistro;

import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.udc.lapii.veterinaria.Animal;
import edu.udc.lapii.veterinaria.Domicilio;
import edu.udc.lapii.veterinaria.Especie;
import edu.udc.lapii.veterinaria.HistoriaClinica;
import edu.udc.lapii.veterinaria.Localidad;
import edu.udc.lapii.veterinaria.Propietario;
import edu.udc.lapii.veterinaria.Raza;


public class TestRegistro extends JPanel{
	
	private static final long serialVersionUID = 1L;

	private static void createAndShowGUI() {

        JFrame frame = new JFrame("Registro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		Domicilio domicilio1 = new Domicilio("25 de mayo", 123);
		Localidad localidad1 = new Localidad("Trelew");
       Especie especie = new Especie("Canino");
       Propietario propietario = new Propietario("Juan", "Perez", "2804405500", domicilio1, localidad1);
       
        Animal nuevoAnimal = new Animal("Roco", new Date(),
    			false,  "JAS456",
    			"Trelew", "Colorado", true,
    			new Raza(especie, "Desconocida"), especie, propietario);
        HistoriaClinica hc = nuevoAnimal.getHistoriaClinica();
        
        JPanelRegistro newContentPane = new JPanelRegistro(hc, frame);
        
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
