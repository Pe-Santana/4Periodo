package estado;

import habilidades.AtqFraco;
import habilidades.MovDevagar;
import personagem.Personagem;

public class Perigo extends Estado{
	
	public Perigo(Personagem personagem) {
		super(personagem);
		this.getPersonagem().setA(AtqFraco.getInstancia());
		this.getPersonagem().setM(MovDevagar.getInstancia());
		
	}
	
	public void setLimites() {
		this.setLimiteInferior(1);
		this.setLimiteSuperior(29);
	}
	
	public void verificaEstado() {
		if(this.getPersonagem().getLife()< this.getLimiteInferior()) {
			this.getPersonagem().setE(new Morto(this.getPersonagem()));
						
		}
		else if(this.getPersonagem().getLife()> this.getLimiteSuperior()) {
			this.getPersonagem().setE(new Normal(this.getPersonagem()));
			this.getPersonagem().getE().verificaEstado();
		}
		

	}
	
}
