package modeloDeNegocio;
import java.util.ArrayList;
import java.util.Random;

public class Entidades {
	
	public int id;
	public int posicaoALunoBugX;
	public int posicaoAlunoBugY;
	private Celula celula;
	public ArrayList<Entidades> listaDeEntidades;
	
	public Entidades (Celula celula) {		
		this.celula = celula;		
		
	}
	
	public int getPosicaoALunoBugX() {
		return posicaoALunoBugX;
	}

	public void setPosicaoALunoBugX(int posicaoALunoBugX) {
		this.posicaoALunoBugX = posicaoALunoBugX;
	}

	public int getPosicaoAlunoBugY() {
		return posicaoAlunoBugY;
	}

	public void setPosicaoAlunoBugY(int posicaoAlunoBugY) {
		this.posicaoAlunoBugY = posicaoAlunoBugY;
	}

}
