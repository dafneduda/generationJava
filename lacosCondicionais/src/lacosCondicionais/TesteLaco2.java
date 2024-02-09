package lacosCondicionais;

public class TesteLaco2 {

	public static void main(String[] args) {
		int n1 = 4, n2 = 3, n3 = 4;

		if (n1 < 5) { //n1 = 4 || (3 < 5) || true
			System.out.println("O número 1 é menor que o 5.");
		}
		if (n1 < n2) { // 4<3 || falso
			System.out.println("O número 1 é menor que o 2.");
		}
		if(n1 == n3) { // 4 é igual a 4 ? || true
			System.out.println("O número 1 e o número 3 são iguais.");
		}
		/*condição composta
		//if(n1 < 5 && n2 < 5 && n3 <5) {
			
		}*/
	}
}