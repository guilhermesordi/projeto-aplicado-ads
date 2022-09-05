package controller;

import java.util.List;

import dao.FormatoPesquisaDao;
import model.FormatoPesquisa;

public class FormatoPesquisaController {
	
	public void salvar(FormatoPesquisa formatoPesquisa) throws Exception {
		
		if (formatoPesquisa.getId() == 0) {
			throw new Exception("Formato Pesquisa inválido");
		}
		FormatoPesquisaDao.getInstance().salvar(formatoPesquisa);
	}
	
	public void atualizar(FormatoPesquisa formatoPesquisa) throws Exception {
		
		if (formatoPesquisa.getId() == 0) {
			throw new Exception("Formato Pesquisa inválido");
		}
		FormatoPesquisaDao.getInstance().atualizar(formatoPesquisa); 
	}
	
	public void excluir(int id) throws Exception {
		if (id == 0) {
			throw new Exception("Nenhum Formato Pesquisa selecionado");
		}
		FormatoPesquisaDao.getInstance().excluir(id);
	}
	
	public List<FormatoPesquisa> listar() {
		return FormatoPesquisaDao.getInstance().listar();
	}
}
