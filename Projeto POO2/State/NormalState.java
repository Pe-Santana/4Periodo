package State;
import AcoesPersonagem.AtaqueMedio;
import AcoesPersonagem.CorreMedio;
import Personagem.Personagem;

public class NormalState extends CharState {
	
	public NormalState(Personagem personagem) {
		super(personagem);
		personagem.setAtaque(new AtaqueMedio());
		personagem.setCorre(new CorreMedio());
	}
	
	//comportamento particular deste estado
	protected void setLimites() {
		this.setLimiteInferior(30);
		this.setLimiteSuperior(70);
		
	}

	public void verificarEstado() {
		if (this.getPersonagem().getVida() > this.getLimiteSuperior())
			this.getPersonagem().setEstado(new ForteState(this.getPersonagem()));
		else if (this.getPersonagem().getVida() < this.getLimiteInferior()) {
			if (this.getPersonagem().getVida() >= 1)
				this.getPersonagem().setEstado(new PerigoState(this.getPersonagem()));
			else if (this.getPersonagem().getVida() <= 0)
				this.getPersonagem().setEstado(new MorteState(this.getPersonagem()));
		}//else if
	}//verificarEstado

}
