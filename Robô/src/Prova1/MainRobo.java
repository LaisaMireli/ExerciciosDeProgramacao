package Prova1;

public class MainRobo {

	public static void main(String[] args) {	
		
			Plano p = new Plano(5, 5);
			
			//roboAndador andador = new roboAndador(1, "delta", 1, 1, p);
			roboAndador andador = new roboAndador(0, "Andador", 5, 1, p);
			Peao peao = new Peao (0, "Peao", 5, 2, p);
			Torre torre = new Torre (0, "Torre", 5, 3, p);
			Bispo bispo = new Bispo (0, "Bispo", 2, 2, p);
			Cavalo cavalo = new Cavalo (0, "Cavalo", 4, 4, p);
			
			p.exibirPlano();
			p.verificarSeTemRobo();
			p.exibirPlano();

			
			
		
		}
	

	}


