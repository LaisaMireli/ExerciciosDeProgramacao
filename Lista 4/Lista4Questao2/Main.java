package Lista4Questao2;

public class Main {

	public static void main(String[] args) {
	
		Empregado empregado = new Empregado ("Laisa", "Mireli", 2500);
		Empregado empregado1 = new Empregado ("Joao", "Pereira", 4000);
		
		System.out.println("Nome: " + empregado.getNome()+"\nSobrenome: "+ empregado.getSobrenome() +"\nSalário : R$"+ empregado.getSalarioM() + "\nSalário anual: R$" + empregado.salarioAual()+ "\n");
		System.out.println("Nome: " + empregado1.getNome()+"\nSobrenome: "+ empregado1.getSobrenome() +"\nSalário : R$"+ empregado1.getSalarioM() + "\nSalário anual: R$" + empregado1.salarioAual()+ "\n");

		empregado.darAumento(10);
		empregado1.darAumento(15);
		
		System.out.println("Nome: " + empregado.getNome()+"\nSobrenome: "+ empregado.getSobrenome() +"\nSalário com aumento: R$"+ empregado.getSalarioM() + "\nSalário anual com aumento: R$" + empregado.salarioAual()+ "\n");
		System.out.println("Nome: " + empregado1.getNome()+"\nSobrenome: "+ empregado1.getSobrenome() +"\nSalário com aumento: R$"+ empregado1.getSalarioM() + "\nSalário anual com aumento: R$" + empregado1.salarioAual()+ "\n");

		
	}

}
