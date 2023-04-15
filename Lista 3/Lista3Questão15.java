package Lista3;
import java.util.Scanner;  


public class Lista3Questão15 {

	public static boolean palindromo (String palavra) {
		
		char[] caracteres = palavra.toCharArray();
		
		for(int i =0, j = caracteres.length - 1; i < caracteres.length / 2; i++, j--) {
		
				if(caracteres[i] != caracteres[j]) {
					
					return false;
					
				}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra  = scanner.nextLine();
		
		boolean texto = palindromo(palavra);
		
		if(texto == true) {
			
			System.out.print("É palindromo! ");
			
		}
		
		if(texto == false) {
			
			System.out.print("Não é palindromo! ");
			
		}
		
		scanner.close();
	}

}
