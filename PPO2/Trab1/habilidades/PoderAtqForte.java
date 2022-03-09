package habilidades;

public class PoderAtqForte extends AtqDecorator {
	public PoderAtqForte(Ataque atqDecorator) {
		super(atqDecorator);
		setDano(20);
	}
    public int getDano() {
		return (super.getDano() + this.getAtqDecorator().atacar());
	}
		

		
}
