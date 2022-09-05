package controller;

import java.util.List;
import dao.PesquisaDao;
import model.Pesquisa;

public class PesquisaController {
	
	public void salvar(Pesquisa pesquisa) throws Exception {
		
		if (pesquisa.getId() == 0) {
			throw new Exception("Pesquisa inválida");
		}
		PesquisaDao.getInstance().salvar(pesquisa);
	}
	
	public void atualizar(Pesquisa pesquisa) throws Exception {
		
		if (pesquisa.getId() == 0) {
			throw new Exception("Pesquisa inválida");
		}
		PesquisaDao.getInstance().atualizar(pesquisa); 
	}
	
	public void excluir(int id) throws Exception {
		if (id == 0) {
			throw new Exception("Nenhuma pesquisa selecionada");
		}
		PesquisaDao.getInstance().excluir(id);
	}
	
	public List<Pesquisa> listar() {
		return PesquisaDao.getInstance().listar();
	}
}
