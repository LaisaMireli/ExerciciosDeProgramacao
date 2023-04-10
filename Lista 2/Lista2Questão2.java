package Lista2;
import java.util.Scanner;

public class Lista2Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		do {
            System.out.print("Digite um número positivo: ");
            num = scanner.nextInt();
            if (num >= 0) {
                soma += num;
            }
        } while (num >= 0);
        
        System.out.println("A soma dos números positivos é: " + soma);
    }
		
		

	}


