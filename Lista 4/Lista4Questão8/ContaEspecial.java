package Lista4Questão8;

public class ContaEspecial  extends ContaCorrente{

	private double limite;
	
	public ContaEspecial(String nome, int cpf, double valor, double limite) {
		super(nome, cpf, valor);
		this.limite = limite;
	}
	
	public String Saque (double saque) {
		if(saque <= this.valor) {
			valor -= saque;
			return "Saque: R$" + saque + "\nSaldo atual: R$" + this.valor  + "\n";
			
		}else if (saque <= (this.getValor() + this.limite)){
			limite = (valor + limite) - saque;
			valor -= saque;
			return "Saque: R$" + saque + "Saldo atual: R$" + this.valor  + "\n";
			
		}
		
		else {
			return "\n-- SALDO INSUFICIENTE --\n";
		}
	
	

	}
}
