package Lista3;
import java.util.Arrays;
import java.util.Scanner;
public class Lista3Questão5 {

	public static int[] oMesmoVetor (int [] vetor) {
		
		int [] copia = new int [vetor.length];
		
		for(int i = 0; i<vetor.length; i++) {
			copia[i] = vetor[i];
			 
		}
		return copia;
		
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha o tamanho do vetor:");
		
		int tamanho = scanner.nextInt();	
		int [] vetor = new int [tamanho];
		
		System.out.println("Escolha os números para compor o vetor");
		
		for(int i = 0; i<tamanho; i++) {
			System.out.println(+( i +1)+ "°");
			
			vetor[i] = scanner.nextInt();
		

		}
		
		int[] copia = oMesmoVetor(vetor);
		System.out.println("A cópia exata do vetor é:" + Arrays.toString(copia));
		
		scanner.close();
	}
	

}
