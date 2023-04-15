package Lista3;
import java.util.Scanner;  
import java.util.Arrays;

public class Lista3Questõ13 {

	public static int []  busca (int [] vetor1, int [] vetor2) {
		
		int iguais = 0;
		
		for(int i = 0; i < vetor1.length; i++) {
			for(int j = 0; j<vetor2.length; j++) {
				if(vetor1[i] == vetor2[j]) {
					iguais++;
					
				}		
			}		
		}
		
		
		int ocorrencias = 0;
		
		int [] resultado = new int [iguais];
		
		for(int i = 0; i < vetor1.length; i++) {
			for(int j = 0; j<vetor2.length; j++) {
				if (vetor1[i] == vetor2[j]) {
					
					resultado[ocorrencias] = vetor1[i];
					ocorrencias++;
				}
			}
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha o tamanho do vetor 1:");
		int tamanho1 = scanner.nextInt();
		int [] vetor1 = new int[tamanho1];
		
		System.out.println("Escolha o tamanho do vetor 2:");
		int tamanho2 = scanner.nextInt();
		int [] vetor2= new int[tamanho2];
		
		System.out.println("Escolha os números para armazenar nos vetores");
		
		for(int i = 0; i< tamanho1; i++) {
			System.out.println("Escolha os números para o  vetor 1," + " " + i + "°:");
			vetor1[i] = scanner.nextInt();			
		}
		
		for(int i = 0; i<tamanho2; i++) {
			System.out.println("Escolha os números para o  vetor 2," +  " " + i + "°:");
			vetor2[i] = scanner.nextInt();
		}
		
 		int [] vetorfinal = busca(vetor1, vetor2);
 		
 		System.out.println("Vetor final = " + Arrays.toString(vetorfinal));
 		
 		scanner.close();
	}

}
