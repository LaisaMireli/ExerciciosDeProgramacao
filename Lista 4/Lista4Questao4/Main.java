package Lista4Questao4;

public class Main {

	public static void main(String[] args) {

		Produto produto = new Produto ("Geladeira", 2500, 2);
		Produto produto1 = new Produto ("Fogão", 300, 1);
		
		System.out.println(produto.comprarProduto());
		System.out.println(produto1.comprarProduto());
		
		
		
	}

}
