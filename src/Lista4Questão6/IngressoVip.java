package Lista4Questão6;

public class IngressoVip extends Ingresso{
	
	protected double valorAdicional;
	public double valorVIP;

	public IngressoVip(double valorIngresso, double valorAdicional) {
		super(valorIngresso);
		this.valorAdicional = valorAdicional;
		this.valorVIP = valorIngresso + valorAdicional;
	}
	
	public String toString(){
		
		
		return  "Valor adicional VIP: R$" + this.valorAdicional+"\nTotal VIP: R$"+ valorVIP;
		
	}

}
