package inimigo;

import java.util.Observable;
import java.util.Observer;

import personagem.Personagem;
import estado.*;

public class Goblin extends Inimigo {

	
	
	public Goblin(int x, int y) {
		super(x,y);
		this.setE(new Perigo(this));
	}

}
