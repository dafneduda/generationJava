package lacosCondicionais;

public class TesteLacoIFelse {

	public static void main(String[] args) {
		int idade = 15;
		boolean possuiCarteira = false;
		boolean possuiCarro = true;
		 
		if(idade >= 18 && possuiCarteira || possuiCarro) {
			System.out.println("Vá la motorista de fuga, dirija!");
		} else {
			System.out.println("Calma jovem padawan, jaja você pilota");
		}
	}
	}