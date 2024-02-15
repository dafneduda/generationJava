package loops;

import java.util.Scanner;

public class ListaLacoRepeticaoWhile {

	public static void main(String[] args) {

		int idade, menores21 = 0, maiores50 = 0;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite a idade: ");
		idade = leia.nextInt();

		while (idade >= 0) {

			if (idade < 21) {
				menores21++;
				if (idade > 50) {
					maiores50++;
				}
			}
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
		}
		System.out.println("\nResultados:");
		System.out.println("Total de menores de 21 anos: " + menores21);
		System.out.println("Total de maiores de 50 anos: " + maiores50);

	}

}
