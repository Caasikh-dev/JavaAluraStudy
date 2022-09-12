package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

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
