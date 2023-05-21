package Lista4Questão16;

public class Elevador {
	
	private int andarAtual;
	private int totalAndares;
	private int quantidadePessoas;
	private int capacidade;
	
	public Elevador(int totalAndares, int capacidade) {
		
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
	}
	
	public void inicializa () {
		
		if (andarAtual== 0 && quantidadePessoas == 0) {
			System.out.println("Andar: " + this.andarAtual + 
				"\nQuantidade de pessoas: " + this.quantidadePessoas);
			
		}
		
	}
	public void entra() {
        if (quantidadePessoas < capacidade) {
            quantidadePessoas++;
            
            System.out.println("Andar: " + this.andarAtual + 
    				"\nQuantidade de pessoas: " + this.quantidadePessoas);
        } else {
            System.out.println("O elevador está cheio");
        }
    }

    public void sai() {
        if (quantidadePessoas > 0) {
            quantidadePessoas--;
            System.out.println("Andar: " + this.andarAtual + 
    				"\nQuantidade de pessoas: " + this.quantidadePessoas);
        } else {
            System.out.println("O elevador está vazio");
        }
    }

    public void sobe() {
        if (andarAtual>= 0 && andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Andar: " + this.andarAtual + 
    				"\nQuantidade de pessoas: " + this.quantidadePessoas);
        } else {
            System.out.println("O elevador já está no último andar");
        }
    }

    public void desce() {
        if (andarAtual <= totalAndares && andarAtual> 0) {
            andarAtual--;
            System.out.println("Andar: " + this.andarAtual + 
    				"\nQuantidade de pessoas: " + this.quantidadePessoas);
        } else {
            System.out.println("O elevador já está no térreo");
        }
    }
	
	
	
	
	
	

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
