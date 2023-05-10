package Lista4Questao4;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;

	public Produto (String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double comprarProduto() {
	    double total = this.preco * this.quantidade;
	    double desconto = 0.0;
	    
	    if (this.quantidade > 0) {
	        System.out.println("\nCompra realizada");
	    }
	    
	    if (this.preco < 100) {
	        desconto = total * 0.0; 
	    } else if (this.preco >= 100 && this.preco <= 200) {
	        desconto = total * 0.1; 
	    } else if (this.preco >= 200 && this.preco <= 500) {
	        desconto = total * 0.2; 
	    } else if (this.preco > 500) {
	        desconto = total * 0.25; 
	    }
	    
	    double totalFatura = total - desconto;
	    
	    System.out.println("Nome: " + this.nome + "\nPreço: R$" + this.preco + "\nQuantidade: " + this.quantidade + "\nDesconto de: " + desconto);
	    System.out.println("\nTotal:");
	    
	    return totalFatura;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
