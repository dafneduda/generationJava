package loops;

import java.util.Scanner;

public class ListaLacoRepeticaoFor {

	public static void main(String[] args) {

		int numero, numerosPares = 0, numerosImpares = 0;

		Scanner leia = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				numerosPares++;

			} else {
				numerosImpares++;

			}
		}
		System.out.println("\nResultados:");
		System.out.println("Números pares: " + numerosPares);
		System.out.println("Números ímpares: " + numerosImpares);

	}
}
