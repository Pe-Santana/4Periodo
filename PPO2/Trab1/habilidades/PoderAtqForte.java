package habilidades;

public class PoderAtqForte extends AtqDecorator {
	
	public PoderAtqForte(Ataque atqDecorator) {
		super(atqDecorator);
		this.setAtqDecorator(atqDecorator);
	}
    public int atacar() {
		return (10 + this.getAtqDecorator().atacar());
	}
		

		
}
