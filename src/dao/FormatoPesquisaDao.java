package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.FormatoPesquisa;
import util.ConnectionUtil;

public class FormatoPesquisaDao {
	
	private static FormatoPesquisaDao instance;
	private List<FormatoPesquisa> listaFP = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	public static FormatoPesquisaDao getInstance() {
		if (instance == null ) {
				instance = new FormatoPesquisaDao();
		}
		return instance;
	} 
	
	public void salvar(FormatoPesquisa fp) {
		try {
			String sql = "insert into formato_pesquisa (descricao) values (?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, fp.getDescricao());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(FormatoPesquisa fp) { 
		try {
			String sql = "update formato_pesquisa set descricao = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, fp.getDescricao());
			pstmt.setInt(2, fp.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int id) {
		try {
			String sql = "delete from formato_pesquisa where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<FormatoPesquisa> listar() {
		List<FormatoPesquisa> listaFP = new ArrayList<>();
		try {
			String sql = "select * from formato_pesquisa";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				FormatoPesquisa fp = new FormatoPesquisa();
				fp.setId(rs.getInt("id"));
				fp.setDescricao(rs.getString("descrição"));
				listaFP.add(fp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaFP;
	}
		
}
