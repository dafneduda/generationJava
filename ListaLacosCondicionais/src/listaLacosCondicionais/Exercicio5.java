package listaLacosCondicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int codigoItem, qtde;
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## #####  ##  Produtos  ##  ##### ## #");
		System.out.println("\n-- 1:  Cachorro Quente: 	R$10,00");
		System.out.println("-- 2:  X-Salada: 		R$15,00");
		System.out.println("-- 3:  X-Bacon: 		R$18,00");
		System.out.println("-- 4:  Bauru: 			R$8,00");
		System.out.println("-- 5:  Refrigerante: 		R$12,00");
		System.out.println("-- 6:  Suco de Laranja: 	R$13,00");

		System.out.println("\nDigite o Código do Produto: ");
		codigoItem = leia.nextInt();

		System.out.println("Quantidade desejada: ");
		qtde = leia.nextInt();

		int valorTotal = 0;
		String nomeProduto = "";

		switch (codigoItem) {
		case 1:
			nomeProduto = "Cachorro Quente";
			valorTotal = qtde * 10;
			break;
		case 2:
			nomeProduto = "X-Salada";
			valorTotal = qtde * 15;
			break;
		case 3:
			nomeProduto = "X-Bacon";
			valorTotal = qtde * 18;
			break;
		case 4:
			nomeProduto = "Bauru";
			valorTotal = qtde * 8;
			break;
		case 5:
			nomeProduto = "Refrigerante";
			valorTotal = qtde * 12;
			break;
		case 6:
			nomeProduto = "Suco de Laranja";
			valorTotal = qtde * 13;
			break;

		default:
			System.out.println("Opção inválida, não há produto para número digitado");
		}
		
		System.out.println("Você comprou " + qtde + " " +
		nomeProduto + "\nValor Total: R$" + valorTotal);

	}

}
