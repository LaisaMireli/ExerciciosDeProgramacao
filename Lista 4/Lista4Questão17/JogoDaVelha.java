package Lista4Questão17;

import java.util.Scanner;

public class JogoDaVelha {
	
	private String[][] grade; 
	private String jogador1;
	private String jogador2;
	private String vazio;
	private String[][] posicao = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	

	public String Posicao() {
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (j > 0) {
	                System.out.print("| ");
	            }
	            System.out.print(posicao[i][j] + " ");
	        }
	        System.out.println();
	        if (i < 2) {
	            System.out.println("---------");
	        }
	    }
	    return null;
	}

	/*public void exibirGrade() {
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (j > 0) {
	                System.out.print("| ");
	            }
	            System.out.print(posicao[i][j] + " ");
	        }
	        System.out.println();
	        if (i < 2) {
	            System.out.println("---------");
	        }
	    }
	}*/
	
	public boolean preenchido (String escolherP) {
		
		for (int i = 0; i < 3; i++ ) {
			for(int j = 0; j < 3; j++) {
				
				if (posicao[i][j].equals(escolherP)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void jogar (String escolherP, String jogador) {
		
		if (escolherP.equals("1")) {
			
			posicao [0][0] = jogador;
		}
		else if (escolherP.equals("2")) {
			
			posicao [0][1] = jogador;
		}
		else if (escolherP.equals("3")) {
			
			posicao [0][2] = jogador;
		}
		else if (escolherP.equals("4")) {
	
			posicao [1][0] = jogador;
		}
		else if (escolherP.equals("5")) {
	
			posicao [1][1] = jogador;
		}
		else if (escolherP.equals("6")) {
	
			posicao [1][2] = jogador;
		}
		else if (escolherP.equals("7")) {
	
			posicao [2][0] = jogador;
		}
		else if (escolherP.equals("8")) {
	
			posicao [2][1] = jogador;
		}
		else if (escolherP.equals("9")) {
	
			posicao [2][2] = jogador;
		}

	}
	
	public String ganhador (int jogadas) {
		
		String ganhador = "null";
		String [] T = new String [8];
		
		if(jogadas ==9) {
			ganhador = "\n--Deu Velha--";
		}
		
		T [0] = posicao[0][0] + posicao[0][1] + posicao [0][2];
		T [1] = posicao[1][0] + posicao[1][1] + posicao [1][2];
		T [2] = posicao[2][0] + posicao[2][1] + posicao [2][2];
		
		T [3] = posicao[0][0] + posicao[1][0] + posicao [2][0];
		T [4] = posicao[0][1] + posicao[1][1] + posicao [2][1];
		T [5] = posicao[0][2] + posicao[1][2] + posicao [2][2];
		
		T [6] = posicao[0][0] + posicao[1][1] + posicao [2][2];
		T [7] = posicao[0][2] + posicao[1][1] + posicao [2][0];
		
		for(int i = 0; i < T.length; i++){
			if(T[i].equals("XXX")) {
				ganhador = "\n--Jogador 1--  --Venceu--\n";
			}
			
			else if (T[i].equals("OOO")){
				ganhador = "\n--Jogador 2-- --Venceu--\n";
			}
			
		}
		
		return ganhador;
		
	}
	
	public void jogarNovamente() {
		
		Scanner scanner = new Scanner(System.in);
		String jogarDeNovo;
		
		System.out.println("Você deseja jogar novamente?\n Sim/Não");
		jogarDeNovo = scanner.next();
		
		if(jogarDeNovo.equals("Sim") || jogarDeNovo.equals("S") ||
			jogarDeNovo.equals("sim") || jogarDeNovo.equals("s") || jogarDeNovo.equals("SIM")) {
			
			 
			
		}
		
	}
	
	
}