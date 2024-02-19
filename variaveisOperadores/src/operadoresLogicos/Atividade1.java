package operadoresLogicos;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	    float salario, abono, novoSalario;
	    
	    System.out.print("Digite salário: R$");
	    salario = leia.nextFloat();
	    
	    System.out.print("\nDigite abono: R$");
	    abono = leia.nextFloat();
	    
	    novoSalario = (salario + abono);
	    
	    System.out.println("\nNovo salário: R$" + novoSalario);

	}

}
