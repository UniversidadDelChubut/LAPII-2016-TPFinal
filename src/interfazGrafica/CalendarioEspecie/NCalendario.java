package interfazGrafica.CalendarioEspecie;

import java.awt.BorderLayout;

import java.awt.Dimension;


import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;




public class NCalendario extends JPanel implements TableModel{
	private static final long serialVersionUID = 1L;
	private static final int columnIndex = 0;
	private  Animal individuo;
	//private static JPanel panel;
public NCalendario(Animal animal) {
	this.setIndividuo(animal);
	//panel = new JPanel();
	JTable table = new JTable (animal.getFechas(),animal.getVacunas()); 
	table.setPreferredScrollableViewportSize(new Dimension(500, 80));
	JScrollPane scroll = new JScrollPane(table);
	this.add(scroll,BorderLayout.CENTER);	
}
private void setIndividuo(Animal animal) {
	NCalendario.this.individuo = animal;
}
public Animal getIndividuo() {
	return individuo;
}
@Override
public void addTableModelListener(TableModelListener arg0) {
	// TODO Auto-generated method stub
	
}@Override
public Class<?> getColumnClass(int arg0) {
	switch (columnIndex) {
	case 0: return String.class;
	case 1: return String.class;
	case 2: return String.class;
	case 3: return String.class;
	case 4: return String.class;
	default: return null;
}
}

@Override
public String getColumnName(int columnIndex) {
	switch (columnIndex) {
		case 0: return "Edad";
		case 1: return "Parvovirosis";
		case 2: return "Moquillo";
		case 3: return "Polivalentes";
		case 4: return "Rabia";
		default: return null;
	}
}

@Override
public int getRowCount() {
	return NCalendario.this.individuo.getVacunas().length;
}
public int getColumnCount() {
	return 5;
}
@Override
public Object getValueAt(int rowIndex, int columnIndex) {
	Animal animal = NCalendario.this.individuo;
	switch (columnIndex) {
		case 0: return animal.getVacunas()[0];
		case 1: return animal.getVacunas()[1];
		case 2: return animal.getVacunas()[2];
		case 3: return animal.getVacunas()[3];
		case 4: return animal.getVacunas()[4];
		default: return null;
	}
}
@Override
public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 0){
			return true;
		} else if (columnIndex==1){
			return true;
		} else if (columnIndex == 2){
			return true;
		} else if (columnIndex == 3) {
			return true;
		} else if (columnIndex == 4){
			return true;
		}
		
	return false;
}
@Override
public void removeTableModelListener(TableModelListener arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
	Animal alumno = NCalendario.this.individuo;
	if (columnIndex == 0){
	String string = (String)aValue;
	alumno.set(rowIndex, columnIndex, string);
	} else if (columnIndex == 1){
	String string = (String)aValue;
	alumno.set(rowIndex, columnIndex, string);
	} else if (columnIndex == 2){
	String string = (String)aValue;
	alumno.set(rowIndex, columnIndex, string);
	} else if (columnIndex == 3){
	String string = (String)aValue;
	alumno.set(rowIndex, columnIndex, string);
	} if (columnIndex == 4) {
	String string = (String)aValue;
	alumno.set(rowIndex, columnIndex, string);
	}
	return;
	
}
}

