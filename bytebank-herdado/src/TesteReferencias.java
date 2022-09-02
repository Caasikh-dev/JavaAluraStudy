
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		EditordeVideo e1 = new EditordeVideo();
		e1.setSalario(3000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e1);
		
		System.out.println(controle.getSoma());
		
//		Funcionario f1 = new Gerente();
//		f1.setNome("Lucas");
//		Gerente g1 = (Gerente) f1;
//		g1.setSenha(1222);;
//		System.out.println(g1.autentica(2222));
		
		
	}
}
