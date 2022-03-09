package questao3;

public abstract class Decorador extends Forma{
	private Forma forma;
	
	public Decorador(Forma forma) {
		this.setForma(forma);
		
	}
	
	public String desenhar() {
		
		return forma.desenhar()+", " + super.desenhar();
	}

	public Forma getForma() {
		return forma;
	}

	public void setForma(Forma forma) {
		this.forma = forma;
	}
	
}
