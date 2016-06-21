package interfazGrafica.Atencion;

import java.util.LinkedList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import edu.udc.lapii.veterinaria.Atencion;

public class ModeloVacuna implements TableModel{
	
	LinkedList<Atencion> atenciones;
	
	public ModeloVacuna(LinkedList<Atencion> atenciones) {
		this.atenciones = atenciones;
	}
	@Override
	public void addTableModelListener(TableModelListener l) {
		
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return Integer.class;
		case 1:
			return String.class;
	
		}
		return null;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getColumnName(int columnIndex) {
		switch (columnIndex) {
		case 0:return "Numero Atencion";
		case 1:	return "Tipo de Vacuna Aplicada";
		default:return null;
		}
	}

	
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Atencion atencion = atenciones.get(rowIndex);
		if(atencion.getVacunacion() != null) {
			switch (columnIndex) {
				case 0:return atencion.getNumeroAtencion();
				case 1: return atencion.getVacunacion().getVacuna().getTipo();
				default: return null;
			}
		}
		return " ";
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getRowCount() {
		return atenciones.size();
	}
}
