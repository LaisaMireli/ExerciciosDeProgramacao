package Prova1;

public abstract class Robo {
	
	public int id;
	public String nome;
	public int posicaox;
	public int posicaoy;
	public Plano plano;
	public char tipoRobo;
	private int alunosSalvos;
	private int bugsEncontrados;
	private int pontuacao;
	
	public Robo(int id, String nome, int posicaoy, int posicaox, Plano plano) {
			
			this.id = id;
			this.nome = nome;
			this.posicaox = posicaox;
			this.posicaoy = posicaoy;
			this.plano = plano;
				
	
			Celula aux = null;
			for (int i = 0; i < plano.listaCelulas.size(); i++) {
				aux = plano.listaCelulas.get(i);
				if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
					aux.listaDeRobos.add(this);
				}
			}
		}
	
	public void verificarSeTemEntidade() {
		

	}
	
	public Celula retornaCelulaAtual() {
		
		for(Celula celula : plano.listaCelulas) {
			if(celula.posicaoX == this.posicaox && celula.posicaoY == this.posicaoy) {
				return celula;
			}
		}
		return null;
		
	}

	public char getTipoRobo() {
		return tipoRobo;
	}

	public void setTipoRobo(char tipoRobo) {
		this.tipoRobo = tipoRobo;
	}

	}
