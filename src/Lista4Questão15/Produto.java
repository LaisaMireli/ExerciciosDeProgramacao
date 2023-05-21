package Lista4Questão15;

public class Produto {
	
	private String nomeP;
	private double custo;
	private double venda;
	private double lucro;
	private double despesas;
	
	public Produto (String nomeP, double custo, double venda) {
		
		this.nomeP = nomeP;
		this.custo = custo;
		this.venda = venda;
	
	}
	public void margemLucro () {
		
		this.lucro = ((this.venda - this.custo) / this.venda) * 100;
		System.out.println("Lucro de " + this.lucro + "%");
	}

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public double getDespesas() {
		return despesas;
	}

	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}

}
