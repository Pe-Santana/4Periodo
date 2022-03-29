package habilidades;

public class Raio extends AtqDecorator{
	
	public Raio(Ataque a) {
		super(a);
		this.setAtqDecorator(a);
	}
	
	public int atacar() {
		return (12 + this.getAtqDecorator().atacar());
	}
}
