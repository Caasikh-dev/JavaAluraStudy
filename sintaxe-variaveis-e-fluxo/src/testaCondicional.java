
public class testaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("você não tem 18 anos, porém está acompanhado, pode entrar");
			} else {
				System.out.println("infelizmente você não pode entrar");
			}
		}
	}
}
