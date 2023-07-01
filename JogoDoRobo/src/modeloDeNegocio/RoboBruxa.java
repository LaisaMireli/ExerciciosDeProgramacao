package modeloDeNegocio;

import javax.swing.ImageIcon;

public class RoboBruxa extends Robo {

	public RoboBruxa(String nome) {
		super(nome);
	}
	public ImageIcon getIcon() {
        
        return new ImageIcon("bruxa.png");
    }
 }

