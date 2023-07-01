package modeloDeNegocio;

import javax.swing.ImageIcon;

public class RoboSereia extends Robo {

	public RoboSereia(String nome) {
		super(nome);
	}
	public ImageIcon getIcon() {
        
        return new ImageIcon("sereia.png");
    }
}
