package principal;

import javax.swing.JOptionPane;

public class JogoDaForca {


	public static void main(String[] args) {
		int esco = 0;
		while (esco != 2)
		{
			esco = Integer.parseInt(JOptionPane.showInputDialog(
					"----Jogo da Forca---\n\n"
				   +"1 - Jogar\n"
				   +"2 - Sair"));
			switch (esco)
			{
			    case 2:
			    	JOptionPane.showMessageDialog(null, "Finalizando");
                break;
			    case 1:
			    	Jogo();
			}
		}
	}
	
	public static void Jogo()
	{
		char VTPalavra [] = new char [50];
		char VTResposta [] = new char [50];
		char VTErro [] = new char [50];
		String palavra, RespostaString,VTRespostaS, Dica = null;
		char RespostaChar;
		int cont, AUX, Pontos = 0;
		
		palavra = JOptionPane.showInputDialog("Digite a palavra para a forca: ");
		for (int cont2=0; cont2< palavra.length(); cont2++)
			{
			   VTPalavra[cont2+1] = palavra.charAt(cont2);
			}
		Dica = JOptionPane.showInputDialog("Escreva a dica da palavra: ");
		for (cont = 1; cont <= palavra.length(); cont++)
		{
				VTRespostaS = "_";
				VTResposta[cont] = VTRespostaS.charAt(0);
		}
		Pontos = 0;
		while (Pontos <  palavra.length())
		{
			JOptionPane.showMessageDialog(null, "Situação da palavra: " );
			for (cont = 1; cont <= palavra.length(); cont++)
			{
				JOptionPane.showMessageDialog(null, +cont +"ª letra " +VTResposta[cont]);
			}
		
			RespostaString = JOptionPane.showInputDialog( 
				"---------------------------------------\n"
			  + "|            Jogo da forca            |\n"
			  + "|"                +"                             Dica: "+Dica    +"    |\n"
			  + "|                                                  |\n"
			  + "|                                                  |\n"
              + "|"                +"               Digite uma letra: "          +"   |\n"                  
              + "|                                                  |\n"
              + "|                                                  |\n"
              + "---------------------------------------");
		
			RespostaChar = RespostaString.charAt(0);
			for (AUX = 1; AUX <=  palavra.length(); AUX++)
			{
				if(RespostaChar== VTResposta[AUX] || RespostaChar == VTErro[AUX])
				{
					JOptionPane.showMessageDialog(null, "Letra já usada!");
				}
				else if(RespostaChar== VTPalavra[AUX])
				{
					Pontos = Pontos +1;
					VTResposta[AUX] = RespostaChar;
					VTPalavra[AUX] = 0;
					JOptionPane.showMessageDialog(null, "Acertou!");
				}
				else
				{
					VTErro[AUX] = RespostaChar;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Situação da palavra: " );
		for (cont = 1; cont <= palavra.length(); cont++)
		{
			JOptionPane.showMessageDialog(null, +cont +"ª letra " +VTResposta[cont]);
		}
		JOptionPane.showMessageDialog(null, "Fim de jogo! ... A palavra é: " +palavra); 
	}
}
