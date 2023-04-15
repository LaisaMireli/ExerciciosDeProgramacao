package Lista3;
import java.util.Arrays;
import java.util.Scanner;


public class Lista3Questão20 {
	
	public static int [] novoVetor(int tamanho) {
			
		int [] vetor = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			
			vetor[i] = i +1;
		}
		while(tamanho > 1) {
			tamanho --;
			
			System.out.println(Arrays.toString(vetor));
			
			int [] novovetor = new int[tamanho];
			
			for(int i = 0; i < tamanho; i++ ) {
				
				novovetor[i] = vetor[i];
			}
				vetor = novovetor;
		}
		return vetor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha o tamanho do vetor:");
		int tamanho = scanner.nextInt();
		
		
		int [] diminuicao = novoVetor (tamanho);
		
		System.out.println(Arrays.toString(diminuicao));
		
		scanner.close();
	}

}
