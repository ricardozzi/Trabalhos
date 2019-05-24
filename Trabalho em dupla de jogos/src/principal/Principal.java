// Alunos: Gianluca S. Scheidemantel e Ricardo S. Odorizzi
package principal;

import java.awt.EventQueue;

import beans.PessoaJuridica;
import beans.Usuario;
import formularios.FormLogin;
import dados.Dados;

public class Principal {

	public static void main(String[] args) {
		PessoaJuridica pj = new PessoaJuridica();
		pj.setUsuario("admin");
		pj.setSenha("admin");
		pj.setTipo("Pessoa juridica");
		
		Dados.vetorPJ.add(pj);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormLogin frame = new FormLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
