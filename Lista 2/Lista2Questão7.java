package Lista2;
import java.util.Scanner;


public class Lista2Questão7 {
	
	public static void main(String[] args) {
		 
		 Scanner primo = new Scanner(System.in);
	     System.out.print("Digite um número inteiro: ");
	     
	        int n = primo.nextInt();
	        int i = n - 1;
	        
	        while (i > 1) {
	            boolean ehPrimo = true;
	            int j = 2;
	            while (j <= i / 2) {
	                if (i % j == 0) {
	                    ehPrimo = false;
	                   
	                }
	                j++;
	            }
	            
	            if (ehPrimo) {
	                System.out.println("O maior número primo menor que " + n + " é: " + i);
	                
	            }
	            i--;
	        }
	       
		
	

	}

}