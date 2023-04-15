package Lista3;
import java.util.Scanner;
public class Lista3Questão3 {
	
	public static float mediaPonderada (float [] notas, int[] pesos, int tamanho) {
		float soma = 0;
		int somatorioPesos = 0;
		
		for (int i = 0; i<tamanho; i++) {
			
			soma = (notas[i]*pesos[i])+soma;
			somatorioPesos += pesos[i];
		}
		
		float media = soma/somatorioPesos;
		
		return media;
		
	}

	public static void main(String[] args) {
		
//usar scanner para saber o tamanho do vetor
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Digite a quantidade de notas: ");
		int tamanho = scanner.nextInt();
	
	    float [] notas = new float [tamanho];
	    
	    for(int i=1; i<tamanho; i++) {
	    	System.out.println("Digite a nota " +i);
	    	notas[i] = scanner.nextFloat();	
		}
		
		int [] pesos = new int [tamanho];
		for(int i = 1; i<tamanho; i++ ) {
			
			System.out.println("Qual o peso " +i + "? ");
			pesos[i] = scanner.nextInt();
			
		}
		
		float media = mediaPonderada(notas, pesos, tamanho);
		
		System.out.println("A média ponderada é:" + media);
		
		scanner.close();
	}

}
