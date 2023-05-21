package Lista4Questão6;

public class Ingresso {

	protected double valorIngresso;
	public int quantidadeTotal;
	
	
	public Ingresso(double valorIngresso, int quantidadeTotal) {
		this.valorIngresso =  valorIngresso;
		this.quantidadeTotal = quantidadeTotal;
	}
	
	public Ingresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	public String toString () {
		return "Valor do ingresso padrão: R$" + valorIngresso;
	}

	public double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	public int getQuantidadeTotal() {
		return quantidadeTotal;
	}
	public void setQuantidadeTotal( int quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}

	public double getValorAdicional() {
		// TODO Auto-generated method stub
		return 0;
	}
}
