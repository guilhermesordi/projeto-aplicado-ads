package dao;

import java.util.List;
import java.util.ArrayList;

import model.Candidato;

public class CandidatoDao {
	
	private static CandidatoDao instance;
	private List<Candidato> listaCandidato = new ArrayList<>();
	
	public static CandidatoDao getInstance() {
		if (instance == null ) {
			instance = new CandidatoDao();
		}
		return instance;
	} 
	
	public void salvar(Candidato candidato) {
		listaCandidato.add(candidato);
	}
	
	public void atualizar(Candidato candidato) { 
		listaCandidato.set(candidato.getId(), candidato);
	}
	
	public void excluir(int id) {
		listaCandidato.remove(id);
	}
	
	public List<Candidato> listar() {
		return listaCandidato;
	}
		
}
