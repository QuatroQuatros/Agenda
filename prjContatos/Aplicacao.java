package prjContatos;

import java.sql.SQLException;
import java.util.List;

import DAO.PessoaDAO;
import model.Pessoa;

public class Aplicacao {
	public static void main(String[] args) throws SQLException {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("João");
		pessoa.setEndereco("Rua professor");
		pessoa.setCidade("São Paulo");
		pessoa.setEstado("São Paulo");
		pessoa.setCep("01236-808");
		pessoa.setRg("11.223.126-8");
		pessoa.setCpf("012.365.148.99");
		pessoa.setTelefone("1111-2222");
		pessoa.setCelular("11900123456");
		pessoa.setEmail("1234@hotmail.com");
		pessoa.setDataNascimento("1998/05/01");
		
		
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		//pessoa.setIdPessoa(14);
		//pessoaDAO.excluir(pessoa);
		//pessoa.setIdPessoa(14);
		//pessoa.setNome("Clovis");
		
		//pessoaDAO.alterar(pessoa);

		
		//pessoaDAO.adicionar(pessoa);
		


		
		
	}
}
