package loops;

import java.util.Scanner;

public class ListaLacoRepeticaoDoWhile {

	public static void main(String[] args) {

		int numero, soma = 0, contador = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if (numero > 0) {
				contador++;
				soma += contador;
			}

		} while (numero != 0);

		System.out.println("\nA soma dos números positivos é " + soma);
	}
}
