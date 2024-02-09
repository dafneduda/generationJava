package lacosCondicionais;

import java.util.Scanner;

public class TesteLacoELSE {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		media =(nota1 + nota2)/2;
		
		if(media >= 6) {
			System.out.println("aê, passou");
		} else {
			System.out.println("bora estudar mais um pouquinho que dá certo!");
		}
	}
}
