package lacosCondicionais;

import java.util.Scanner;

public class TesteLacoEncadeado {

	public static void main(String[] args) {
		
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
	
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
	
		media = (nota1 + nota2)/2;
		// if condição separada, queremos saber se cada 
		//condição é V ou F independente de outras
		if(media >= 6) {
			System.out.println("Parabéns, você foi aprovade!");
		// else if verificar condições adicionais somente se a condição anterior for falsa.
			// mesmo que varias condições sejam verdadeiras so executo no falso
		}else if(media == 5){
			System.out.println("Alune de exame!");
		}else {
			System.out.println("Infelizmente você foi reprovade...");
		}
	}
}