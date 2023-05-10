package Lista4Questão8;

public class ContaCorrente {
	
	private String nome;
	private int cpf;
	protected double valor;
	
	public ContaCorrente (String nome, int cpf, double valor) {
		
		this.cpf = cpf;
		this.valor = valor;
		this.nome = nome;
		
	}
	
	public String Saque (double saque) {
		if(saque <= this.valor) {
		valor -= saque;
			return "Saque: R$" + saque + "\nSaldo atual: R$" + this.valor + "\n";
		}else {
			return "\n-- SALDO INSUFICIENTE --\n";
		}
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
