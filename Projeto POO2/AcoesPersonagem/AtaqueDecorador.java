package AcoesPersonagem;

public class AtaqueDecorador extends Ataque {
	private Ataque ataqueDecorado;
	
	public AtaqueDecorador(Ataque ataque) {
		this.ataqueDecorado = ataque;
	}
	
	public int getDano() {
		return (ataqueDecorado.getDano() + super.getDano());
	}
	
}
