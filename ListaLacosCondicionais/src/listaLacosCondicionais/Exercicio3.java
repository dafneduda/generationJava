package listaLacosCondicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		String nome;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Nome do doador: ");
		nome = leia.next();

		int idade;
		Scanner leia1 = new Scanner(System.in);
		System.out.println("Digite a Idade do doador: ");
		idade = leia1.nextInt();

		boolean doacao = true;

		if (idade > 18 && idade <= 59) {
			System.out.println(nome + " está apto para doar sangue!");
		}

		else if (idade >= 60 && idade <= 69) {
			System.out.println("Primeira doação de sangue? ");
			doacao = leia.nextBoolean();

			if (doacao) {
				System.out.println(nome + " não está apto para doar sangue!");
			} else {
				System.out.println(nome + " está apto para doar sangue!");
			}
		}
	}
}
