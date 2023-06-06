package Cadastro;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Painel extends JPanel {
	
	private JButton Cadastrar;
	private JButton Listar;
	private JButton Atualizar;
	private JButton Deletar;
	Cadastro cadastro;

	private JButton criarBotao(String nome) {
		
		return new JButton(nome);
	}

	public Painel (Cadastro cadastro) {
		
		super(new GridLayout(0, 2));
		
		this.cadastro = cadastro;
		
		this.setLayout(new FlowLayout());
		
		this.Cadastrar = this.criarBotao("Cadastrar");
		this.add(this.Cadastrar);
		this.Cadastrar.addActionListener(new eventoCadastrar());
		
		this.Listar = this.criarBotao("Listar");
		this.add(this.Listar);
		this.Listar.addActionListener(new eventoListar());
		
		
		this.Atualizar = this.criarBotao("Atualizar");
		this.add(this.Atualizar);
		this.Atualizar.addActionListener(new eventoAtualizar());

		this.Deletar = this.criarBotao("Deletar");
		this.add(this.Deletar);
		this.Deletar.addActionListener(new eventoDeletar());
		
	}
	
	public class eventoCadastrar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(cadastro.CadastroPainel.isVisible()) {
			cadastro.CadastroPainel.setVisible(false);
			}
			else {
				cadastro.CadastroPainel.setVisible(true);
				cadastro.AtualizarPainel.setVisible(false);
				cadastro.ListarPainel.setVisible(false);
				cadastro.DeletarPainel.setVisible(false);
			}
			
		}
		
	}
	
	public class eventoListar implements ActionListener{
		
		public void actionPerformed (ActionEvent e) {
			
			if(cadastro.ListarPainel.isVisible()) {
				cadastro.ListarPainel.setVisible(false);
			}
			else {
				
				cadastro.CadastroPainel.setVisible(false);
				cadastro.AtualizarPainel.setVisible(false);
				cadastro.ListarPainel.setVisible(true);
				cadastro.DeletarPainel.setVisible(false);
				
			}	
		}
		
	}
	
	public class eventoAtualizar implements ActionListener{
		
		public void actionPerformed (ActionEvent e) {
			
		if(cadastro.AtualizarPainel.isVisible()) {
				cadastro.AtualizarPainel.setVisible(false);
			}
			else {
				
				cadastro.CadastroPainel.setVisible(false);
				cadastro.AtualizarPainel.setVisible(true);
				cadastro.ListarPainel.setVisible(false);
				cadastro.DeletarPainel.setVisible(false);
				
			}		
		}
		
	}
	
	public class eventoDeletar implements ActionListener{
		
		public void actionPerformed (ActionEvent e) {
			
		if(cadastro.DeletarPainel.isVisible()) {
				cadastro.DeletarPainel.setVisible(false);
			}
			else {
				
				cadastro.CadastroPainel.setVisible(false);
				cadastro.AtualizarPainel.setVisible(false);
				cadastro.ListarPainel.setVisible(false);
				cadastro.DeletarPainel.setVisible(true);
				
			}		
		}
		
	}

}
