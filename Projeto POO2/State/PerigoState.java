package State;
import AcoesPersonagem.AtaqueFraco;
import AcoesPersonagem.CorreDevagar;
import Personagem.Personagem;

/**
 * Classe que implementa o estado de perigo do personagem. Ocorre quando a vida
 * do personagem esta entre 0 e 30.
 */
public class PerigoState extends CharState {

	public PerigoState(Personagem personagem) {
		super(personagem);
		personagem.setAtaque(new AtaqueFraco());
		personagem.setCorre(new CorreDevagar());
	}

	// comportamento particular deste estado
	protected void setLimites() {
		this.setLimiteInferior(0);
		this.setLimiteSuperior(29);

	}

	public void verificarEstado() {
		if (this.getPersonagem().getVida() <= this.getLimiteInferior())
			this.getPersonagem().setEstado(new MorteState(this.getPersonagem()));
		else if (this.getPersonagem().getVida() > this.getLimiteSuperior()) {
			if (this.getPersonagem().getVida() <= 70)
				this.getPersonagem().setEstado(new NormalState(this.getPersonagem()));
			else if (this.getPersonagem().getVida() >= 71)
				this.getPersonagem().setEstado(new ForteState(this.getPersonagem()));
		}//else if
	}//verificarEstado

}
