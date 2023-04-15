package Lista3;
import java.util.Scanner;

public class Lista3Questão2 {
	
	public static int somavetores(int [] vetor) {
		
        int soma = 0;
		
		for(int i = 0; i<vetor.length; i++)
			
			soma += vetor[i];
		
		return soma;
		
	}
	
	public static int mediavetores(int [] vetor1, int [] vetor2) {
		
		int soma1 = somavetores(vetor1);
		int soma2 = somavetores(vetor2);
		int media = (soma1+soma2)/2;
		
		return media;
		
	}
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor 1: ");
		int tamanho1 = scanner.nextInt();
		int [] vetor1 = new int[tamanho1];
		
		System.out.println("Digite o tamanho do vetor 2: ");
		int tamanho2 = scanner.nextInt();
		int [] vetor2 = new int[tamanho2];

		System.out.println("Escolha os numeros para armazenar no vetor 1:");
		
		for(int i = 0; i<tamanho1; i++ ) {
		
			System.out.println("Números escolhidos vetor1:");
			vetor1[i] = scanner.nextInt();	
		}	
		
		for(int i = 0; i<tamanho2; i++ ) {
				
				System.out.println("Números escolhidos vetor2:");
				vetor2[i] = scanner.nextInt();	
	   }
		
		int media = mediavetores(vetor1, vetor2);
		
		System.out.println("A média obtida é:" + media);
       
		scanner.close();
  }
} 
