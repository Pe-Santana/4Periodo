package habilidades;

public class AtqDecorator extends Ataque {
	private Ataque atqDecorator;
	
	public AtqDecorator(Ataque atq) {
		setAtqDecorator(atq);
		
	}

	//get set
	
	public Ataque getAtqDecorator() {
		return atqDecorator;
	}

	public void setAtqDecorator(Ataque atqDecorator) {
		this.atqDecorator = atqDecorator;
	}
	
}
