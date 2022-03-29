package factory;

import escudo.EscudoFraco;
import estado.*;
import habilidades.Raio;
import inimigo.Inimigo;
import personagem.Personagem;

public class FuturistaFactory implements JogoFactory {

	private static FuturistaFactory instancia = null;
	
	private FuturistaFactory() {
		super();
	}

	 public static synchronized FuturistaFactory getInstancia() {
		 if (instancia == null) {
			 instancia = new FuturistaFactory();			 
		 }
		 return instancia;
	 }
	 
	 public Personagem createPersonagem() {
		 Personagem player = new Personagem(250,250);
		 player.setEscudo(new EscudoFraco());
		 player.setA(new Raio(player.getA()));
		 
		 return player;
		 
	 }
	 public Inimigo createInimigo(int x, int y) {
		 
		 Inimigo i = new Inimigo(x, y);
		 i.setLife(70);
		 i.setE(new Normal(i));
		 i.setA(new Raio(i.getA()));
		 
		 return i;
	 }
}
