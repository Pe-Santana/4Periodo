package habilidades;

public class Besta extends AtqDecorator{
	
	public Besta(Ataque a) {
		super(a);
		this.setAtqDecorator(a);
	}
	
	public int atacar() {
		return (8 + this.getAtqDecorator().atacar());
	}
}
