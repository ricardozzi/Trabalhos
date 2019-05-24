package formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import acao.AcaoCliente;
import dados.Dados;


import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class FormLoja extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtSenha;
	private JTextField txtDoc;

	public FormLoja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panelPS4 = new JPanel();
		panelPS4.setBounds(125, 4, 417, 439);
		contentPane.add(panelPS4);
		panelPS4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("jogo1");
		lblNewLabel.setBounds(10, 11, 150, 150);
		panelPS4.add(lblNewLabel);
		
		JLabel lblJogo = new JLabel("jogo2");
		lblJogo.setBounds(194, 11, 150, 150);
		panelPS4.add(lblJogo);
		
		JLabel lblJogo_1 = new JLabel("jogo3");
		lblJogo_1.setBounds(10, 172, 150, 150);
		panelPS4.add(lblJogo_1);
		
		JLabel lblJogo_2 = new JLabel("jogo4");
		lblJogo_2.setBounds(194, 172, 150, 150);
		panelPS4.add(lblJogo_2);
		panelPS4.setVisible(true);

		JPanel panelDados = new JPanel();
		panelDados.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDados.setBounds(233, 11, 302, 424);
		contentPane.add(panelDados);
		panelDados.setLayout(null);
		panelDados.setVisible(false);

		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(78, 13, 197, 20);
		panelDados.add(txtUsuario);

		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsuario.setBounds(10, 11, 58, 23);
		panelDados.add(lblUsuario);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(10, 45, 58, 23);
		panelDados.add(lblSenha);

		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(78, 47, 197, 20);
		panelDados.add(txtSenha);

		JLabel lblTipoPessoa = new JLabel("Pessoa");
		lblTipoPessoa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipoPessoa.setBounds(10, 83, 81, 23);
		panelDados.add(lblTipoPessoa);

		JComboBox cbxTipoPessoa = new JComboBox();
		cbxTipoPessoa.setBounds(78, 84, 197, 22);
		panelDados.add(cbxTipoPessoa);

		cbxTipoPessoa.addItem("Pessoa física");
		cbxTipoPessoa.addItem("Pessoa jurídica");

		JLabel lblDoc = new JLabel("CPF/CNPJ");
		lblDoc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDoc.setBounds(10, 117, 81, 23);
		panelDados.add(lblDoc);

		txtDoc = new JTextField();
		txtDoc.setColumns(10);
		txtDoc.setBounds(78, 117, 197, 20);
		panelDados.add(txtDoc);

		JButton btnAlterarDados = new JButton("Alterar dados");
		btnAlterarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAlterarDados.setBounds(20, 160, 119, 23);
		panelDados.add(btnAlterarDados);

		JButton btnExcluirConta = new JButton("Excluir conta");
		btnExcluirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnExcluirConta.setBounds(156, 160, 119, 23);
		panelDados.add(btnExcluirConta);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormLogin f = new FormLogin();
				f.setVisible(true);
				dispose();
			}
		});
		btnSair.setBounds(0, 423, 115, 23);
		contentPane.add(btnSair);

		JButton btnAreaRestrita = new JButton("\u00C1rea restrita");
		btnAreaRestrita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormAdmin f = new FormAdmin();
				f.setVisible(true);
				dispose();
			}
		});
		btnAreaRestrita.setBounds(0, 396, 115, 23);
		contentPane.add(btnAreaRestrita);

		JButton btnMeusDados = new JButton("Meus dados");
		btnMeusDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPS4.setVisible(false);
				panelDados.setVisible(true);
				
				AcaoCliente ac = new AcaoCliente(); 
				
				txtUsuario.setText(AcaoCliente.nome());
				cbxTipoPessoa.setSelectedItem(ac.tipo());
				txtSenha.setText(ac.senha());
				txtDoc.setText(String.valueOf((ac.doc())));
				
			}
		});
		btnMeusDados.setBounds(0, 369, 115, 23);
		contentPane.add(btnMeusDados);
		
		JButton btnJogosPS4 = new JButton("PS4");
		btnJogosPS4.setBounds(0, 4, 115, 23);
		contentPane.add(btnJogosPS4);
		
		JButton btnJogosXbox = new JButton("Xbox One");
		btnJogosXbox.setBounds(0, 38, 115, 23);
		contentPane.add(btnJogosXbox);
		
		JButton btnJogosPc = new JButton("PC");
		btnJogosPc.setBounds(0, 72, 115, 23);
		contentPane.add(btnJogosPc);
		
		JLabel lblCarrinho = new JLabel("");
		lblCarrinho.setIcon(new ImageIcon(FormLoja.class.getResource("/imagens/carrinho.jpg")));
		lblCarrinho.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
		});
		lblCarrinho.setBounds(10, 105, 100, 100);
		contentPane.add(lblCarrinho);

	}
}
