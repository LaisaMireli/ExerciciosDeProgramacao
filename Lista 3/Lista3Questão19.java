package Lista3;
import java.util.Scanner;


public class Lista3Questão19 {

	public static boolean numeroPerfeito (int numero) {
		
		int divisores = 0;
		
		for(int i = 1; i < numero; i++) {
			if(numero % i == 0) {
				divisores += i;
			}
		}
		return divisores == numero;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha um número:");
		int numero = scanner.nextInt();
		
		
		boolean perfeito = numeroPerfeito(numero);
		
		if(perfeito == true) {
			
			System.out.println("É perfeito!! <3");
			
		}if(perfeito == false) {
			
			System.out.println("Não é perfeito :(");
			
		}
		scanner.close();
	}

}
