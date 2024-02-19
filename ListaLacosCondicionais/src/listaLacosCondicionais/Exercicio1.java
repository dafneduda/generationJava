package listaLacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeroA, numeroB, numeroC;

		System.out.print("Digite o número A: ");
		numeroA = leia.nextInt();

		System.out.print("Digite o número B: ");
		numeroB = leia.nextInt();

		System.out.print("Digite o número C: ");
		numeroC = leia.nextInt();

		int soma = (numeroA + numeroB);

		if (soma > numeroC) {
			System.out.println("\n" + numeroA + " + " + numeroB + " = " + soma + " > " + numeroC);
			System.out.println("\nA Soma de A + B é MAIOR do que C.");
		}

		if (soma < numeroC) {
			System.out.println("\n" + numeroA + " + " + numeroB + " = " + soma + " < " + numeroC);
			System.out.println("\nA Soma de A + B é MENOR do que C.");
		}

		if (soma == numeroC) {
			System.out.println("\n" + numeroA + " + " + numeroB + " = " + soma + " = " + numeroC);
			System.out.println("\nA Soma de A + B é IGUAL a C.");
		}
	}
}
