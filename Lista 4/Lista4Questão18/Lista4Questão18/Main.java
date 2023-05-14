package Lista4Questão18;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {

	     Plano plano = new Plano(); 
	     Robo robo = new Robo(plano);
	     
	     System.out.print(plano.Posicao());
	     robo.realizarMovimento();
	  
	}

}
