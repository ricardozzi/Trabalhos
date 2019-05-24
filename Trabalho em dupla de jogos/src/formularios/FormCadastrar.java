package formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.AcaoPF;
import acao.AcaoPJ;
import beans.PessoaFisica;
import beans.PessoaJuridica;
import beans.Usuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class FormCadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuarioCadastro;
	private JTextField txtSenhaCadastro;
	private JTextField txtDoc;

	public FormCadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel label = new JLabel("Usu\u00E1rio");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(10, 40, 58, 23);
		contentPane.add(label);

		txtUsuarioCadastro = new JTextField();
		txtUsuarioCadastro.setColumns(10);
		txtUsuarioCadastro.setBounds(78, 42, 197, 20);
		contentPane.add(txtUsuarioCadastro);

		JLabel label_1 = new JLabel("Senha");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(10, 74, 58, 23);
		contentPane.add(label_1);

		txtSenhaCadastro = new JTextField();
		txtSenhaCadastro.setColumns(10);
		txtSenhaCadastro.setBounds(78, 76, 197, 20);
		contentPane.add(txtSenhaCadastro);

		JComboBox cbxTipoPessoa = new JComboBox();
		cbxTipoPessoa.addItem("Pessoa Física");
		cbxTipoPessoa.addItem("Pessoa Jurídica");
		cbxTipoPessoa.setBounds(78, 113, 197, 22);
		contentPane.add(cbxTipoPessoa);

		AcaoPF apf = new AcaoPF();
		AcaoPJ apj = new AcaoPJ();

		JButton btnCadastre = new JButton("Cadastre-se");
		btnCadastre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario u = new Usuario();
				PessoaFisica pf = new PessoaFisica();
				PessoaJuridica pj = new PessoaJuridica();

				

				int indexTipo = cbxTipoPessoa.getSelectedIndex();

				switch (indexTipo) {
				case 0:
					pf.setCpf(Long.parseLong(txtDoc.getText()));
					pf.setUsuario(txtUsuarioCadastro.getText());
					pf.setSenha(txtSenhaCadastro.getText());
					pf.setTipo(cbxTipoPessoa.getSelectedItem().toString());
					apf.criarConta(pf);
					break;

				case 1:
					pj.setCnpj(Long.parseLong(txtDoc.getText()));
					pj.setUsuario(txtUsuarioCadastro.getText());
					pj.setSenha(txtSenhaCadastro.getText());
					pj.setTipo(cbxTipoPessoa.getSelectedItem().toString());
					pj.setCnpj(Long.parseLong(txtDoc.getText()));
					apj.criarConta(pj);
					break;
				}

				FormLoja f = new FormLoja();
				f.setVisible(true);
				dispose();
			}
		});
		btnCadastre.setBounds(92, 197, 113, 23);
		contentPane.add(btnCadastre);

		JLabel lblTipoDePessoa = new JLabel("Pessoa");
		lblTipoDePessoa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipoDePessoa.setBounds(10, 112, 81, 23);
		contentPane.add(lblTipoDePessoa);

		txtDoc = new JTextField();
		txtDoc.setBounds(78, 146, 197, 20);
		contentPane.add(txtDoc);
		txtDoc.setColumns(10);

		JLabel lblCpfcnpj = new JLabel("CPF/CNPJ");
		lblCpfcnpj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCpfcnpj.setBounds(10, 146, 81, 23);
		contentPane.add(lblCpfcnpj);

	}
}
