package Lista4Questão3;

public class Fatura {
	
	private int numero;
	private String descricao;
	private int quantidade;
	private double precoUn;
	private double totalFatura;
	
	public Fatura(int numero, String descricao, int quantidade, double precoUn) {
		this.descricao = descricao;
		this.numero = numero;
		this.precoUn = precoUn;
		this.quantidade = quantidade;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		
		if (quantidade <= 0) {
			this.quantidade = 0;
		}
		else {
			this.quantidade = quantidade;
		}
	}

	public double getPrecoUn() {
		return precoUn;
	}

	public void setPrecoUn(double precoUn) {
		if (precoUn >= 0) {
			this.precoUn = 0;
		}
		else {
			
		this.precoUn = precoUn;
		
		}
	}

	public double getTotalFatura() {
		
		double totalFatura = this.quantidade * this.precoUn;
		
		return totalFatura;
	}

	public void setTotalFatura(double totalFatura) {
		this.totalFatura = totalFatura;
	}
	

	public double darDesconto(double desconto) {
	    double valorDesconto = precoUn * (desconto / 100);
	    double total = precoUn - valorDesconto;
	    return total;
	}
}
