
public class TestaTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111,333);
		cc.deposita(100);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto calcula = new CalculadorDeImposto();
		calcula.registra(cc);
		calcula.registra(sv);
		
		System.out.println(calcula.getTotalImposto());
	}
}
