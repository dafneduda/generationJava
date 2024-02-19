package loops;

import java.util.Scanner;

public class Lista1LacoRepeticaoForAtividade2 {

	public static void main(String[] args) {

		int primeiroNumero, ultimoNumero;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo: ");
		primeiroNumero = leia.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		ultimoNumero = leia.nextInt();

		if (primeiroNumero > ultimoNumero) {
			System.out.println("Intervalo inválido (primeiro número deve ser menor do que o último número).");
		}

		for (int i = 1; i < 100; i++) {

			//for (int i = 1; i <= 10; i++) {
				System.out.print("Digite o " + i + "º número: ");
			//	numero = leia.nextInt();
				
				
			}
		}
	}



//No Intervalo entre primeiroNumero e ultimoNumero:
//é múltiplo de 3 e 5 - AINDA FALTA TERMINAR ESSA PARTE