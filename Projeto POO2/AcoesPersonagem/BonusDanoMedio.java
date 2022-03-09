package AcoesPersonagem;

public class BonusDanoMedio extends AtaqueDecorador {
	public BonusDanoMedio(Ataque ataqueDecorado) {
		super(ataqueDecorado);
		setDano(10);
	}

}
