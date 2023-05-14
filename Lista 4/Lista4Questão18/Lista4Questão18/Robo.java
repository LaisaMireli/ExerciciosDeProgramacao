package Lista4Questão18;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Robo extends Plano {
	
	 private int robX;
	 private int robY;
	 private Plano plano;
	 
	 public Robo(Plano plano) {
		 
		 this.plano = plano;
		 robX = plano.getPosicao().length / 2;
	     robY = plano.getPosicao().length / 2;
	 }
	 
	 public void andarNorte() {
	        if (robX > 0) {
	            getPosicao()[robX][robY] = '@'; 
	            robX--;
	        }
	    }
	    
	    public void andarSul() {
	        if (robX < getPosicao().length - 1) {
	            getPosicao()[robX][robY] = '@'; 
	            robX++;
	        }
	    }
	    
	    public void andarLeste() {
	        if (robY < getPosicao().length - 1) {
	            getPosicao()[robX][robY] = '@'; 
	            robY++;
	        }
	    }
	    
	    public void andarOeste() {
	        if (robY > 0) {
	            getPosicao()[robX][robY] = '@';
	            robY--;
	        }
	    }
	    
	    public void andarNordeste() {
	        if (robX > 0 && robY < getPosicao().length - 1) {
	            getPosicao()[robX][robY] = '@';
	            robX--;
	            robY++;
	        }
	    }
	    
	    public void andarSudeste() {
	        if (robX < getPosicao().length - 1 && robY < getPosicao().length - 1) {
	            getPosicao()[robX][robY] = '@'; 
	            robX++;
	            robY++;
	        }
	    }
	    
	    public void andarSudoeste() {
	        if (robX < getPosicao().length - 1 && robY > 0) {
	            getPosicao()[robX][robY] = '@'; 
	            robX++;
	            robY--;
	        }
	    }
	    
	    public void andarNoroeste() {
	        if (robX > 0 && robY > 0) {
	            getPosicao()[robX][robY] = '@'; 
	            robX--;
	            robY--;
	        }
	    }
	    
	    public void realizarMovimento() {
	    	
	        Scanner scanner = new Scanner(System.in);
	        String movimento;
	        boolean movimentoValido;
	        boolean encontrouMoeda = false;

	        do {
	            System.out.println("Escolha o movimento (norte, sul, leste, oeste, nordeste, sudeste, sudoeste, noroeste):");
	            movimento = scanner.nextLine().toLowerCase();
	            movimentoValido = true;

	            if (movimento.equals("norte")) {
	                andarNorte();
	                robX--;
	            } else if (movimento.equals("sul")) {
	                andarSul();
	                robX++;
	            } else if (movimento.equals("leste")) {
	                andarLeste();
	                robY++;
	            } else if (movimento.equals("oeste")) {
	                andarOeste();
	                robY--;
	            } else if (movimento.equals("nordeste")) {
	                andarNordeste();
	                robX--;
	                robY++;
	            } else if (movimento.equals("sudeste")) {
	                andarSudeste();
	                robX++;
	                robY++;
	            } else if (movimento.equals("sudoeste")) {
	                andarSudoeste();
	                robX++;
	                robY--;
	            } else if (movimento.equals("noroeste")) {
	                andarNoroeste();
	                robX--;
	                robY--;
	            } else {
	                System.out.println("Movimento inválido!");
	                movimentoValido = false;
	            }

	            Posicao();

	        
	            if (getPosicao()[robX][robY] == '$') {
	                System.out.println("Você encontrou a moeda!");
	                encontrouMoeda = true;
	            }
	        } while (!movimentoValido && !encontrouMoeda);
	    }
}