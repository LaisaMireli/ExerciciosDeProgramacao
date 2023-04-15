package Lista3;
import java.util.Scanner;
public class Lista3Questão12 {

	public static boolean primo (int valor) {
		
		int divisores = 0;
		
		for(int i = 1; i <= valor; i++) {
			
			if(valor % i == 0 ) {
				divisores++;
				
			}
			
			if(divisores > 2) {
				return false;
				
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Escolha um número:");
		int numero = scanner.nextInt();
		
		boolean Primo = primo(numero);
		
		if(Primo == true) {
			
			System.out.println("É primo !!");

		}if (Primo == false) {
			
			System.out.println("Não é primo!!");

			
		}
		
		scanner.close();

	}

}
