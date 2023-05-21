package Lista4Questão7;

public class Vendedor extends Empregado {

	private float percentual;
	
	public Vendedor(String nome, float salario, float percentual) {
		super(nome, salario);
		this.percentual = percentual;
	}
	
	public double calcularSalario () {
		
		
		double comissao = this.getSalario()+(this.getSalario()* (this.percentual/100));
		
		return comissao;
	}
	
	public String toString () {
		
		return "\nNome: " + this.getNome() + "\nSalário: R$" + this.salario + "\nComissão: R$" + this.calcularSalario() ;
		
		
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}
	
	

}
