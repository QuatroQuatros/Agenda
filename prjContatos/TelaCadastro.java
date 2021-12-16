package prjContatos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.PessoaDAO;
import model.Pessoa;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import java.awt.Canvas;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField cxId;
	private JTextField cxNome;
	private JTextField cxEndereco;
	private JTextField cxCidade;
	private JTextField cxEstado;
	private JTextField cxCep;
	private JTextField cxRg;
	private JTextField cxCpf;
	private JTextField cxTelefone;
	private JTextField cxCelular;
	private JTextField cxEmail;
	private JTextField cxDataNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setTitle("Cadastro Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 681, 391);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(20, 83, 46, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(20, 113, 46, 14);
		panel.add(lblNewLabel_2);
		
		cxId = new JTextField();
		cxId.setBounds(76, 83, 110, 20);
		panel.add(cxId);
		cxId.setColumns(10);
		
		cxNome = new JTextField();
		cxNome.setBounds(76, 111, 110, 20);
		panel.add(cxNome);
		cxNome.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Endere\u00E7o:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 144, 65, 14);
		panel.add(lblNewLabel_3);
		
		cxEndereco = new JTextField();
		cxEndereco.setBounds(76, 142, 110, 20);
		panel.add(cxEndereco);
		cxEndereco.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cidade:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 175, 46, 14);
		panel.add(lblNewLabel_4);
		
		cxCidade = new JTextField();
		cxCidade.setBounds(76, 173, 110, 20);
		panel.add(cxCidade);
		cxCidade.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Estado:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(218, 85, 46, 14);
		panel.add(lblNewLabel_5);
		
		cxEstado = new JTextField();
		cxEstado.setBounds(274, 81, 110, 20);
		panel.add(cxEstado);
		cxEstado.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("CEP:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(213, 112, 51, 14);
		panel.add(lblNewLabel_6);
		
		cxCep = new JTextField();
		cxCep.setBounds(274, 112, 110, 20);
		panel.add(cxCep);
		cxCep.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("RG:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(486, 85, 29, 14);
		panel.add(lblNewLabel_7);
		
		cxRg = new JTextField();
		cxRg.setBounds(525, 83, 120, 20);
		panel.add(cxRg);
		cxRg.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("CPF:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(469, 112, 46, 14);
		panel.add(lblNewLabel_8);
		
		cxCpf = new JTextField();
		cxCpf.setBounds(525, 110, 120, 20);
		panel.add(cxCpf);
		cxCpf.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Telefone:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(450, 143, 65, 17);
		panel.add(lblNewLabel_9);
		
		cxTelefone = new JTextField();
		cxTelefone.setBounds(525, 142, 120, 20);
		panel.add(cxTelefone);
		cxTelefone.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Celular:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(206, 175, 58, 14);
		panel.add(lblNewLabel_10);
		
		cxCelular = new JTextField();
		cxCelular.setBounds(274, 173, 110, 20);
		panel.add(cxCelular);
		cxCelular.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("E-mail:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_11.setBounds(206, 144, 58, 14);
		panel.add(lblNewLabel_11);
		
		cxEmail = new JTextField();
		cxEmail.setBounds(274, 142, 110, 20);
		panel.add(cxEmail);
		cxEmail.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Data Nascimento:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(404, 175, 111, 14);
		panel.add(lblNewLabel_12);
		
		cxDataNasc = new JTextField();
		cxDataNasc.setBounds(525, 173, 120, 20);
		panel.add(cxDataNasc);
		cxDataNasc.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(274, 9, 140, 61);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa pessoa = new Pessoa();
				PessoaDAO pessoaDAO = new PessoaDAO();
				pessoa.setNome(cxNome.getText());
				pessoa.setEndereco(cxEndereco.getText());
				pessoa.setCidade(cxCidade.getText());
				pessoa.setEstado(cxEstado.getText());
				pessoa.setCep(cxCep.getText());
				pessoa.setRg(cxRg.getText());
				pessoa.setCpf(cxCpf.getText());
				pessoa.setTelefone(cxTelefone.getText());
				pessoa.setCelular(cxCelular.getText());
				pessoa.setEmail(cxEmail.getText());
				pessoa.setDataNascimento(cxDataNasc.getText());
				
				
				try {
					pessoaDAO.adicionar(pessoa);
					limparBotoes();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				} catch (SQLException erro) {
					erro.printStackTrace();
				}
				
				

			}
		});
		btnNewButton.setBounds(340, 268, 120, 45);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LIMPAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cxId.setText("");
				cxNome.setText("");
				cxEndereco.setText("");
				cxCidade.setText("");
				cxEstado.setText("");
				cxCep.setText("");
				cxRg.setText("");
				cxCpf.setText("");
				cxTelefone.setText("");
				cxCelular.setText("");
				cxEmail.setText("");
				cxDataNasc.setText("");
				
				
			}
		});
		btnNewButton_1.setBounds(174, 268, 120, 45);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("NOVO");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = cxNome.getText();
				String endereco = cxEndereco.getText();
				String cidade = cxCidade.getText();
				String estado = cxEstado.getText();
				String cep = cxCep.getText();
				String rg = cxRg.getText();
				String cpf = cxCpf.getText();
				String telefone = cxTelefone.getText();
				String celular = cxCelular.getText();
				String email = cxEmail.getText();
				String dataNasc = cxDataNasc.getText();
				
				
				
			}
		});
		btnNewButton_3.setBounds(20, 268, 120, 45);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ENVIAR");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_4.setIcon(new ImageIcon(TelaCadastro.class.getResource("/prjContatos/imgs/Icon_Business_Set_00009_A_icon-icons.com_59845.png")));
		btnNewButton_4.setBounds(505, 268, 140, 45);
		panel.add(btnNewButton_4);
	}
	
	public void limparBotoes() {
		cxId.setText("");
		cxNome.setText("");
		cxEndereco.setText("");
		cxCidade.setText("");
		cxEstado.setText("");
		cxCep.setText("");
		cxRg.setText("");
		cxCpf.setText("");
		cxTelefone.setText("");
		cxCelular.setText("");
		cxEmail.setText("");
		cxDataNasc.setText("");
	}
}
