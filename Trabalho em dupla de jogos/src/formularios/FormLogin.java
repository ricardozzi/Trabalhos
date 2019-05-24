package formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.AcaoPF;
import acao.AcaoPJ;
import beans.PessoaFisica;
import beans.PessoaJuridica;
import beans.Usuario;
import dados.Dados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class FormLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passfSenha;

	public FormLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsuario.setBounds(10, 37, 58, 23);
		contentPane.add(lblUsuario);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(10, 71, 58, 23);
		contentPane.add(lblSenha);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(59, 39, 197, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastre-se");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormCadastrar f = new FormCadastrar();
				f.setVisible(true);
				dispose();
			}
		});
		btnCadastrar.setBounds(10, 102, 113, 23);
		contentPane.add(btnCadastrar);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario u = new Usuario();
				PessoaFisica pf = new PessoaFisica();
				String nome = txtUsuario.getText();
				pf.setUsuario(txtUsuario.getText());
				pf.setSenha(String.valueOf(passfSenha.getPassword()));
				
				PessoaJuridica pj = new PessoaJuridica();
				pj.setUsuario(txtUsuario.getText());
				pj.setSenha(String.valueOf(passfSenha.getPassword()));
				

				AcaoPF apf = new AcaoPF();
				AcaoPJ apj = new AcaoPJ();

				boolean validaPF = apf.validarLogin(pf);
				boolean validaPJ = apj.validarLogin(pj);

				if ((validaPF == true)||(validaPJ == true)) {
					FormLoja f = new FormLoja();
					f.setVisible(true);
					dispose();

				}else{
//				if (validaPJ == true) {
//					FormLoja f = new FormLoja();
//					f.setVisible(true);
//					dispose();
//				}
					JOptionPane.showMessageDialog(null, "Usuário inválido");
				}
			}
		});
		btnEntrar.setBounds(143, 102, 113, 23);
		contentPane.add(btnEntrar);

		passfSenha = new JPasswordField();
		passfSenha.setBounds(59, 73, 197, 20);
		contentPane.add(passfSenha);
	}
}
