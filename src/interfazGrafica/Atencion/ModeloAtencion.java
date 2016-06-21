package interfazGrafica.Atencion;

import java.util.Date;
import java.util.LinkedList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import edu.udc.lapii.veterinaria.Atencion;

public class ModeloAtencion implements TableModel{
	LinkedList<Atencion> atenciones;
	
	public ModeloAtencion(LinkedList<Atencion> atenciones) {
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
		case 2:
			return Date.class;
		case 3:
			return String.class;
		}
		return null;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getColumnName(int columnIndex) {
		switch (columnIndex) {
		case 0: return "Numero";
		case 1: return "Tipo de Atencion";
		case 2:	return "Fecha";
		case 3: return "Veterinario";
		default:return null;
		}
	}

	
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Atencion atencion = atenciones.get(rowIndex);
		switch (columnIndex) {
			case 0: return atencion.getNumeroAtencion();
			case 1: return atencion.getTipo();
			case 2: return atencion.getFechaDeAtencion();
			case 3: return atencion.getVeterinario().getNombre();
			default: return null;
		}
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
