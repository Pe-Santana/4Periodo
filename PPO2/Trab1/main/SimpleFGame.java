package main;

import factory.SimpleInimigoFactory;
import factory.SimplePersonagemFactory;
import inimigo.Inimigo;
import personagem.Personagem;

public class SimpleFGame extends Game {
	
	public Personagem createPersonagem() {
		
		return SimplePersonagemFactory.createPersonagem();
	}
	
	public Inimigo createInmigo(int tipo, int x, int y) {
		
		return SimpleInimigoFactory.createInimigo(tipo, x, y);
	}
}
