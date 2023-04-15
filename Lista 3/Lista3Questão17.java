package Lista3;

import java.util.Scanner;

public class Lista3Questão17 {
	
	public static String invertePalavra (String palavra) {
		
		char caracteres [] = palavra.toCharArray();
		char [] caracteresInvertidos = new char[caracteres.length];
		
				
		for(int i =0, j = caracteres.length - 1; i < caracteres.length; i++, j--) {
			
			caracteresInvertidos[i] = caracteres[j];
			
		}
		return new String(caracteresInvertidos);
		
	}

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra  = scanner.nextLine();
		
		
		String PalavraIvertida = invertePalavra(palavra);
		
		System.out.println("Sua palavra invertida:" + PalavraIvertida);
		
		scanner.close();
	}

}
