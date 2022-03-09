package habilidades;

public class PoderAtqFraco extends AtqDecorator {

	public PoderAtqFraco(Ataque atqDecorator) {
		super(atqDecorator);
		setDano(3);
	}
	
    public int getDano() {
		return (super.getDano() + this.getAtqDecorator().atacar());
	}
		
}
