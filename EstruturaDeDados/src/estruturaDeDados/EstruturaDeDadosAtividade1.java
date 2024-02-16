package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDeDadosAtividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<String> fila = new LinkedList<>();

		while (true) {
			System.out.println("\n------------ATENDIMENTO------------\n");
			System.out.println("------  Selecione uma opção: ------");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - SAIR");
			System.out.println("-----------------------------------");

			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Insira o nome do cliente: \n");
				sc.nextLine();
				String nome = sc.nextLine();
				fila.add(nome);
				break;

			case 2:
				System.out.println("Lista dos clientes na fila: \n" + fila.toString());
				break;

			case 3:
				System.out.println("Cliente Removido da fila: \n" + fila.remove());

				if (fila.isEmpty()) {
					System.out.println("Não há mais clientes na fila.");
				}
				break;

			case 0:
				System.out.println("OBRIGADE! \n");
				break;
			}
		}
	}
}