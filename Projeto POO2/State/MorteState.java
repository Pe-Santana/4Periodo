package State;
import Personagem.Personagem;

public class MorteState extends CharState {

	public MorteState(Personagem personagem) {
		super(personagem);
		System.out.println("fim de jogo!");
		java.lang.System.exit(0);
	}

	protected void setLimites() {

	}

	protected void verificarEstado() {

	}

}
