package Prova1;

import java.util.Random;

public class AlunoBug {
	
	public int id;
	public String nome;
	public int posicaoALunoBugx;
	public int posicaoAlunoBugy;
	public Plano plano;
	public char tipoEntidade;
	
	public AlunoBug (Plano plano) {
		this.plano = plano;
		sortearAlunosBugs();
	}

	public void atribuirEntidadeACelula() {
		
		for (Celula celula : plano.listaCelulas) {
			if(celula.posicaoX==this.posicaoALunoBugx && celula.posicaoY==this.posicaoAlunoBugy) { 
				celula.listaDeEntidades.add(this);
			}else {
				celula.listaDeEntidades.remove(this);
			}
			
		}
	}
	
	public void sortearAlunosBugs() {
		
		Random sortear = new Random();
		boolean posicao = false;
		
		while (!posicao) {
			
			posicaoALunoBugx = sortear.nextInt(plano.getTamanhoX());
			posicaoAlunoBugy = sortear.nextInt(plano.getTamanhoY());
			
		Celula celula = plano.retornarCelula(posicaoALunoBugx, posicaoAlunoBugy);
		
		if (posicaoALunoBugx == 0 || posicaoAlunoBugy == 0 
				|| !celula.listaDeRobos.isEmpty() || !celula.listaDeEntidades.isEmpty()) {
			
			posicao = false;
		}
		
		else {
			celula.listaDeEntidades.add(this);
			
			posicao = true;
		}
		
		}
	}
	
	
	
	
}
