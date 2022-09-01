package bytebank;

public class Teste {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = 500;
		Conta outraConta = minhaConta;
		outraConta.saldo += 1000;
		System.out.println(minhaConta.saldo);
		
	}
}
