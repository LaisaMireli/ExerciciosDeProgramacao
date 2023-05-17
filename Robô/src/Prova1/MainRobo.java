package Prova1;

public class MainRobo {

	public static void main(String[] args) {	
		
			Plano p = new Plano(5, 5);
			
			//roboAndador andador = new roboAndador(1, "delta", 1, 1, p);
			roboAndador a = new roboAndador(0, "Andador", 2, 3, p);
			Peao peao = new Peao (0, "Peao", 2, 2, p);
			
			p.exibirPlano();
			p.verificarSeTemRobo();
			a.subirAndador(1);
			p.exibirPlano();
			p.verificarSeTemRobo();
			peao.direitaPeao(4);
			p.exibirPlano();
			p.verificarSeTemRobo();
			
			
		
		}
	

	}


