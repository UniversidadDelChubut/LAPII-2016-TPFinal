package edu.udc.lapii;

import edu.udc.lapii.veterinaria.Propietario;

public class Test {
	
	public static void main(String[] args) {
		Propietario p1 = new Propietario();
		p1.setTelefono("0280-4567890");
		System.out.println(p1.getTelefono());
		
		
		Propietario p2 = new Propietario();
		p2.setTelefono("028045678901");
		System.out.println(p2.getTelefono());
		
		
		Propietario p3 = new Propietario();
		p3.setTelefono("0280444-4890");
		System.out.println(p3.getTelefono());

		Propietario p4 = new Propietario();
		p4.setTelefono("0280-4405590");
		System.out.println(p4.getTelefono());

		
	}
	
	
}

