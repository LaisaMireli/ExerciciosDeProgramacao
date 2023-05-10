package Lista4Questão14;

public class Pessoa {
	
	private int idade;
	private int diaN;
	private int mesN;
	private int anoN;
	private String nome;
	
	public Pessoa(String nome, int diaN, int mesN, int anoN) {
		this.anoN = anoN;
		this.diaN = diaN;
		this.mesN = mesN;
		this.nome = nome;
		
	}
	
	public int calcularIdade(int diaA, int mesA, int anoA) {
		
		int idade= anoA - anoN;
		if (mesA < mesN || (mesA == mesN && diaA < diaN)) {
            idade--;
        }
		System.out.println("\nSua idade é:\n");
		return idade;
	}
	
	
}
