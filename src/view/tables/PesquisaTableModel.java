package view.tables;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Pesquisa;

public class PesquisaTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private static final int COL_ID = 0;
	private static final int COL_INST = 1;
	private static final int COL_DATA = 2;
	private static final int COL_LOCAL = 3;
	private static final int COL_IDADE = 4;
	private static final int COL_FKTIPO = 5;
	private static final int COL_FKFORMATO = 6;
	
	private List<Pesquisa> valores;
	
	public PesquisaTableModel(List<Pesquisa> valores) {
		this.valores = new ArrayList<Pesquisa>(valores);
	}
	
	public int getRowCount() {
		return valores.size();
	}
	
	public int getColumnCount() {
		return 6;
	}
	
	public String getColumnName(int column) { 
		if (column == COL_ID) return "ID";
		if (column == COL_INST) return "Instituição";
		if (column == COL_DATA) return "Data";
		if (column == COL_LOCAL) return "Local";
		if (column == COL_IDADE) return "Média de idade";
		if (column == COL_FKTIPO) return "Tipo";
		if (column == COL_FKFORMATO) return "Formato";
		return "";		
	}
	
	public Object getValueAt(int row, int column) {
		Pesquisa pesquisa = valores.get(row);
		if (column == COL_ID) 
			return pesquisa.getId();
		if (column == COL_INST) 
			return pesquisa.getInstituicao();
		if (column == COL_DATA)
			return pesquisa.getDataPesquisa();
		if (column == COL_LOCAL)
			return pesquisa.getLocalPesquisa();
		if (column == COL_IDADE)
			return pesquisa.getMediaIdade();
		if (column == COL_FKTIPO)
			return pesquisa.getIdTipoPesquisa();
		if (column == COL_FKFORMATO)
			return pesquisa.getIdFormatoPesquisa();
		return "";
	}
	
	public void setValueAt(String aValue, int rowIndex, int columnIndex) {
		Pesquisa pesquisa = valores.get(rowIndex);
		if (columnIndex == COL_ID)
			pesquisa.setId(Integer.parseInt(aValue));
		else if (columnIndex == COL_INST)
			pesquisa.setInstituicao(aValue);
		else if (columnIndex == COL_DATA)
			pesquisa.setDataPesquisa(java.sql.Date.valueOf(aValue));
		else if (columnIndex == COL_LOCAL)
			pesquisa.setLocalPesquisa(aValue);
		else if (columnIndex == COL_IDADE)
			pesquisa.setMediaIdade(Double.valueOf(aValue));
		else if (columnIndex == COL_FKTIPO)
			pesquisa.setIdTipoPesquisa(Integer.parseInt(aValue));
		else if (columnIndex == COL_FKFORMATO)
			pesquisa.setIdFormatoPesquisa(Integer.parseInt(aValue));	
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}
	
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
	
	public Pesquisa get(int row) {
		return valores.get(row);
	}
}
	
	
	