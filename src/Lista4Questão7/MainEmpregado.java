package Lista4Questão7;

public class MainEmpregado {

	public static void main(String[] args) {
		
		Empregado e = new Empregado ("Laisa", 1500);
		Vendedor v = new Vendedor("Joao", 2000, 10);
		Gerente g = new Gerente("Marcelo", 3000, 7);
		
		System.out.println(e.toString());
		System.out.println(g.toString());
		v.calcularSalario();
		System.out.println(v.toString());


	}

}
