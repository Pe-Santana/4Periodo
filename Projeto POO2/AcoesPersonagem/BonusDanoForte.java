package AcoesPersonagem;

public class BonusDanoForte extends AtaqueDecorador {
	public BonusDanoForte(Ataque ataqueDecorado) {
		super(ataqueDecorado);
		setDano(15);
	}

}
