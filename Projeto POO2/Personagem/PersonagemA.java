package Personagem;
import AcoesPersonagem.PuloMedio;
import State.NormalState;

/**
 * Implementa a classe de Personagem A.
 * Inicia com Pulo Medio - Corre Medio - Ataque Forte
 **/
public class PersonagemA extends Personagem {

	public PersonagemA(int x, int y) {
		super(x,y);
		setVida(70);
		setEstado(new NormalState(this));
		setPulo(new PuloMedio());
		
	}

}
