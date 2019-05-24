package acao;

import beans.PessoaFisica;
import beans.Usuario;
import dados.Dados;
import padrao.PadraoAcao;

public class AcaoPF  {

	public boolean criarConta(PessoaFisica pf) {
		
		boolean valida = validarLogin(pf);
		if (valida == false) {
			Dados.vetorPF.add(pf);
			
			
		}
		return valida;
	}

	
	public void excluirConta() {

	}

	
	public void alterarDados() {
		
	}

	
	public boolean validarLogin(PessoaFisica pf) {
	
		boolean existe = false;
		for (int i = 0; i < Dados.vetorPF.size(); i++) {
			String nome = Dados.vetorPF.get(i).getUsuario();
			if (nome.equals(pf.getUsuario())) {
				existe = true;
			}
		}
		return existe;

	}

}
