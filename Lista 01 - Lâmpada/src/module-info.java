module L�mpada {
	
	[java collapse=�true�]

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
			System.out.println("L�mpadada");
			} else {
			System.out.println("L�mpadaigada");
			}
			}

			}

			Classe aplicativo

			[java collapse=�true�]

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