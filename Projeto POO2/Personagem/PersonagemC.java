package Personagem;
import AcoesPersonagem.PuloBaixo;
import State.NormalState;

/**
 * Implementa a classe de Personagem C.
 * Inicia com Pulo Baixo - Corre Rapido - Ataque Forte
 **/
public class PersonagemC extends Personagem {

	public PersonagemC(int x, int y) {
		super(x,y);
		setVida(70);
		setEstado(new NormalState(this));
		setPulo(new PuloBaixo());
		
	}
}