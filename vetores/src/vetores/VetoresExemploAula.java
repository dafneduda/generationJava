package vetores;

public class VetoresExemploAula {

	public static void main(String[] args) {

		// um vetor com 4 posições = começa sempre com ZERO
		char[] letras = { 'D', 'a', 'f', 'n', 'e' };
		System.out.println(letras[1]);
		System.out.println(letras);

		System.out.println("----------- x -----------");

		int[] inteiros = { 2, 4, 6, 8, 10 };

		// para imprimir numeros inteiros preciso fazer um FOR
		for (int i = 0; i < inteiros.length; i++) {
			System.out.println(inteiros[i]);
		}

		System.out.println("----------- x -----------");

		// outra forma de imprimir Strings
		String[] nomes = { "Marcelo", "Zoe", "Dafne" };
		for (String i : nomes) {
			System.out.println(i);
		}
	}
}
	