
public class testeOpcional {
	public static void main(String[] args) {
		double salario = 3300.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("o IR é de 7.5% e pode deduzir R$ 142");
		}
		if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("o IR é de 15% e pode deduzir R$ 350");
		}
		if (salario >= 3751.1 && salario <= 4664.00) {
			System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
		}
	}
}