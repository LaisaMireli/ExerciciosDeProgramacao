package Cadastro;

import javax.swing.*;


public class Janela extends JFrame {
	
	public Janela() {
		
		this.setSize(600,400);
		this.add(new Painel());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}
