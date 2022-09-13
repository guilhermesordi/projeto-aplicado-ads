package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Pesquisa;
import util.ConnectionUtil;

public class PesquisaDao {
	
	private static PesquisaDao instance;
	private List<Pesquisa> listaPesquisa = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	public static PesquisaDao getInstance() {
		if (instance == null ) {
				instance = new PesquisaDao();
		}
		return instance;
	} 
	
	public void salvar(Pesquisa p) {
		try {
			String sql = "insert into pesquisa (instituicao, dataPesquisa, localPesquisa, media_idade, fk_tipoPesquisa, fk_formatoPesquisa) values (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, p.getInstituicao());
			pstmt.setDate(2, new java.sql.Date(p.getDataPesquisa().getTime()));
			pstmt.setString(3, p.getLocalPesquisa());
			pstmt.setDouble(4, p.getMediaIdade());
			pstmt.setInt(5, p.getIdTipoPesquisa());
			pstmt.setInt(6, p.getIdFormatoPesquisa());

			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Pesquisa p) { 
		try {
			String sql = "update pesquisa set instituicao = ?,  dataPesquisa = ?, localPesquisa = ?, media_idade = ?, fk_tipoPesquisa = ?, fk_formatoPesquisa = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, p.getInstituicao());
			pstmt.setDate(2, new java.sql.Date(p.getDataPesquisa().getTime()));
			pstmt.setString(3, p.getLocalPesquisa());
			pstmt.setDouble(4, p.getMediaIdade());
			pstmt.setInt(5, p.getIdTipoPesquisa());
			pstmt.setInt(6, p.getIdFormatoPesquisa());
			pstmt.setInt(7, p.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int id) {
		try {
			String sql = "delete from pesquisa where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Pesquisa> listar() {
		List<Pesquisa> listaPesquisa = new ArrayList<>();
		try {
			String sql = "select * from pesquisa";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Pesquisa p = new Pesquisa();
				p.setId(rs.getInt("id"));
				p.setInstituicao(rs.getString("instituição"));
				p.setDataPesquisa(rs.getDate("data"));
				p.setLocalPesquisa(rs.getString("local"));
				p.setMediaIdade(rs.getDouble("Média da idade"));
				p.setIdTipoPesquisa(rs.getInt("tipo de pesquisa id"));
				p.setIdFormatoPesquisa(rs.getInt("formato de pesquisa id"));
				listaPesquisa.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaPesquisa;
	}
		
}
