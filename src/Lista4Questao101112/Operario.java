package Lista4Questao101112;

public class Operario extends Empregado{
	
	private double comissao;
	private double valorProducao;
	

	public Operario(String nome, int cpf, int idade, int codigoSetor, double salarioBase, double imposto,
			double comissao, double valorProducao) {
		super(nome, cpf, idade, codigoSetor, salarioBase, imposto);
		
		this.comissao = comissao;
		this.valorProducao = valorProducao;
		
	}
	
	public double calcularSalario () {
		
		System.out.println("\nSalário com atributos:");
		return this.getSalarioBase()-(this.getSalarioBase()*
				(this.getImposto()/100)+(valorProducao*(comissao/100)));

	}
	
	public String toString() {
		
		return "\nNome: " + getNome() + "\nCpf: " + getCpf() + "\nIdade: " + getIdade() +"\nComissão: R$" + this.comissao + "\nValor de produção: R$" + this.valorProducao;
		
	}

}
