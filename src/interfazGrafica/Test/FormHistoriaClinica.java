package interfazGrafica.Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;



import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JTabbedPane;
import interfazGrafica.HistoriaClinica.*;

public class FormHistoriaClinica extends JFrame {
	

	private JPanel contentPane;


	
	public static void main(String[] args) {
		
		PruebaPasajeMatricula matricula = new PruebaPasajeMatricula();

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					FormHistoriaClinica frame = new FormHistoriaClinica(matricula.getMatricula());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormHistoriaClinica(String Matricula) throws ParseException {
				//Poner nombre mas significativo
				//Hacer que el constructor reciba una instancia de animal
				//Incluir esta ventana en el proyecto veterinara que estan trabajando los compañeros
				//Instanciar los tabs de aucerdo a lo programado por los compañeros
				
		
		CargaDeAnimales cargaDeAnimales = new CargaDeAnimales();
	
				setTitle("HISTORIA CLINICA");//titulo de la ventana
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hace click en x y se cierrra
				contentPane = new JPanel();						//jpanel para trabajar en el formulario
				setBounds(100, 100, 703, 509);					//tamaño de la ventana
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	//bode de la ventana
				setContentPane(contentPane);						//
				contentPane.setLayout(null);
				
				
				JLabel lblTituloHC = new JLabel("HISTORIA CLINICA DE LA VETERINARIA-UDC SRL");
				lblTituloHC.setBackground(Color.ORANGE);
				lblTituloHC.setForeground(Color.BLUE);
				lblTituloHC.setHorizontalAlignment(SwingConstants.CENTER);
				lblTituloHC.setFont(new Font("Arial Black", Font.BOLD, 16));
				lblTituloHC.setBounds(6, 0, 609, 51);
				contentPane.add(lblTituloHC);
				
				
				
				
				
				
				for (int i = 0; i < cargaDeAnimales.llenarDatos().size(); i++) {
					
					if (cargaDeAnimales.llenarDatos().get(i).getMatricula().equals(Matricula)) {
							
				
						
						System.out.println("su matricula es " + Matricula);
						
						
						
						
						JLabel lblnombreAnimal_1 = new JLabel(cargaDeAnimales.llenarDatos().get(i).getNombre());
						lblnombreAnimal_1.setBounds(182, 79, 60, 15);
						contentPane.add(lblnombreAnimal_1);
						
						
						
						
						@SuppressWarnings("deprecation")
						JLabel lbledad_1 = new JLabel(String.valueOf(cargaDeAnimales.llenarDatos().get(i).getFechaNacimiento().getYear()));
						lbledad_1.setBounds(182, 107, 60, 15);
						contentPane.add(lbledad_1);
						
						
						JLabel lblespecie_1 = new JLabel(cargaDeAnimales.llenarDatos().get(i).getEspecie().getNombre());
						lblespecie_1.setBounds(182, 134, 60, 15);
						contentPane.add(lblespecie_1);
						
						JLabel lblRaza_1 = new JLabel(cargaDeAnimales.llenarDatos().get(i).getRaza().getNombre());
						lblRaza_1.setBounds(182, 162, 60, 15);
						contentPane.add(lblRaza_1);
						
						JLabel lblpropietario_1 = new JLabel(cargaDeAnimales.llenarDatos().get(i).getPropietario().getNombre());
						lblpropietario_1.setBounds(182, 190, 106, 15);
						contentPane.add(lblpropietario_1);
						
						JLabel lblDomicilio_1 = new JLabel(cargaDeAnimales.llenarDatos().get(i).getPropietario().getDominiclio().getCalle());
						
						lblDomicilio_1.setBounds(182, 218, 106, 15);
						contentPane.add(lblDomicilio_1);
						
						JLabel lblTelefono_1 = new JLabel(String.valueOf(cargaDeAnimales.llenarDatos().get(i).getPropietario().getTelefono()));
						lblTelefono_1.setBounds(182, 246, 106, 15);
						contentPane.add(lblTelefono_1);
						
						
						
						ImageIcon imageIcon = new ImageIcon(new ImageIcon(cargaDeAnimales.llenarDatos().get(i).getFoto()).getImage().getScaledInstance(280, 240, Image.SCALE_AREA_AVERAGING));

						
						
						
						JLabel lblfoto = new JLabel();
						lblfoto.setBounds(387, 63, 293, 240);
						contentPane.add(lblfoto);
						lblfoto.setIcon(imageIcon);
						
						
						
						
						
						
					}
				}
				

			
				
								
				
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
				

				 JPanel panel1=new JPanel();
				 JLabel label1enPestania=new JLabel("Estas en el panel 1");
			     panel1.add(label1enPestania);
			    
//			     panel1 = new PanelAtenciones(animal);
			     
			     //panel2
			     JPanel panel2=new JPanel();
				 JLabel label2enPestania=new JLabel("Estas en el panel 2");
			     panel2.add(label2enPestania);
				
			     
			     //panel3
			     JPanel panel3=new JPanel();
				 JLabel label3enPestania=new JLabel("Estas en el panel 3");
			     panel3.add(label3enPestania);
				
			     
			     
				JTabbedPane tabbedPane = new JTabbedPane();
				tabbedPane.setForeground(Color.black);
				tabbedPane.setBounds(6, 314, 691, 159);
				contentPane.add(tabbedPane);
				tabbedPane.addTab("panel 1", panel1);
				tabbedPane.addTab("panel 2", panel2);
				tabbedPane.addTab("panel 3", panel3);
				
				JLabel lblAos = new JLabel("años");
				lblAos.setBounds(214, 106, 38, 16);
				contentPane.add(lblAos);

				
			}
}

