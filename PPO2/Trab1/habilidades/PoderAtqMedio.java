package habilidades;

public class PoderAtqMedio extends AtqDecorator {
	public PoderAtqMedio(Ataque atqDecorator) {
		super(atqDecorator);
		setDano(6);
	}
	
    public int getDano() {
		return (super.getDano() + this.getAtqDecorator().atacar());
	}
		

		
}
