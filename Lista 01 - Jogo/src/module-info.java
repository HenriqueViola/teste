public class Jogo {


	public static void main(String[] args) {

		String nome ;
		int chutes = 1 ;
		int tentativas = 1;
		int randon = (int)(1+Math.random()*100);
		int botao;
		boolean continuar = true;
		nome = JOptionPane.showInputDialog(null,"Ol�,qual o seu nome?");

		while (continuar){
		tentativas = Integer.parseInt(JOptionPane.showInputDialog(null,"Vamos come�ar,qual o n�mero?"));

		  
		for(int i = 0; i < 10; i++)
		
			while(tentativas != randon && chutes < 10) 

		{
				if  (tentativas < randon)
				JOptionPane.showMessageDialog(null,"Tente um numero maior " +nome+".");
				else 
				JOptionPane.showMessageDialog(null,"Tente um numero menor " +nome+".");
				tentativas++;
				chutes++;
				tentativas = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o n�mero? "));
		}
		if (tentativas == randon){
			JOptionPane.showMessageDialog(null,"Parab�ns "+nome+" voc� acertou na " +chutes+ " tentativa(s)");	
			botao = JOptionPane.showConfirmDialog(null,"Gostaria de jogar novamente?","Jogo da Adivinha��o",JOptionPane.YES_NO_OPTION);
			if (botao == JOptionPane.YES_OPTION)
				continuar = true;  
			else 
				continuar = false; 
		}	
	else 
		botao = JOptionPane.showConfirmDialog(null,"Acabaram suas chances!Quer Jogar de novo?","Jogo da Adivinha��o",JOptionPane.YES_NO_OPTION);
		if (botao == JOptionPane.YES_OPTION)
			continuar = true; 
		else 
			continuar = true;  
        }
        System.exit(0);
	}

}module Jogo {
}