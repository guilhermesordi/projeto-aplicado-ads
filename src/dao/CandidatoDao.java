package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Candidato;
import util.ConnectionUtil;

public class CandidatoDao {
	
	private static CandidatoDao instance;
	private List<Candidato> listaCandidato = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	public static CandidatoDao getInstance() {
		if (instance == null ) {
				instance = new CandidatoDao();
		}
		return instance;
	} 
	
	public void salvar(Candidato candidato) {
		try {
			String sql = "insert into candidato (nome, partido, ficha_limpa) values (?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, candidato.getNome());
			pstmt.setString(2, candidato.getPartido());
			pstmt.setBoolean(3, candidato.getFichaLimpa());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Candidato candidato) { 
		try {
			String sql = "update cliente set nome = ?, partido = ?, ficha_limpa = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, candidato.getNome());
			pstmt.setString(2, candidato.getPartido());
			pstmt.setBoolean(3, candidato.getFichaLimpa());
			pstmt.setInt(4, candidato.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int id) {
		try {
			String sql = "delete from candidato where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Candidato> listar() {
		List<Candidato> listaCandidato = new ArrayList<>();
		try {
			String sql = "select * from candidato";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Candidato c = new Candidato();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setPartido(rs.getString("partido"));
				c.setFichaLimpa(rs.getBoolean("ficha limpa"));
				listaCandidato.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaCandidato;
	}
		
}
