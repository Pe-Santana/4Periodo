package State;
import AcoesPersonagem.AtaqueForte;
import AcoesPersonagem.CorreRapido;
import Personagem.Personagem;

public class ForteState extends CharState {

	//construtor
	public ForteState(Personagem personagem) {
		super(personagem);
		personagem.setAtaque(new AtaqueForte());
		personagem.setCorre(new CorreRapido());
	}
	
	//comportamento particular deste estado
	protected void setLimites() {
		this.setLimiteInferior(71);
		this.setLimiteSuperior(100);
		
	}

	public void verificarEstado() {
		if (this.getPersonagem().getVida() < this.getLimiteInferior()) {
			if (this.getPersonagem().getVida() <= 0)
				this.getPersonagem().setEstado(new MorteState(this.getPersonagem()));
			else if (this.getPersonagem().getVida() <= 29)
				this.getPersonagem().setEstado(new PerigoState(this.getPersonagem()));
			else if (this.getPersonagem().getVida() <= 70)
				this.getPersonagem().setEstado(new NormalState(this.getPersonagem()));
		}//else if
	}//verificarEstado

}
