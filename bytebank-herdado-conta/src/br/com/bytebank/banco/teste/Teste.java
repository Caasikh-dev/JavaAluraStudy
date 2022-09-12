package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupança;

public class Teste {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupança(33, 22);
		Object cliente = new Cliente();

		System.out.println(cc.toString());
		System.out.println(cp);

//		println(cliente);

	}

	public static void println() {
	}

	public static void println(int a) {
	}

	public static void println(boolean bool) {
	}

	public static void println(Object b) {
	}
}