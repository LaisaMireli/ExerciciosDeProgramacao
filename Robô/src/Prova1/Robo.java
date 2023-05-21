package Prova1;

public abstract class Robo {
	
	public int id;
	public String nome;
	public int posicaox;
	public int posicaoy;
	public Plano plano;
	public char tipoRobo;
	
	public Robo(int id, String nome, int posicaoy, int posicaox, Plano plano) {
			
			this.id = id;
			this.nome = nome;
			this.posicaox = posicaox;
			this.posicaoy = posicaoy;
			this.plano = plano;
			Celula celula = plano.retornarCelula(posicaox, posicaoy);
			    if (celula != null) {
			        celula.robo = this;
			    }
			
	
			Celula aux = null;
			for (int i = 0; i < plano.listaCelulas.size(); i++) {
				aux = plano.listaCelulas.get(i);
				if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
					aux.robo = this;
				}
			}
		}
	

	public char getTipoRobo() {
		return tipoRobo;
	}

	public void setTipoRobo(char tipoRobo) {
		this.tipoRobo = tipoRobo;
	}

	
	}
