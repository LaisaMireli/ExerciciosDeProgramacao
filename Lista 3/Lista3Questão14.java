package Lista3;
import java.util.Scanner;  
import java.util.Arrays;

public class Lista3Questão14 {
	
	public static int [] removeElemento (int [] vetor, int elemento) {
		
		int contador = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] != elemento) {
				contador++;
			}				
		}
		
		int [] novovetor = new int[contador];
		int j = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] != elemento){
				novovetor[j] = vetor[i];
				j++;
			}
		}
		return novovetor;
	}
	
	
	
	//verifica se o numero que o usuario digitou esta contido no vetor
	
	//public static boolean verificaNumero(int[] vetorteste, int numero) {
	 //   for (int i = 0; i < vetorteste.length; i++) {
	      //  if (vetorteste[i] == numero) {
	     //       return true;
	      //  }
	  //  }
	//    return false;
//	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha o tamanho do vetor:");
		int tamanho = scanner.nextInt();
		int [] vetor = new int[tamanho];
		

		System.out.println("Escolha os números para armazenar no vetor");
		
		for(int i = 0; i< tamanho; i++) {
			System.out.println("Escolha os números para o  vetor 1," + " " + i + "°:");
			vetor[i] = scanner.nextInt();			
		}
	
		System.out.println("Escolha um número para remover do vetor:");
		int numero = scanner.nextInt();
		
		int [] vetorfinal = removeElemento(vetor, numero);
		
		System.out.println("Vetor final: " + Arrays.toString(vetorfinal));
		
		scanner.close();
	}


}
