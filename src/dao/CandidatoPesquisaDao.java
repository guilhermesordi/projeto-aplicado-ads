package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.CandidatoPesquisa;
import util.ConnectionUtil;

public class CandidatoPesquisaDao {
	
	private static CandidatoPesquisaDao instance;
	private List<CandidatoPesquisa> listaCandidatoPesquisa = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	public static CandidatoPesquisaDao getInstance() {
		if (instance == null ) {
				instance = new CandidatoPesquisaDao();
		}
		return instance;
	} 
	
	public void salvar(CandidatoPesquisa cp) {
		try {
			System.out.println("cp");
			String sql = "insert into candidato_pesquisa (fk_candidatoID, fk_pesquisaID, votos) values (?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cp.getIdCandidato());
			pstmt.setInt(2, cp.getIdPesquisa());
			pstmt.setInt(3, cp.getVotos());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(CandidatoPesquisa cp) { 
		try {
			String sql = "update candidato_pesquisa set fk_candidatoID = ?,  fk_pesquisaID = ?, votos = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cp.getIdCandidato());
			pstmt.setInt(2, cp.getIdPesquisa());
			pstmt.setInt(3, cp.getVotos());
			pstmt.setInt(4, cp.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int id) {
		try {
			String sql = "delete from candidato_pesquisa where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<CandidatoPesquisa> listar() {
		List<CandidatoPesquisa> listaCandidatoPesquisa = new ArrayList<>();
		try {
			String sql = "select * from candidato_pesquisa";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				CandidatoPesquisa cp = new CandidatoPesquisa();
				cp.setId(rs.getInt("id"));
				cp.setIdCandidato(rs.getInt("fk_candidatoid"));
				cp.setIdPesquisa(rs.getInt("fk_pesquisaid"));
				cp.setVotos(rs.getInt("votos"));
				listaCandidatoPesquisa.add(cp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaCandidatoPesquisa;
	}
		
}
