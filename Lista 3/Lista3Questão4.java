package Lista3;
import java.util.Scanner;

public class Lista3Questão4 {

	public static int numerosiguais (int [] vetor1, int [] vetor2, int verificar) {
		
		int iguais = 0;
		for(int i=0 ; i<vetor1.length; i++) {
			if(vetor1[i] == verificar) {
				iguais++;
			}
		}
		
		for(int i =0; i<vetor2.length; i++) {
			if(vetor2[i] == verificar) {
				iguais++;
				
			}		
		}
		return iguais;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha o tamanho do vetor 1:");
		int tamanho1 = scanner.nextInt();
		int [] vetor1 = new int[tamanho1];
		
		System.out.println("Escolha o tamanho do vetor 2:");
		int tamanho2 = scanner.nextInt();
		int [] vetor2= new int[tamanho2];
		
		System.out.println("Escolha os números para armazenar nos vetores");
		
		for(int i = 1; i< tamanho1; i++) {
			System.out.println("Escolha os números para o  vetor 1," + " " + i + "°:");
			vetor1[i] = scanner.nextInt();			
		}
		
		for(int i = 1; i<tamanho2; i++) {
			System.out.println("Escolha os números para o  vetor 2," +  " " + i + "°:");
			vetor2[i] = scanner.nextInt();
		}
		
		System.out.println("Escolha um número para verificar:");
		int verificar = scanner.nextInt();
		
		int iguais = numerosiguais(vetor2, vetor2, verificar);
		
		System.out.println("Números iguais nos vetores: " + iguais);
		
		scanner.close();
	}


}
