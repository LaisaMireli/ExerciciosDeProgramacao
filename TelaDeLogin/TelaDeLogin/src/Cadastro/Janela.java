package Cadastro;

import java.awt.BorderLayout;

import javax.swing.*;


public class Janela extends JFrame {
	
	public Janela() {
		
		this.setTitle("Cadastro de Alunos");
		this.setSize(400,350);

		this.setLayout(new BorderLayout());
		
		Cadastro cadastro = new Cadastro();
		this.add(new Painel(cadastro), BorderLayout.NORTH);
		this.add(cadastro);
	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}
