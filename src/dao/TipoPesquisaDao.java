package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.TipoPesquisa;
import util.ConnectionUtil;

public class TipoPesquisaDao {
	
	private static TipoPesquisaDao instance;
	private List<TipoPesquisa> listaTP = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	public static TipoPesquisaDao getInstance() {
		if (instance == null ) {
				instance = new TipoPesquisaDao();
		}
		return instance;
	} 
	
	public void salvar(TipoPesquisa tp) {
		try {
			String sql = "insert into tipo_pesquisa (descricao) values (?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, tp.getDescricao());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(TipoPesquisa tp) { 
		try {
			String sql = "update tipo_pesquisa set descricao = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, tp.getDescricao());
			pstmt.setInt(2, tp.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int id) {
		try {
			String sql = "delete from tipo_pesquisa where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<TipoPesquisa> listar() {
		List<TipoPesquisa> listaTP = new ArrayList<>();
		try {
			String sql = "select * from tipo_pesquisa";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				TipoPesquisa tp = new TipoPesquisa();
				tp.setId(rs.getInt("id"));
				tp.setDescricao(rs.getString("descricao"));
				listaTP.add(tp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaTP;
	}
		
}
