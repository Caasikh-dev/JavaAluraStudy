public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil util;

	public Gerente() {
		util = new AutenticacaoUtil();
		
	}

	public double getBonificacao() {
		System.out.println("chamando bonificação Gerente");
		return super.salario;
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