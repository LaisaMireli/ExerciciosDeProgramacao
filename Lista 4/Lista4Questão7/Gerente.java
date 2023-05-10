package Lista4Questão7;

public class Gerente extends Empregado {
	
	private int departamento;

	public Gerente(String nome, float salario, int departamento) {
		super(nome, salario);
		this.departamento = departamento;

	}
	public String toString () {
		
		return "\nNome: " + this.getNome() + "\nSalário: R$" + this.salario + "\nDepartamento: "+ this.departamento;
		
		
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

}
