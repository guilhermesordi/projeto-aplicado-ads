package controller;

import java.util.List;

import dao.CandidatoPesquisaDao;
import model.CandidatoPesquisa;

public class CandidatoPesquisaController {
	
	public void salvar(CandidatoPesquisa candidatoPesquisa) throws Exception {
		
		if (candidatoPesquisa.getId() != 0) {
			throw new Exception("Candidato Pesquisa inválido");
		}
		CandidatoPesquisaDao.getInstance().salvar(candidatoPesquisa);
	}
	
	public void atualizar(CandidatoPesquisa candidatoPesquisa) throws Exception {
		
		if (candidatoPesquisa.getId() == 0) {
			throw new Exception("Candidato Pesquisa inválida");
		}
		CandidatoPesquisaDao.getInstance().atualizar(candidatoPesquisa); 
	}
	
	public void excluir(int id) throws Exception {
		if (id == 0) {
			throw new Exception("Nenhum Candidato Pesquisa selecionado");
		}
		CandidatoPesquisaDao.getInstance().excluir(id);
	}
	
	public List<CandidatoPesquisa> listar() {
		return CandidatoPesquisaDao.getInstance().listar();
	}
}
