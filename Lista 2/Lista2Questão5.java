package Lista2;
import java.util.Scanner;

public class Lista2Questão5 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Escolha limite da direita:");
	int limiteDireita = scanner.nextInt();
	
	System.out.println("Escolha limite da esquerda:");
	int limiteEsquerda = scanner.nextInt();
	
	
	for(int i = 0; i < limiteEsquerda; i++ ) {
		for(int j = 0; j < limiteDireita; j++) {
			
			 System.out.println(i + " - " + j);
			
		}
	}
	
	
	}

}
