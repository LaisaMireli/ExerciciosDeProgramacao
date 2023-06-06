package Cadastro;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cadastro extends JPanel {
	
	
	JPanel CadastroPainel;

    public Cadastro() {

    	this.add(cadastrar());
    }

	public JPanel cadastrar() {
    	
    	CadastroPainel = new JPanel();    	
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

        CadastroPainel.setVisible(false);
        
		return CadastroPainel;
        
    }
}

