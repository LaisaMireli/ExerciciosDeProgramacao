package Lista3;
import java.util.Scanner;

public class Lista3Questão18 {
	
	public static float jurosCompostos( float capital, float periodo, float taxa ) {
		
		float montante = capital;
		
		for(int i = 0; i < periodo; i++) {
			
			montante *= (1 + taxa);
			
		}
		return montante;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha capital inicial:");
		float capital = scanner.nextFloat();
		
		System.out.println("Escolha um período:");
		float periodo = scanner.nextFloat();
		
		System.out.println("Escolha uma taxa:");
		float taxa = scanner.nextFloat();
		
		float resultado = jurosCompostos(capital, periodo, taxa /12f);
		
		System.out.println("Os juros compostos por ano serão: " + "R$" + resultado );
		
		scanner.close();

	}

}
