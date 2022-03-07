module Lâmpada {
	
	[java collapse=”true”]

			public class Lampada {
			private boolean ligada = false;

			public boolean isLigada() {
			return ligada;
			}

			public void setLigada(boolean ligada) {
			this.ligada = ligada;
			}

			public void imprimir(){
			if ( this.ligada ){
			System.out.println("Lâmpadada");
			} else {
			System.out.println("Lâmpadaigada");
			}
			}

			}

			Classe aplicativo

			[java collapse=”true”]

			public class Aplicativo {

			/**
			* @param args
			*/
			public static void main(String[] args) {
			
			Lampada l1 = new Lampada();

			l1.imprimir();
			l1.setLigada( true );
			l1.imprimir();

			}

			}
	
}