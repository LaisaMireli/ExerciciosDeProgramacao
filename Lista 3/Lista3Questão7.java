package Lista3;
import java.util.Scanner;

public class Lista3Questão7 {
	
	public static boolean ordemcrescente (int [] vetor) {
		
		for(int i=0; i< vetor.length; i++) {
			
			if(vetor[i] > vetor[i+1]) {
				return false;
			}
		}	
		return true;	
	}
	

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escolha o tamanho do vetor:");
		int tamanho = scanner.nextInt();
		
		int [] vetor = new int [tamanho];
		
		System.out.println("Escolha os numeros para compor o seu vetor:");
		
		for(int i = 0; i<tamanho; i++) {
			
			System.out.println(+( i +1)+ "°");
			
			vetor[i] = scanner.nextInt();
				
		
		}

		
		boolean ordem = ordemcrescente(vetor);
		
		System.out.println("Está em ordem?: " + ordem );
		
		scanner.close();
	}

}
