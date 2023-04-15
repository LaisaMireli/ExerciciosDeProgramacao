package Lista3;
import java.util.Scanner;
import java.util.Arrays;

public class Lista3Questão6 {
	
	public static int [] ordenação (int [] numeros, int tamanho) {
		
		
	    int [] ordem = new int[numeros.length];
		int min;
		int aux;
		
		
		for(int i = 0; i < tamanho; i++) {
			
			ordem [i] = numeros[i];
			
		}
		
		
	    for(int i=0; i<tamanho-1; i++ ) {
	    	min = i;
	    	for (int j = (i+1); j < tamanho; j++) {
	    	      if(ordem[j] < ordem[min]) {
	    	        min = j;
	             }
	    	}
	    	if(i != min) {
	    		aux = ordem[i];
	    		ordem[i] = ordem[min];
	    		ordem[min] = aux;
	    		
	    }	    	
	    	
	    }
		return ordem;
	}
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escolha o tamanho do vetor:");
		int tamanho = scanner.nextInt();
		
		int [] numeros = new int [tamanho];
		
		System.out.println("Escolha os numeros para compor o seu vetor:");
			
			for(int i = 0; i<tamanho; i++) {
				
				System.out.println(+( i +1)+ "°");
				
				numeros[i] = scanner.nextInt();
					
			}
		
		
		int[] ordem = ordenação(numeros, tamanho);
		
		System.out.println("Seu vetor em ordem é:" +Arrays.toString(ordem));
		
		scanner.close();
		
		
	}

}
