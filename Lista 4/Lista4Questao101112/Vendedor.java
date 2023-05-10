package Lista4Questao101112;

public class Vendedor extends Empregado{
	
	private double valorVendas;
	private double atributoComissao;

	public Vendedor(String nome, int cpf, int idade, int codigoSetor, double salarioBase, double imposto,
			double valorVendas, double atributoComissao) {
		super(nome, cpf, idade, codigoSetor, salarioBase, imposto);
		
		this.atributoComissao = atributoComissao;
		this.valorVendas = valorVendas;
		
	}
	
	public double calcularSalario() {
		
		System.out.println("\nSalário com atributos:");
		return this.getSalarioBase()-(this.getSalarioBase()
				*(this.getImposto()/100)+(valorVendas*(atributoComissao/100)));
	}
	
	public String toString () {
		
		return "\nNome: " + getNome() + "\nCpf: " + getCpf() + "\nIdade: " + getIdade() +"\nAtributo comissão: " + this.atributoComissao + "\nValor vendas: R$" + this.valorVendas;
		
	}
	

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getAtributoComissao() {
		return atributoComissao;
	}

	public void setAtributoComissao(double atributoComissao) {
		this.atributoComissao = atributoComissao;
	}

}
