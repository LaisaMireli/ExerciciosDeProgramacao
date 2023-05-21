package Lista4Questão14;

public class MainAniversario {

	public static void main(String[] args) {
		
		 Pessoa albertEinstein = new Pessoa("Albert Einstein", 14, 3, 1879);
	     Pessoa isaacNewton = new Pessoa("Isaac Newton", 4, 1, 1643);
	     
	     
	     System.out.println(albertEinstein.calcularIdade(30, 4, 2023));
	     System.out.println(isaacNewton.calcularIdade(30, 4, 2023));
	     
	}

}
