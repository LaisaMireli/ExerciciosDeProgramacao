package Lista4Questao101112;

public class Empregado extends Pessoa{

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	
	public Empregado(String nome, int cpf, int idade, int codigoSetor, double salarioBase, double imposto) {
		super(nome, cpf, idade);
		
		this.codigoSetor = codigoSetor;
		this.imposto = imposto;
		this.salarioBase  = salarioBase;
		
	}
	
	public double calcularSalario() {
		
		System.out.println("\nSalário com atributos:");
		this.salarioBase = this.salarioBase - (this.salarioBase*(this.imposto/100));
		
		return this.salarioBase;
	}
	
	public String toString () {
		
		return "\nNome: " + getNome() + "\nCpf: " + getCpf() + "\nIdade: " + getIdade() +"\nCodigo setor: " + this.codigoSetor + "\nSalario Base: R$" + this.salarioBase + "\nImposto: " 
		+ this.imposto;
		
	}
	


	public int getCodigoSetor() {
		return codigoSetor;
	}


	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public double getImposto() {
		return imposto;
	}


	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

}
