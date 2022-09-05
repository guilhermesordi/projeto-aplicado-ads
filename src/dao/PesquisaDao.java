package dao;

import java.util.ArrayList;
import java.util.List;
import model.Pesquisa;


public class PesquisaDao {
	
	private static PesquisaDao instance;
	private List<Pesquisa> listaPesquisa = new ArrayList<>();
	
	public static PesquisaDao getInstance() {
		if (instance == null ) {
			instance = new PesquisaDao();
		}
		return instance;
	} 
	
	public void salvar(Pesquisa pesquisa) {
		listaPesquisa.add(pesquisa);
	}
	
	public void atualizar(Pesquisa pesquisa) { 
		listaPesquisa.set(pesquisa.getId(), pesquisa);
	}
	
	public void excluir(int id) { /// aqui não entendi se é pra colocar idPesquisa ou só id kkkk
		listaPesquisa.remove(id);
	}
	
	public List<Pesquisa> listar() {
		return listaPesquisa;
	}

}
