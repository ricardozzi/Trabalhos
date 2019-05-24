package acao;

import beans.PessoaFisica;
import dados.Dados;

public class AcaoCliente {
	public static String nome() {
		String nome = Dados.vetorPF.get(0).getUsuario();
		return nome;
	}
	
	public String senha() {
		String senha = Dados.vetorPF.get(0).getSenha();
		return senha;
	}
	
	public String tipo() {
		String tipo = Dados.vetorPF.get(0).getTipo();
		return tipo;
	}
	
	public long doc() {
		long doc = Dados.vetorPF.get(0).getCpf(); 
		return doc;
	}

}
