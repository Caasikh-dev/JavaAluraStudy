
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil util;

	public Administrador() {
		util = new AutenticacaoUtil();
		
	}

	@Override
	public double getBonificacao() {
		System.out.println("chamando bonificação Administrador");
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
}
