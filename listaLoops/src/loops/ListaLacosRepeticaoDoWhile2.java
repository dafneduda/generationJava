package loops;

import java.util.Scanner;

public class ListaLacosRepeticaoDoWhile2 {

	public static void main(String[] args) {

		int numero, soma = 0, multiplos3 = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if (numero % 3 == 0) {
				multiplos3++;
				;
			}

		} while (numero != 0);

		//System.out.println("\nA média de todos os números múltiplos de 3 é: " + );
	}

}
