package listaLacosCondicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.print("Digite um número: ");
		numero = leia.nextInt();

		if (numero % 2 == 0 && numero > 0) {
			System.out.println("\nO número " + numero + " é par e positivo!");
		}

		if (numero % 2 == 0 && numero < 0) {
			System.out.println("\nO número " + numero + " é par e negativo!");
		}

		if (numero % 2 != 0 && numero > 0) {
			System.out.println("\nO número " + numero + " é ímpar e positivo!");
		}

		if (numero % 2 != 0 && numero < 0) {
			System.out.println("\nO número " + numero + " é ímpar e negativo!");
		}
	}
}