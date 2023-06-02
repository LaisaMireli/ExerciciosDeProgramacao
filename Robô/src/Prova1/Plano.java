package Prova1;

import java.util.ArrayList;
import java.util.Scanner;

public class Plano {
	
	public ArrayList<Celula> listaCelulas;
	
	private int tamanhoX;
	private int tamanhoY;

		public void escolherTamanhoPlano() {
			
		 	Scanner scanner = new Scanner(System.in);
	
	        System.out.print("\nDigite o número de linhas: ");
	        this.tamanhoX = scanner.nextInt();
	
	        System.out.print("Digite o número de colunas: ");
	        this.tamanhoY = scanner.nextInt();
	        System.out.println("\n");
    
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
	

		public Plano() {
			
	        tamanhoX = 0;
	        tamanhoY = 0;
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
			
			for (int i = 0; i < listaCelulas.size(); i++) {
		        Celula celula = listaCelulas.get(i);
		        
		        if (celula.listaDeRobos.size() >= 2) {
		            System.out.print("[*] ");
		        } else if (celula.listaDeRobos.size() == 1) {
		            Robo robo = celula.listaDeRobos.get(0);
		            System.out.print("[" + robo.tipoRobo + "] ");
		        } else if (celula.listaDeEntidades.size() != 0) {
		            for (AlunoBug alunobug : celula.listaDeEntidades) {
		                System.out.print("[ ] ");
		            }
		        } else {
		            System.out.print("[ ] ");
		        }
		        
		        if ((i + 1) % tamanhoY == 0) {
		            System.out.println();
		        }
		    }
		}


		public int getTamanhoX() {
			return tamanhoX;
		}


		public void setTamanhoX(int tamanhoX) {
			this.tamanhoX = tamanhoX;
		}


		public int getTamanhoY() {
			return tamanhoY;
		}


		public void setTamanhoY(int tamanhoY) {
			this.tamanhoY = tamanhoY;
		}
		
		
}
		
		
