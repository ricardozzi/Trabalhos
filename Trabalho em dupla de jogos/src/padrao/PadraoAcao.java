package padrao;

import beans.Usuario;

public interface PadraoAcao {

	public boolean criarConta();

	public void excluirConta();

	public void alterarDados();

	public boolean validarLogin();

}
