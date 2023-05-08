package BibliotecaTecProg;

public class Professores extends Clientes{

	public Professores(String nome, int matricula) {
		super(nome, matricula);
		this.tipo = "Professor";

	}

	public int verificarDias() {
		return 20;
	}


	public double calcularCustoEmTPs() {

		return 0;
	}


	public int maximoEmprestimo() {
	
		return 10;
	}
	
	
}
