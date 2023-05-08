package BibliotecaTecProg;

public class Servidores extends Clientes{

	public Servidores(String nome, int matricula) {
		super(nome, matricula);

		this.tipo = "Servidor";

	}
	
	public int verificarDias() {
		return 15;
	}


	public double calcularCustoEmTPs() {
		return 0;
	}

	
	public int maximoEmprestimo() {

		return 7;
	}

	

}
