package habilidades;

public class PoderAtqMedio extends AtqDecorator {
	public PoderAtqMedio(Ataque atqDecorator) {
		super(atqDecorator);
		this.setAtqDecorator(atqDecorator);
	}
	
    public int atacar() {
		return (6 + this.getAtqDecorator().atacar());
	}
		

		
}
