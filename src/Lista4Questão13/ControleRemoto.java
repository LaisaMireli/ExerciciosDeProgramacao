package Lista4Questão13;

public class ControleRemoto {
	
	private int volume;
	private int canal;
	private boolean tvLigada;
	
	public ControleRemoto (int volume, int canal, boolean tvLigada) {
		this.canal = 1;
		this.tvLigada = false;
		this.volume = 0;
		
	}
	public void ligarDesligar(){
		
		this.tvLigada = !this.tvLigada;
		 
		if(this.tvLigada) {
			System.out.println("Tv ligada\n");
		}
		else {
			System.out.println("Tv desligada\n");
		}
	}
	
	public void aumentar() {
		if(this.tvLigada && this.volume < 100) {
			this.volume++;
			System.out.println("Volume: "+ this.volume+"\n");
		}
		else {
			
	        System.out.println("A TV está desligada\n");
	    }
		
	}
	


	
	public void diminuir() {
		if(this.tvLigada && this.volume > 0) {
			this.volume--;
			System.out.println("Volume: "+ this.volume+"\n");
		}
		else {
			
	        System.out.println("A TV está desligada\n");
	    }
	}
	
	public void aumentarCanal() {
		if(this.tvLigada && this.canal <= 999) {
			this.canal++;
			System.out.println("Canal: "+ this.canal+"\n");
		}
		else {
			
	        System.out.println("A TV está desligada\n");
	    }
	}
	
	public void diminuirCanal() {
		if(this.tvLigada && this.canal > 1) {
			this.canal--;
			System.out.println("Canal: "+ this.canal+"\n");
		}
		else {
			
	        System.out.println("A TV está desligada\n");
	    }
	}
	
	public void trocarCanal (int novoCanal) {
		
		if(this.tvLigada && this.canal <= 999) {
			this.canal = novoCanal;
			System.out.println("Canal: "+ this.canal+"\n");
		}
		else {
			
	        System.out.println("A TV está desligada\n");
	    }
		
	}
	
	
	public void clicarMudar (int canal) {
		
		if(this.tvLigada && this.canal >= 1 && canal < 999) {
			this.canal = canal;
			System.out.println("Canal: "+ this.canal+"\n");
		}
		else {
			
	        System.out.println("A TV está desligada\n");
	    }
	}
	
	public void televisão(){
		
		 if (this.tvLigada) {
	            System.out.println("Volume: " + this.volume+"\n");
	            System.out.println("Canal: " + this.canal+"\n");
	        } else {
	            System.out.println("A TV está desligada\n");
	        }
		
	}
	
	public void mutar () {
		if(this.tvLigada) {
			this.volume = 0;
			System.out.println("A televisão está no modo mute\nVolume: " + this.volume+"\n");
		}
		else {
            System.out.println("A TV está desligada\n");
        }
	
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public boolean tvLigada() {
		return tvLigada;
	}

	public void setTvLigada (boolean tvLigada) {
		this.tvLigada = tvLigada;
	}

}
