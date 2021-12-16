package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class PessoaDAO {

	private Connection connection;
	
	public PessoaDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adicionar(Pessoa pessoa) throws SQLException {
		
		try {
			String sql = "INSERT INTO tbPessoa"
					+ "(nomePessoa, enderecoPessoa, cidadePessoa, estadoPessoa, cepPessoa, "
					+ "rgPessoa, cpfPessoa, telefonePessoa, celularPessoa, emailPessoa, dataNascimentoPessoa)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
		
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEndereco());
			stmt.setString(3, pessoa.getCidade());
			stmt.setString(4, pessoa.getEstado());
			stmt.setString(5, pessoa.getCep());
			stmt.setString(6, pessoa.getRg());
			stmt.setString(7, pessoa.getCpf());
			stmt.setString(8, pessoa.getTelefone());
			stmt.setString(9, pessoa.getCelular());
			stmt.setString(10, pessoa.getEmail());
			stmt.setString(11, pessoa.getDataNascimento());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.print("Erro: " + e);
			
		}
		finally {
			connection.close();
		}
	}
	public List<Pessoa> getLista() throws SQLException{
		try {
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from tbPessoa");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setIdPessoa(rs.getInt(1));
				pessoa.setNome(rs.getString(2));
				pessoa.setEndereco(rs.getString(3));
				pessoa.setCidade(rs.getString(4));
				pessoa.setEstado(rs.getString(5));
				pessoa.setCep(rs.getString(6));
				pessoa.setRg(rs.getString(7));
				pessoa.setCpf(rs.getString(8));
				pessoa.setTelefone(rs.getString(9));
				pessoa.setCelular(rs.getString(10));
				pessoa.setEmail(rs.getString(11));
				pessoa.setDataNascimento(rs.getString(12));
				
				pessoas.add(pessoa);
			}
			rs.close();
			stmt.close();
			
			return pessoas;
			
			
		}catch(SQLException e) {
			System.out.print("Erro: " + e);
			throw new RuntimeException();
		}finally {
			connection.close();
		}
	}
	public void alterar(Pessoa pessoa) throws SQLException {
		
		String sql = "UPDATE tbPessoa set nomePessoa = ?, enderecoPessoa = ?, cidadePessoa =?, estadoPessoa =?, cepPessoa =?,"
				+ "rgPessoa =?, cpfPessoa =?, telefonePessoa =?, celularPessoa =?, emailPessoa =?, dataNascimentoPessoa =? WHERE idPessoa = ?";
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEndereco());
			stmt.setString(3, pessoa.getCidade());
			stmt.setString(4, pessoa.getEstado());
			stmt.setString(5, pessoa.getCep());
			stmt.setString(6, pessoa.getRg());
			stmt.setString(7, pessoa.getCpf());
			stmt.setString(8, pessoa.getTelefone());
			stmt.setString(9, pessoa.getCelular());
			stmt.setString(10, pessoa.getEmail());
			stmt.setString(11, pessoa.getDataNascimento());
			
			stmt.setInt(12, pessoa.getIdPessoa());
			
			stmt.execute();
			stmt.close();			
		}catch(SQLException e) {
			System.out.print("Erro: " + e);
			throw new RuntimeException();
			
		}finally {
			connection.close();
		}
		
	}
	
	public void excluir(Pessoa pessoa) throws SQLException {
		
		String sql = "DELETE FROM tbPessoa WHERE idPessoa = ?";
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, pessoa.getIdPessoa());
			
			stmt.execute();
			stmt.close();			
		}catch(SQLException e) {
			System.out.print("Erro: " + e);
			throw new RuntimeException();
			
		}finally {
			connection.close();
		}
		
	}
	
}
