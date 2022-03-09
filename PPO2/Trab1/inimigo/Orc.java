package inimigo;

import java.util.Observable;
import java.util.Observer;

import personagem.Personagem;
import estado.*;

public class Orc extends Inimigo {

	
	
	public Orc(int x, int y) {
		super(x,y);
		this.setE(new Normal(this));
	}

}
