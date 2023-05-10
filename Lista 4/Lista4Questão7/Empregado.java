package Lista4Questão7;

public class Empregado {
	
	private String nome;
	protected float salario;
	
	
	public Empregado (String nome, float salario) {
		this.nome = nome;
        this.salario = salario;
	}
	
	public String toString () {
		
		return "\nNome: " + this.nome + "\nSalário: R$" + this.salario;
		
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	

}
