package Lista4Questão8;

public class MainBanco {

	public static void main(String[] args) {
	
		ContaCorrente corrente = new ContaCorrente ("Laisa", 444, 2000);
		ContaEspecial especial = new ContaEspecial("Joao", 555, 2500, 1000);
		
		System.out.println(corrente.Saque(1500)); 
		System.out.println(corrente.Saque(2010)); 
		System.out.println(especial.Saque(1500)); 
		System.out.println(especial.Saque(4000)); 
	}

}
