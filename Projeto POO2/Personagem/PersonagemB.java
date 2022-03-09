package Personagem;
import AcoesPersonagem.PuloAlto;
import State.NormalState;

/**
 * Implementa a classe de Personagem B.
 * Inicia com Pulo Alto - Corre Rapido - Ataque Medio
 **/
public class PersonagemB extends Personagem {

	public PersonagemB(int x, int y) {
		super(x,y);
		setVida(70);
		setEstado(new NormalState(this));
		setPulo(new PuloAlto());
		
	}

}
