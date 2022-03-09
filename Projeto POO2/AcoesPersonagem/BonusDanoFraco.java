package AcoesPersonagem;

public class BonusDanoFraco extends AtaqueDecorador {
	public BonusDanoFraco(Ataque ataqueDecorado) {
		super(ataqueDecorado);
		setDano(5);
	}

}