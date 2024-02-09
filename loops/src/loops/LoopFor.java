package loops;

public class LoopFor {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 4;
		int num3 = 5;
		int num4 = 8;
		int num5 = 10;
		int num6 = 11;
		int num7 = 14;
		int num8 = 17;
		int num9 = 19;
		int num10 = 20;

		int[] numeros = { num1, num2, num3, num4, num5, num6, num7, num8, num9, num10 };

		// 3 parâmetros (valor inicial; condição limite ou de teste; contador incremento soma 1 ou subtrai)
		for (int i = 1; i < numeros.length; i++) {
			//bloco de comandos (corpo do laço)
			int numero = numeros[i];
			if (isOdd(numero)) {
				System.out.println(numero + " é ímpar.");
			} else {
				System.out.println(numero + " é par.");
			}
		}
		System.out.println("");

	}

	public static boolean isOdd(int numero) {
		return numero % 2 != 0;
	}
}
