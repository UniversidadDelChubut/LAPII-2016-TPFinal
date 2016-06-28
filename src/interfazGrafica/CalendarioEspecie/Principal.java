   package interfazGrafica.CalendarioEspecie;

import javax.swing.JFrame;


public class Principal {
	public static void main(String[] args) {
		
		Especie especie = new Especie("Canina",null);
		Raza raza = new Raza(especie,"Golden");
		String[] vacunas={"Edad","Parvovirosis ","Moquillo ","Polivalentes ", "Rabia "};
		Object[][] fechas ={ 
				{"1 mes ",new String(),new String(),new String(),new String()},
				{"2 meses",new String(),new String(),new String(),new String()},
				{"3 meses",new String(),new String(),new String(),new String()},
				{"4 meses",new String(),new String(),new String(),new String()},
				{"1 año",new String(),new String(),new String(),new String()}, 
				{"Anual",new String(),new String(),new String(),new String()}
				};
		Animal perro = new Animal(fechas, vacunas, raza);
		
		NCalendario calendarios = new NCalendario(perro);
		especie.setCalendarios(calendarios);
		new NCalendario(perro);
		
		JFrame frame = new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    frame.setContentPane(calendarios);
	    frame.pack();
	    frame.setVisible(true);  
		
	}
	
}

