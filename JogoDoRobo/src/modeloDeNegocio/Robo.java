package modeloDeNegocio;

public class Robo {
	
	public String nome;
	protected int posicaoRobox;
	protected int posicaoRoboy;
	

	public Robo(String nome) {		
		this.nome = nome;
	}

	public int getPosicaoRobox() {
		return posicaoRobox;
	}

	public void setPosicaoRobox(int posicaoRobox) {
		this.posicaoRobox = posicaoRobox;
	}

	public int getPosicaoRoboy() {
		return posicaoRoboy;
	}

	public void setPosicaoRoboy(int posicaoRoboy) {
		this.posicaoRoboy = posicaoRoboy;
	}

	public void retornaCelula() {
		
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
}
