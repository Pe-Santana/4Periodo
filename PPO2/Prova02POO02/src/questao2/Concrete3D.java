package questao2;

public class Concrete3D extends AbstractFactory {
	
	public AbstractCopo criaCopo() {
		return new Copo3D();
	}
	public AbstractPrato criaPrato() {
		return new Prato3D();
	}
	public AbstractGarrafa criaGarrafa() {
		return new Garrafa3D();
	}

}
