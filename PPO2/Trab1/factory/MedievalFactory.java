package factory;

import escudo.EscudoFraco;
import estado.*;
import habilidades.Besta;
import inimigo.Inimigo;
import personagem.Personagem;

public class MedievalFactory implements JogoFactory {

	private static MedievalFactory instancia = null;

	private MedievalFactory() {
		super();
	}
	
	 public static synchronized MedievalFactory getInstancia() {
		 if (instancia == null) {
			 instancia = new MedievalFactory();			 
		 }
		 return instancia;
	 }
		
	 
	 public Personagem createPersonagem() {
		 Personagem player = new Personagem(250,250);
		 player.setEscudo(new EscudoFraco());
		 player.setA(new Besta(player.getA()));
		 
		 return player;
		 
	 }
	 public Inimigo createInimigo(int x, int y) {
		 
		 Inimigo i = new Inimigo(x, y);
		 i.setLife(70);
		 i.setE(new Normal(i));
		 i.setA(new Besta(i.getA()));
		 
		 return i;
	 }
}
