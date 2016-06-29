package interfazGrafica.Test;
import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTabbedPane;
import interfazGrafica.HistoriaClinica.*;
import interfazGrafica.Registro.JPanelRegistro;
import cargaDeDatos.*;
import edu.udc.lapii.veterinaria.*;
public class FormHistoriaClinica extends JFrame {
	
	
	private JPanel contentPane;
	
	public static void main(String[] args) {
		
//		final PruebaPasajeMatricula matricula = new PruebaPasajeMatricula();

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					FormHistoriaClinica frame = new FormHistoriaClinica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormHistoriaClinica() throws ParseException {
				//Poner nombre mas significativo
				//Hacer que el constructor reciba una instancia de animal
				//Incluir esta ventana en el proyecto veterinara que estan trabajando los compañeros
				//Instanciar los tabs de aucerdo a lo programado por los compañeros
				
		objetoRecibidoAnimalHC.SetRecibidosAnimal();

	
				setTitle("HISTORIA CLINICA");//titulo de la ventana
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hace click en x y se cierrra
				contentPane = new JPanel();						//jpanel para trabajar en el formulario
				setBounds(100, 100, 1000, 650);					//tamaño de la ventana
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	//bode de la ventana
				setContentPane(contentPane);						//
				contentPane.setLayout(null);
				
				
				JLabel lblTituloHC = new JLabel("HISTORIA CLINICA DE LA VETERINARIA-UDC SRL");
				lblTituloHC.setBackground(Color.ORANGE);
				lblTituloHC.setForeground(Color.BLUE);
				lblTituloHC.setHorizontalAlignment(SwingConstants.CENTER);
				lblTituloHC.setFont(new Font("Arial Black", Font.BOLD, 16));
				lblTituloHC.setBounds(133, 6, 609, 51);
				contentPane.add(lblTituloHC);

				
				
						
						JLabel lblnombreAnimal_1 = new JLabel(objetoRecibidoAnimalHC.GetsAnimal().getNombre());
						lblnombreAnimal_1.setBounds(182, 79, 60, 15);
						contentPane.add(lblnombreAnimal_1);
						
						
						@SuppressWarnings("deprecation")
						JLabel lbledad_1 = new JLabel(String.valueOf(objetoRecibidoAnimalHC.GetsAnimal().getFechaNacimiento().getYear()));
						lbledad_1.setBounds(182, 107, 60, 15);
						contentPane.add(lbledad_1);
						
						
						JLabel lblespecie_1 = new JLabel(objetoRecibidoAnimalHC.GetsAnimal().getEspecie().getNombre());
						lblespecie_1.setBounds(182, 134, 60, 15);
						contentPane.add(lblespecie_1);
						
						JLabel lblRaza_1 = new JLabel(objetoRecibidoAnimalHC.GetsAnimal().getRaza().getNombre());
						lblRaza_1.setBounds(182, 162, 60, 15);
						contentPane.add(lblRaza_1);
						
						JLabel lblpropietario_1 = new JLabel(objetoRecibidoAnimalHC.GetsAnimal().getPropietario().getNombre());
						lblpropietario_1.setBounds(182, 190, 106, 15);
						contentPane.add(lblpropietario_1);
						
						JLabel lblDomicilio_1 = new JLabel(objetoRecibidoAnimalHC.GetsAnimal().getPropietario().getDomicilio().getCalle());
						
						lblDomicilio_1.setBounds(182, 218, 106, 15);
						contentPane.add(lblDomicilio_1);
						
						JLabel lblTelefono_1 = new JLabel(String.valueOf(objetoRecibidoAnimalHC.GetsAnimal().getPropietario().getTelefono()));
						lblTelefono_1.setBounds(182, 246, 106, 15);
						contentPane.add(lblTelefono_1);
						
						
						
						ImageIcon imageIcon = new ImageIcon(new ImageIcon(objetoRecibidoAnimalHC.GetsAnimal().getFoto()).getImage().getScaledInstance(280, 240, Image.SCALE_AREA_AVERAGING));

						
						
						
						JLabel lblfoto = new JLabel();
						lblfoto.setBounds(387, 63, 293, 240);
						contentPane.add(lblfoto);
						lblfoto.setIcon(imageIcon);
						
		
			
				/*En esta seccion mostramos todos lbls que es para identificar nombres edad etc.*/
				
				
				
				JLabel lblNombreDelAnimal = new JLabel("Nombre del Animal: ");
				lblNombreDelAnimal.setBounds(37, 78, 144, 16);
				contentPane.add(lblNombreDelAnimal);
				
				JLabel lblEdadDelAnimal = new JLabel("Edad del Animal:");
				lblEdadDelAnimal.setBounds(57, 106, 113, 16);
				contentPane.add(lblEdadDelAnimal);
				
				JLabel lblEspecie = new JLabel("Especie:");
				lblEspecie.setBounds(110, 134, 60, 16);
				contentPane.add(lblEspecie);
				
				JLabel lblRaza = new JLabel("Raza:");
				lblRaza.setBounds(132, 162, 38, 16);
				contentPane.add(lblRaza);
				
				JLabel lblPorpietario = new JLabel("Porpietario:");
				lblPorpietario.setBounds(92, 190, 78, 16);
				contentPane.add(lblPorpietario);
				
				JLabel lblDomicilio = new JLabel("Domicilio:");
				lblDomicilio.setBounds(102, 218, 72, 16);
				contentPane.add(lblDomicilio);
				
				JLabel lblTelefono = new JLabel("Telefono:");
				lblTelefono.setBounds(109, 246, 72, 16);
				contentPane.add(lblTelefono);
				

				JLabel lblAos = new JLabel("años");
				lblAos.setBounds(214, 106, 38, 16);
				contentPane.add(lblAos);
				
				objetoRecibidoAnimalHC.SetRecibidosAnimal();

			

			     //panel1
			     JPanel panel1=new JPanel();
				 JLabel label1enPestania=new JLabel("Estas en el panel 1");
			     panel1.add(label1enPestania);


				
				
				/*

				//JLabel label1enPestania=new JLabel("Estas en el panel 1");
			   //  panel1.add(label1enPestania);
			    
//			     panel1 = new PanelAtenciones(animal);
				*/
			     
			     //panel2
			     JPanel panel2=new JPanel();
				 JLabel label2enPestania=new JLabel("Estas en el panel 2");
			     panel2.add(label2enPestania);
				
			     
			     //panel3

			     JPanel panel3=new JPanel();
				 JLabel label3enPestania=new JLabel();
			     panel3.add(label3enPestania);
				
			     
			     
				JTabbedPane tabbedPane = new JTabbedPane();
				tabbedPane.setForeground(Color.black);
				tabbedPane.setBounds(6, 314, 959, 308);
				contentPane.add(tabbedPane);
				
				
				
				JPanelRegistro paneldeRegistro = new JPanelRegistro(objetoRecibidoAnimalHC.GetsAnimal().getHistoriaClinica(), this);
			
				
				 tabbedPane.addTab("Atencion", panel1);
				tabbedPane.addTab("Historia Clinica", panel2);
				tabbedPane.addTab("Registro", paneldeRegistro);
				
				
				
			}

}


