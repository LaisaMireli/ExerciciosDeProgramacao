package Lista4Questao101112;

public class MainEmpregado {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Laisa", 444, 18);
		Empregado empregado = new Empregado ("Joaoa", 344, 19, 1, 5000, 10);
		Operario operario = new Operario("Manual", 555, 30, 1, 3000, 10, 30, 40);
		Vendedor vendedor = new Vendedor("Gabriela", 666, 122, 54, 2500, 15, 30, 70);

		System.out.println(pessoa.toString());
		

		System.out.println(empregado.toString());
		System.out.println(empregado.calcularSalario());
		
		System.out.println(operario.toString());
		System.out.println(operario.calcularSalario());
		
		System.out.println(vendedor.toString());
		System.out.println(vendedor.calcularSalario());
		
	}

}
