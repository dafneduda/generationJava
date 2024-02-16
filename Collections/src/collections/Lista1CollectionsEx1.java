package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista1CollectionsEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Digite 5 cores diferentes: \n");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "ª cor: ");
			
			cores.add(sc.next()); //adicionando no array
		}

		System.out.println("\nLista de cores digitadas: " + cores);
		//ordenar em ordem crescente:
		cores.sort(null);

		System.out.println("\nLista de cores na ordem crescente: " + cores);
	}
}
