
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		//outros tipos
		//long numeroGrande = 2312312312313113132l;
		//short valorPequeno = 2131;
		//byte b = 127;
		
		//Caso do 0.3000004
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
	
}
