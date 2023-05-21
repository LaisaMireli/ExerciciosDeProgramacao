package Lista4Questão3;

public class Main {

	public static void main(String[] args) {
		
		Fatura fatura = new Fatura (444, "Mouse", 2, 150);
		Fatura fatura1 = new Fatura (555, "Teclado", 3, 200);
		
		fatura.getTotalFatura();
		fatura1.getTotalFatura();
		
		
		System.out.println("\nNumero: " + fatura.getNumero() + "\nDescrição: " + fatura.getDescricao() 
		+ "\nQuantidade: " + fatura.getQuantidade() + "\nValor: R$" + fatura.getPrecoUn());
		System.out.println("\nTotal fatura: R$" + fatura.getTotalFatura());
	
		System.out.println("\nCom desconto cada produto sai por: R$" + fatura.darDesconto(10));
	

		System.out.println("\nNumero: " + fatura1.getNumero() + "\nDescrição: " + fatura1.getDescricao() 
		+ "\nQuantidade: " + fatura1.getQuantidade() + "\nValor: R$" + fatura1.getPrecoUn());
		System.out.println("\nTotal fatura: R$" + fatura1.getTotalFatura());
		System.out.println("\nCom desconto cada produto sai por: R$" + fatura1.darDesconto(15));
		
		
		
	}

}
