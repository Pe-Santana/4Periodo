package questao2;

public class Concrete2D extends AbstractFactory{
	
	public AbstractPrato criaPrato() {
		return new Prato2D();
	}
	public AbstractCopo criaCopo() {
		return new Copo2D();
	}
	public AbstractGarrafa criaGarrafa() {
		return new Garrafa2D();
	}
	
}
