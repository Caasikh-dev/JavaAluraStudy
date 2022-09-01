package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(saldo>=valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso");
			return true;
		}else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			System.out.println("Transferencia realizado com sucesso");
			return true;
		}else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
	
}
