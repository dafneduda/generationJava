package operadoresLogicos;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
	    float n1, n2, n3, n4, mediaFinal;
	    
	    System.out.print("Digite a nota 1: ");
	    n1 = leia.nextFloat();
	    
	    System.out.print("Digite a nota 2: ");
	    n2 = leia.nextFloat();
	    
	    System.out.print("Digite a nota 3: ");
	    n3 = leia.nextFloat();
	    
	    System.out.print("Digite a nota 4: ");
	    n4 = leia.nextFloat();
	    
	    mediaFinal = (n1 + n2 + n3 + n4)/4;
	    
	    System.out.println("\nMédia final: " + mediaFinal);
	
	}

}