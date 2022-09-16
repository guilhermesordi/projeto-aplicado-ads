package view.tables;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Candidato;
import model.CandidatoPesquisa;

public class CandidatoPesquisaTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private static final int COL_ID = 0;
	private static final int COL_CANDIDATO_ID = 1;
	private static final int COL_PESQUISA_ID = 2;
	private static final int COL_VOTOS = 3;
	
	private List<CandidatoPesquisa> valores;
	
	public CandidatoPesquisaTableModel(List<CandidatoPesquisa> valores) {
		this.valores = new ArrayList<CandidatoPesquisa>(valores);
	}
	
	public int getRowCount() {
		return valores.size();
	}
	
	public int getColumnCount() {
		return 4;
	}
	
	public String getColumnName(int column) { 
		if (column == COL_ID) return "ID";
		if (column == COL_CANDIDATO_ID) return "ID Candidato";
		if (column == COL_PESQUISA_ID) return "ID Pesquisa";
		if (column == COL_VOTOS) return "Votos";
		return "";		
	}
	
	public Object getValueAt(int row, int column) {
		CandidatoPesquisa candidato = valores.get(row);
		if (column == COL_ID) 
			return candidato.getId();
		if (column == COL_CANDIDATO_ID) 
			return candidato.getIdCandidato();
		if (column == COL_PESQUISA_ID)
			return candidato.getIdPesquisa();
		if (column == COL_VOTOS)
			return candidato.getVotos();
		return "";
	}
	
	public void setValueAt(String aValue, int rowIndex, int columnIndex) {
		CandidatoPesquisa candidato = valores.get(rowIndex);
		if (columnIndex == COL_ID)
			candidato.setId(Integer.parseInt(aValue));
		else if (columnIndex == COL_CANDIDATO_ID)
			candidato.setIdCandidato(Integer.parseInt(aValue));
		else if (columnIndex == COL_PESQUISA_ID)
			candidato.setIdPesquisa(Integer.parseInt(aValue));
		else if (columnIndex == COL_VOTOS)
			candidato.setVotos(Integer.parseInt(aValue));
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}
	
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
	
	public CandidatoPesquisa get(int row) {
		return valores.get(row);
	}
}
	
	
	