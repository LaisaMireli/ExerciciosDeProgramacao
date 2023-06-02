package Prova1;

import java.util.ArrayList;

public class Celula {
	
	public int posicaoX;
	public int posicaoY;
	public int id;
	public ArrayList<Robo> listaDeRobos;
	public ArrayList<AlunoBug> listaDeEntidades;
	
	
	public Celula(int id, int y , int x) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		listaDeRobos = new ArrayList<>();
		listaDeEntidades = new ArrayList<>();
	}
	
	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
	

}
