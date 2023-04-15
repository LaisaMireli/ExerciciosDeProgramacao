package Lista3;
import java.util.Scanner;
public class Lista3Questão10 {
	
	public static boolean vetoresiguais (int [] vetor1, int [] vetor2){
		
		if(vetor1.length != vetor2.length) {
			
			return false;	
		}
		
		for(int i=0; i<vetor1.length; i++) {
			if(vetor1[i] != vetor2[i])
						return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner (System.in);
			
		 System.out.println("Escolha o tamanho do vetor 1:");
			int tamanho1 = scanner.nextInt();
			int [] vetor1 = new int[tamanho1];
			
			System.out.println("Escolha o tamanho do vetor 2:");
			int tamanho2 = scanner.nextInt();
			int [] vetor2= new int[tamanho2];
			
			
			System.out.println("Escolha os números para armazenar nos vetores");
			
			for(int i = 0; i< tamanho1; i++) {
				System.out.println("Escolha os númeroa para o  vetor 1," + " " + i + "°:");
				vetor1[i] = scanner.nextInt();			
			}
			
			for(int i = 0; i<tamanho2; i++) {
				System.out.println("Escolha os númeroa para o  vetor 2," +  " " + i + "°:");
				vetor2[i] = scanner.nextInt();
			}
		
			boolean iguais = vetoresiguais(vetor1, vetor2);
			System.out.println(iguais);
			
			scanner.close();
	}

}
