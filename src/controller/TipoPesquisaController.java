package controller;

import java.util.List;

import dao.TipoPesquisaDao;
import model.TipoPesquisa;

public class TipoPesquisaController {
	
	public void salvar(TipoPesquisa tipoPesquisa) throws Exception {
		
//		if (tipoPesquisa.getId() == 0) {
//			throw new Exception("Tipo Pesquisa inválido");
//		}
		TipoPesquisaDao.getInstance().salvar(tipoPesquisa);
	}
	
	public void atualizar(TipoPesquisa tipoPesquisa) throws Exception {
		
		if (tipoPesquisa.getId() == 0) {
			throw new Exception("Tipo Pesquisa inválido");
		}
		TipoPesquisaDao.getInstance().atualizar(tipoPesquisa); 
	}
	
	public void excluir(int id) throws Exception {
		if (id == 0) {
			throw new Exception("Nenhum Tipo Pesquisa selecionado");
		}
		TipoPesquisaDao.getInstance().excluir(id);
	}
	
	public List<TipoPesquisa> listar() {
		return TipoPesquisaDao.getInstance().listar();
	}
}
