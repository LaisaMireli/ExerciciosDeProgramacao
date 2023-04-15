package Lista3;
import java.util.Scanner;
public class Lista3Questão1 {
	
	public static int somavetores (int vetor[]) {
		
		int soma = 0;
		
		for(int i = 2; i<vetor.length - 2; i++)
			
			soma += vetor[i];
		
		return soma;
	}
			
		
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int numero = ler.nextInt();

		int [] vetor = new int[numero];
		
		System.out.println("Escolha um valor para cada posição do vetor:");
		
		for(int i = 0; i<numero; i++ ) {
		
			System.out.println("Posição:" + i + "ª");
			vetor[i] = ler.nextInt();	
			
			
		}
		
		int resultado = somavetores(vetor);
		
		System.out.println("Resultado sem considerar os dois primeiros e dois ultimos inseridos:" + resultado);
		
		ler.close();

    }
}