package formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class FormAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeJogo;
	private JTextField txtPreco;

	public FormAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(10, 37, 57, 20);
		contentPane.add(lblNome);

		txtNomeJogo = new JTextField();
		txtNomeJogo.setBounds(77, 38, 227, 20);
		contentPane.add(txtNomeJogo);
		txtNomeJogo.setColumns(10);

		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPlataforma.setBounds(10, 68, 57, 20);
		contentPane.add(lblPlataforma);

		JComboBox cbxPlataforma = new JComboBox();
		cbxPlataforma.setBounds(77, 69, 227, 22);
		contentPane.add(cbxPlataforma);

		cbxPlataforma.addItem("PS4");
		cbxPlataforma.addItem("Xbox One");
		cbxPlataforma.addItem("PC");

		JLabel lblPreco = new JLabel("Pre\u00E7o");
		lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreco.setBounds(10, 99, 57, 20);
		contentPane.add(lblPreco);

		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(77, 100, 227, 20);
		contentPane.add(txtPreco);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(0, 143, 106, 23);
		contentPane.add(btnCadastrar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(111, 143, 106, 23);
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(220, 143, 106, 23);
		contentPane.add(btnExcluir);

	}
}
