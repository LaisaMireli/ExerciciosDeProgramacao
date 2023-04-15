package Lista3;
import java.util.Scanner;
public class Lista3Questão11 {

	public static int potencia (int base, int expoente) {
		
		int resultado = 1;
		
		for (int i = 0; i < expoente; i++){
			
			resultado *= base;
			
		}	
		return resultado;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Escolha um número:");
		int base = scanner.nextInt();
		
		System.out.println("Escolha a potência:");
		int expoente = scanner.nextInt();
		
		
		int resultado = potencia(base, expoente);
						
		System.out.println("Resultado = " + resultado);		
	
		scanner.close();
	}

	
	
}
