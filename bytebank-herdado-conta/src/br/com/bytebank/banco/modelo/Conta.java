package br.com.bytebank.banco.modelo;
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		System.out.println("estou criando uma conta " + this.numero);
	}

	public static int getTotal() {
		return Conta.total;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (saldo < valor) {
			System.out.println("Saldo insuficiente");
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		} else {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso");
		}
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
			this.saca(valor);
			destino.deposita(valor);
			
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("número inválido");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("agência inválida");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	@Override
	public String toString() {
		
		return " Agencia: " + this.getAgencia() + " Numero: " + this.getNumero();
	}

}