package Lista4Questao2;

public class Empregado {
	
	 private String nome;
	 private String sobrenome;
	 private double salarioM;
	 
	 public Empregado (String nome, String sobrenome, double salarioM) {
		 
		 this.nome = nome;
		 this.sobrenome = sobrenome;
		 this.salarioM = salarioM;
				 
	 }
	 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioM() {
		
		return salarioM;
	}

	public void setSalarioM(double salarioM) {
		if (salarioM == 0) {
			this.salarioM = 0;
			
		}
		else {
			this.salarioM = salarioM;
		}
	}
	
	public double salarioAual() {
		
		double salarioAnual = this.salarioM*12;
		
		return salarioAnual;
		
	}
	
	public double darAumento(double percentAumento ) {
		
		salarioM += salarioM * (percentAumento/100);
		
		return salarioM;
		
	}
	
	 
	 

}
