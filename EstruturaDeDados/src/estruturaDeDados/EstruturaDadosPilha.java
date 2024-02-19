package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class EstruturaDadosPilha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		while (true) {
			System.out.println("\n--------------LIVRARIA--------------");
			System.out.println("1 - Adicionar um novo livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - SAIR");
			System.out.println("-----Entre com a opção desejada:-----");

			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Insira o nome do livro: \n");
				sc.nextLine();
				String nome = sc.nextLine();
				pilha.push(nome);
				System.out.println("Livro adicionado!");
				break;

			case 2:
				System.out.println("Lista de todos os livros: \n" + pilha.toString());
				break;

			case 3:
				System.out.println("Livro removido da pilha: \n" + pilha.pop());

				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				}
				break;

			case 0:
				System.out.println("OBRIGADE! \n");
				break;

			default:
				System.out.println("Opção inválida!");
			}
		}
	}

}
