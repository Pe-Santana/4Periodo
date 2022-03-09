package questao3;

public class Preenchimento extends Decorador {
	
	public Preenchimento(Forma forma) {
		super(forma);
		setDescricao("Preenchido");
	}
}
