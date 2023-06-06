package Cadastro;

import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

public class Cadastro extends JPanel {
	
	
	JPanel CadastroPainel;
	JPanel ListarPainel;
	JPanel AtualizarPainel;
	JPanel DeletarPainel;
	JTable tabela;
	JScrollPane barraRolagem;

    public Cadastro() {
    	
    	this.add(cadastrarUsuário());
    	this.add(listarUsuário());
    	this.add(AtualizarUsuario());
    	this.add(DeletarUsuario());
    }

	public JPanel cadastrarUsuário() {
    	
    	CadastroPainel = new JPanel();    
    	CadastroPainel.setPreferredSize(new Dimension(300,200));
        CadastroPainel.setLayout(new GridLayout(10, 2));

        JLabel label = new JLabel("Nome:");
        CadastroPainel.add(label);

        JTextField textField = new JTextField(30);
        CadastroPainel.add(textField);

        JLabel label2 = new JLabel("CPF:");
        CadastroPainel.add(label2);

        JTextField textField2 = new JTextField(11);
        CadastroPainel.add(textField2);

        JLabel label3 = new JLabel("Matrícula:");
        CadastroPainel.add(label3);

        JTextField textField3 = new JTextField(30);
        CadastroPainel.add(textField3);

        JLabel label4 = new JLabel("Vertente:");
        CadastroPainel.add(label4);

        JTextField textField4 = new JTextField(30);
        CadastroPainel.add(textField4);
        
        JButton button = new JButton("Cadastrar");
        CadastroPainel.add(button);
        
        
        button.setPreferredSize(new Dimension(2, 5));
        

        CadastroPainel.setVisible(false);
        
		return CadastroPainel;
        
    }
	
	public JPanel listarUsuário () {
		
		ListarPainel = new JPanel ();
		ListarPainel.setPreferredSize(new Dimension(300,200));
        ListarPainel.setLayout(new GridLayout(10, 2));
        
        Object [][]dados = {
        		{"Laisa", "4437483","9349849", "Engenharia Computacao"}	     		
        };
        
        String [] colunas = {"Nome", "CPF", "Matricula", "Vertente"}	;
        
        tabela = new JTable(dados, colunas);
        ListarPainel.add(tabela);
        barraRolagem = new JScrollPane(tabela);
        ListarPainel.add(barraRolagem);
    

        ListarPainel.setVisible(false);
        
		return ListarPainel;
		
	}
	
	public JPanel AtualizarUsuario () {
		
		AtualizarPainel = new JPanel();
		AtualizarPainel.setPreferredSize(new Dimension(300,200));
		AtualizarPainel.setLayout((new GridLayout(10,2)));
		
		
		JLabel label = new JLabel("Matrícula:");
        AtualizarPainel.add(label);

        JTextField textField = new JTextField(30);
        AtualizarPainel.add(textField);

        JLabel label2 = new JLabel("Vartente:");
        AtualizarPainel.add(label2);

        JTextField textField2 = new JTextField(11);
        AtualizarPainel.add(textField2);

        
        JButton button = new JButton("Atualizar");
        AtualizarPainel.add(button);
       
        button.setPreferredSize(new Dimension(2, 5));
        
        AtualizarPainel.setVisible(false);
    	
		return AtualizarPainel;

	}
	
	public JPanel DeletarUsuario() {
		
		DeletarPainel = new JPanel();    
    	DeletarPainel.setPreferredSize(new Dimension(300,200));
        DeletarPainel.setLayout(new GridLayout(10, 2));

        JLabel label = new JLabel("Matrícula:");
        DeletarPainel.add(label);

        JTextField textField = new JTextField(30);
        DeletarPainel.add(textField);
	
        JButton button = new JButton("Deletar");
        DeletarPainel.add(button);
       
        button.setPreferredSize(new Dimension(2, 5));
        
        DeletarPainel.setVisible(false);
    	
		return DeletarPainel;

	}
	
	
}

