package factory;

import inimigo.Inimigo;
import personagem.Personagem;

public interface JogoFactory {
	public Personagem createPersonagem();
	public Inimigo createInimigo(int x, int y);
}
