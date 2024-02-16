import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float num1 = 0;
		float num2 = 0;

		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextFloat();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextFloat();

		System.out.println("Soma = " + soma(num1, num2));
		System.out.println("Multiplicação = " + multiplicacao(num1, num2));

		turma();
		
	}

	public static Float soma(float num1, float num2) {
		return num1 + num2;
	}

	public static Float multiplicacao(float num1, float num2) {
		return num1 * num2;
	}

	public static void turma() {
		System.out.println("\n--- Calculadora da Turma 72 ---");
	}
}
