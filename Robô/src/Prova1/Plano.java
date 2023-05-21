package Prova1;

import java.util.ArrayList;

public class Plano {
	
	public ArrayList<Celula> listaCelulas;

		public Plano(int tamanhoX, int tamanhoY) {
			
			listaCelulas = new ArrayList<Celula>();
	
				int contador = 1;
				for (int i = 1; i <= tamanhoX; i++) {
					for (int j = 1; j <= tamanhoY; j++) {
						Celula celula = new Celula(contador, i, j);
						listaCelulas.add(celula);
						contador++;
					}
				}
		}
	
		public void verificarSeTemRobo() {
			for (int i = 0; i < listaCelulas.size(); i++) {
				Celula aux = listaCelulas.get(i);
				if (listaCelulas.get(i).robo != null) {
					System.out.println("tem robo! " + aux.robo.nome + "  - y: " + aux.posicaoY + "  - x: " + aux.posicaoX );
				}
				else{
					System.out.println("nao tem robo");
				}
			}
		}
	
	
		public Celula retornarCelula(int x, int y) {
	
			for (int i = 0; i < listaCelulas.size(); i++) {
				if (listaCelulas.get(i).posicaoX == x && listaCelulas.get(i).posicaoY == y) {
					return listaCelulas.get(i);
				}
			}
			return null;
		}
	
		public void retornarCelulas() {
			for (int i = 0; i < listaCelulas.size(); i++) {
				System.out.println(listaCelulas.get(i).imprimir());
			}
		}
		
		public void exibirPlano() {
			
			for (int y = 1; y <= this.listaCelulas.get(this.listaCelulas.size() - 1).posicaoY; y++) {
		        for (int x = 1; x <= this.listaCelulas.get(this.listaCelulas.size() - 1).posicaoX; x++) {
		            Celula celula = retornarCelula(x, y);
		            
		            if (celula.robo != null) {
		            	 System.out.print("[" + celula.robo.getTipoRobo() + "] ");
		            } else {
		                System.out.print("[ ] "); 
		            }
		        }
		        System.out.println(); 
		    }

		}
}