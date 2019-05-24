package acao;

import beans.PessoaFisica;
import beans.PessoaJuridica;
import beans.Usuario;
import dados.Dados;
import padrao.PadraoAcao;

public class AcaoPJ {

	
	public boolean criarConta(PessoaJuridica pj) {
		
		boolean valida = validarLogin(pj);
		if (valida == false) {
			Dados.vetorPJ.add(pj);
		}
		return valida;
	}

	
	public void excluirConta() {

	}

	
	public void alterarDados() {

	}

	
	public boolean validarLogin(PessoaJuridica pj) {
		
		boolean existe = false;
		for (int i = 0; i < Dados.vetorPJ.size(); i++) {
			String nome = Dados.vetorPJ.get(i).getUsuario();
			if (nome.equals(pj.getUsuario())) {
				existe = true;
			}
		}
		return existe;

	}

}
