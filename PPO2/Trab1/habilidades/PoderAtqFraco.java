package habilidades;

public class PoderAtqFraco extends AtqDecorator {

	public PoderAtqFraco(Ataque atqDecorator) {
		super(atqDecorator);
		this.setAtqDecorator(atqDecorator);
	}
	
    public int atacar() {
		return (3 + this.getAtqDecorator().atacar());
	}
		
}
