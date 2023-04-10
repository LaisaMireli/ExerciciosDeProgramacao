package Lista2;
import java.util.Scanner;


public class Lista2Questão4 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int numero;
	int tabela = 0;
	
	System.out.println("Escolha um numero:");
	numero = scanner.nextInt();
	
		while(tabela<=10){
			int resultado = numero * tabela;
			 System.out.println(numero + " x " + tabela + " = " + resultado);
			 
			 	tabela++;
			 	
			
		}


    }
	
}