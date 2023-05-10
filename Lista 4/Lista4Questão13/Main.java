package Lista4Questão13;

public class Main {

	public static void main(String[] args) {
		
		
		ControleRemoto remoto = new ControleRemoto(20, 2, false);
		
		remoto.ligarDesligar();
		remoto.aumentar();
		remoto.diminuir();
		remoto.aumentarCanal();
		remoto.diminuirCanal();
		remoto.trocarCanal(6);
		remoto.clicarMudar(10);
		remoto.televisão();
		remoto.mutar();
		
	}

}
