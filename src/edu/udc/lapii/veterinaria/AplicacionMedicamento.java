package edu.udc.lapii.veterinaria;

public class AplicacionMedicamento {
	
	private PracticaMedica practicaMedica;
	private Medicamento medicamento;
	private double cantidaad;
	private UnidadMedida unidadMedida;
	
	public PracticaMedica getPracticaMedica() {
		return practicaMedica;
	}
	
	public void setPracticaMedica(PracticaMedica practicaMedica) {
		this.practicaMedica = practicaMedica;
	}
	
	public Medicamento getMedicamento() {
		return medicamento;
	}
	
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	public double getCantidaad() {
		return cantidaad;
	}
	
	public void setCantidaad(double cantidaad) {
		this.cantidaad = cantidaad;
	}
	
	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}
	
	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	} 
	
	
}
