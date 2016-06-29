package interfazGrafica.Atencion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import	javax.swing.*;

import edu.udc.lapii.veterinaria.Ambulatorio;
import edu.udc.lapii.veterinaria.Atencion;
import edu.udc.lapii.veterinaria.Domiciliaria;
import edu.udc.lapii.veterinaria.HistoriaClinica;
import edu.udc.lapii.veterinaria.Internacion;
import edu.udc.lapii.veterinaria.PracticaMedica;
import edu.udc.lapii.veterinaria.Vacuna;
import edu.udc.lapii.veterinaria.Vacunacion;
import edu.udc.lapii.veterinaria.Veterinario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*Clase que es un JPanel,que como atributos va a tener 3 tablas(tablaAtencion,tablaPracticasMedicas,tablaVacunas),y 2 botones
(editar,nuevo)*/

public class AtencionVentana extends JPanel implements ActionListener{
	
	
	
	private HistoriaClinica historiaClinica;
	private LinkedList<Vacuna> listadoVacunas;
	private LinkedList<Veterinario> listadoVeterinarios;
	
	
	private JTable tablaAtencion;
	
		
	private JTable tablaPracticaMedica;
	
	
	private JTable tablaVacuna;
	
	//Creo un boton,uno para editar una atencion y otro para crear una nueva atencion//
	private JButton botonNuevo=new JButton("NUEVA ATENCION");


	JFrame frame;

	

	
	//Constructor que por defecto se crean 2 JPanel//
	public AtencionVentana(HistoriaClinica historiaClinica){
		//JPanel que va a contener tablas//
		this.historiaClinica = historiaClinica;
		this.listadoVacunas=Vacuna.listaDeVacunas;
		this.listadoVeterinarios=Veterinario.getVeterinarios();
		
		
		tablaAtencion = new JTable(new ModeloAtencion( historiaClinica.getAtencion()));
		tablaPracticaMedica = new JTable(new ModeloPracticaMedica(historiaClinica.getAtencion()));
		tablaVacuna = new JTable(new ModeloVacuna(historiaClinica.getAtencion()));
		JPanel panelTablas=new JPanel(new BorderLayout());

		//JPanel que va a contener los botones//
		JPanel panelBotones=new JPanel(new FlowLayout());
		
		
		//Establezco el tamaï¿½o de vista por defecto de las tablas//
		this.tablaAtencion.setPreferredScrollableViewportSize(new Dimension(460, 400));
		this.tablaPracticaMedica.setPreferredScrollableViewportSize(new Dimension(180, 80));
		this.tablaVacuna.setPreferredScrollableViewportSize(new Dimension(180,80));
		
		
		/*Creo un JScrollPane que va a contener una tabla---el JScrollPane va a permitir que se pueda obtener una vista
		desplazable de la tabla.
		A continuacion lo inserto en el panel que va a contener todas las tablas y le asigno en que posicion del "panel de tablas"
		va a estar ubicado el JScrollPane que a su vez tiene dentro una tabla*/
		JScrollPane sp1 = new JScrollPane(tablaAtencion);
		panelTablas.add(sp1 ,BorderLayout.WEST);
		
		/*Creo un JScrollPane que va a contener una tabla---el JScrollPane va a permitir que se pueda obtener una vista
		desplazable de la tabla.
		A continuacion lo inserto en el panel que va a contener todas las tablas y le asigno en que posicion del "panel de tablas"
		va a estar ubicado el JScrollPane que a su vez tiene dentro una tabla*/
		JScrollPane sp2 = new JScrollPane(tablaPracticaMedica);
		panelTablas.add(sp2 ,BorderLayout.SOUTH);
		
		/*Creo un JScrollPane que va a contener una tabla---el JScrollPane va a permitir que se pueda obtener una vista
		desplazable de la tabla.
		A continuacion lo inserto en el panel que va a contener todas las tablas y le asigno en que posicion del "panel de tablas"
		va a estar ubicado el JScrollPane que a su vez tiene dentro una tabla*/
		JScrollPane sp3 = new JScrollPane(tablaVacuna);
		panelTablas.add(sp3,BorderLayout.EAST);
		
		//Aï¿½ado botones al panel "panelBotones"//
		
		panelBotones.add(botonNuevo,BorderLayout.EAST);
		
		botonNuevo.setActionCommand("Nuevo");
		botonNuevo.addActionListener(this);
		//Coloco un BorderLayout al panel principal//
		this.setLayout(new BorderLayout());
		
		/*Agrego "panel tablas",y "panel botones" al panel principal (atencion ventana).
		 * Utilizo JSplitPane para dividir el "panel tablas" en 3 partes*/
		this.add(new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sp1, new JSplitPane(JSplitPane.VERTICAL_SPLIT, sp2, sp3)), BorderLayout.CENTER);
		this.add(panelBotones, BorderLayout.SOUTH);
		
	}	
	
	/*Getters*/
	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}


	/*Fin Getters*/


public class CrearAtencion extends JPanel implements ActionListener {
		
		
		JButton guardar;
		JComboBox<Veterinario> veterinarios;
		JComboBox<String> tipoAtencion;
		JTextField tipoPracticaMedica;
		JComboBox<Vacuna> vacunas;
		JTextField descripcion;
		JTextField diagnostico;
		JTextField observaciones;
		
		public CrearAtencion(HistoriaClinica historia) {
			
			super(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			
			
			tipoAtencion = new JComboBox<>();
			tipoPracticaMedica = new JTextField(12);
			guardar = new JButton("Guardar");
			descripcion= new JTextField(12);
			diagnostico= new JTextField(12);
			observaciones= new JTextField(12);
			
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 0;
			add(new JLabel("Veterinario"),c);			
			
			
			veterinarios = new JComboBox<Veterinario>();
			
			for (Veterinario vet: listadoVeterinarios) {
				veterinarios.addItem(vet);
			}
			
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 0;
			add(veterinarios,c);
			
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 2;
			add(new JLabel("Tipo Atencion"),c);
			tipoAtencion.addItem("Ambulatorio");
			tipoAtencion.addItem("Internacion");
			tipoAtencion.addItem("Domiciliaria");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 2;
			
			add(tipoAtencion,c);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 3;
			add(new JLabel("Tipo de Practica Medica"),c);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 3;
			add(tipoPracticaMedica,c);
			
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 4;
			add(new JLabel("Vacunas Aplicadas"),c);
			vacunas= new JComboBox<Vacuna>();
			
			for (Vacuna vacuna : listadoVacunas) {
				vacunas.addItem(vacuna);
			}
			
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 4;
			add(vacunas,c);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 5;
			add(new JLabel("Descripcion"),c);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 5;
			add(descripcion,c);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 6;
			add(new JLabel("Observaciones"),c);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 6;
			add(observaciones,c);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 7;
			add(new JLabel("Diagnostico"),c);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 1;
			c.gridy = 7;
			add(diagnostico,c);
			c.fill = GridBagConstraints.CENTER;
			c.gridx = 1;
			c.gridy = 8;
			add(guardar,c);
			guardar.addActionListener(this);
			this.setVisible(true);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				
			String tiat=(String) tipoAtencion.getSelectedItem();
			Vacuna vac=(Vacuna) vacunas.getSelectedItem();
			String tip=tipoPracticaMedica.getText();
			String desc=descripcion.getText();
			
			
			
			
			int numeroAtencion=historiaClinica.getAtencion().size()+1;
			
			Vacunacion vacunacionAux=new Vacunacion(vac);
			
			PracticaMedica practicaAux=new PracticaMedica(tip, desc);
			
			Date fechaAtencion=new Date();
			
			if(tiat.equals("Ambulatorio")){
				Ambulatorio ambAux=new Ambulatorio(numeroAtencion, fechaAtencion, diagnostico.getText(), observaciones.getText(), practicaAux, (Veterinario) veterinarios.getSelectedItem(), vacunacionAux);
				historiaClinica.setAtencion(ambAux);
			
			}
			else if(tiat.equals("Internacion")){
				Internacion intAux=new Internacion(numeroAtencion, fechaAtencion, diagnostico.getText(), observaciones.getText(), practicaAux, (Veterinario) veterinarios.getSelectedItem(), vacunacionAux);
				historiaClinica.setAtencion(intAux);
			
			}else{
				
				Domiciliaria domAux=new Domiciliaria(numeroAtencion, fechaAtencion, diagnostico.getText(), observaciones.getText(), practicaAux, (Veterinario) veterinarios.getSelectedItem(), vacunacionAux);
				historiaClinica.setAtencion(domAux);
			}
			
			
			Window w = SwingUtilities.getWindowAncestor(this);
		    w.setVisible(false);
		    
		    /*Oculto y muestro las tablas para que se actualice su contenido*/
		    AtencionVentana.this.tablaAtencion.setVisible(false);
		    AtencionVentana.this.tablaPracticaMedica.setVisible(false);
		    AtencionVentana.this.tablaVacuna.setVisible(false);
		    
		    AtencionVentana.this.tablaAtencion.setVisible(true);
		    AtencionVentana.this.tablaPracticaMedica.setVisible(true);
		    AtencionVentana.this.tablaVacuna.setVisible(true);
			}
		}


	public void actionPerformed(ActionEvent e) {

	
		if(e.getActionCommand().equals("Nuevo")){
	    frame = new JFrame("Nueva Atencion");
	    frame.setContentPane(new CrearAtencion(this.historiaClinica));
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
		}
		
	}
	
	
		
	
}