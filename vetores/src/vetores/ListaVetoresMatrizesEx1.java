package vetores;

import java.util.Scanner;

public class ListaVetoresMatrizesEx1 {

	public static void main(String[] args) {
		int[] numeros = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numeroDigitado;

		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha um número de 1 a 10 para descobrir sua posição na lista: ");
		numeroDigitado = leia.nextInt();

		for (int i = 0; i < numeros.length; i++) {

			if (numeroDigitado == numeros[i]) {
				System.out.println("O número " + numeroDigitado + " está localizado na posição " + i + " da lista.");
				return;
			}
		}

		System.out.println("O número " + numeroDigitado + " não foi encontrado");
	}
}
