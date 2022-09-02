
public class Cliente implements Autenticavel {

	private AutenticacaoUtil util;
	
	public Cliente() {
		util = new AutenticacaoUtil();
		
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
