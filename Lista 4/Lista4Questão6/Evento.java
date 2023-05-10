package Lista4Questão6;

public class Evento {
	
	private Ingresso listaIngresso;
	
    
    public Evento (Ingresso lista) {
    	this.listaIngresso = lista;
    }

    public String vendaDeIngressos(int quantidade) {
    	
    	IngressoVip ingressoVip = new IngressoVip(this.listaIngresso.getValorIngresso(), this.listaIngresso.getValorAdicional());
    	int resto = this.listaIngresso.getQuantidadeTotal() - quantidade;
    	double totalIngressos = quantidade * (ingressoVip.getValorIngresso() + this.listaIngresso.getValorIngresso());
    	
    	if(this.listaIngresso.quantidadeTotal > quantidade) {
    		return "\n-- COMPRA REALIZADA!! --\nPreço do total dos ingressos = R$" + totalIngressos + "\nRestante de ingressos = " + resto;
    		
    	}
    	else if (this.listaIngresso.quantidadeTotal == quantidade) {
    		return "\n-- COMPRA REALIZADA!! --\nPreço total dos ingressos = R$" + totalIngressos + "\n-- INGRESSOS ESGOTADOS!! --\n";
    	}
    	
    	else if(this.listaIngresso.quantidadeTotal < quantidade) {
    		return "-- COMPRA NEGADA!! --\n-- INGRESSOS ESGOTADOS!! --\n";
    	}
		
    
    	return "Ingressos restantes: " + resto;
    	
    }

     
}
