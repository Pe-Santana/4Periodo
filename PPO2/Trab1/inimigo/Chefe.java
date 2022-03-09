package inimigo;

import java.util.Observable;
import java.util.Observer;

import personagem.Personagem;
import estado.*;

public class Chefe extends Inimigo {

	
	
	public Chefe(int x, int y) {
		super(x,y);
		this.setE(new Forte(this));
	}

}
