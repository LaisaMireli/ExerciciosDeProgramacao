package Lista2;
import java.util.Scanner;

public class Lista2Questão3 {
	
	public static void main(String[] args) {
	
	int sorteado = 4;
	int adivinha;
	
	Scanner scanner = new Scanner(System.in);
	
	
	do {
	System.out.println("Tente adivinhar o número de 1 a 100:\n");
	adivinha = scanner.nextInt();
	
	if(adivinha == 4) {
		System.out.println("Parabéns!!! você acertou <3");
		
	}else if(adivinha > sorteado) {
		System.out.println("Menos\n");
		
	}else {
		System.out.println("Mais\n");
	}
	
	
	}while (adivinha != sorteado);
}
}