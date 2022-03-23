package estado;

import habilidades.AtqMedio;
import habilidades.MovMedio;
import personagem.Personagem;

public class Normal extends Estado{
	
	public Normal(Personagem personagem) {
		super(personagem);
		this.getPersonagem().setA(AtqMedio.getInstancia());
		this.getPersonagem().setM(MovMedio.getInstancia());
		
	}
	
	public void setLimites() {
		this.setLimiteInferior(30);
		this.setLimiteSuperior(70);
	}
	
	public void verificaEstado() {
		if(this.getPersonagem().getLife()< this.getLimiteInferior()) {
			this.getPersonagem().setE(new Perigo(this.getPersonagem()));
			this.getPersonagem().getE().verificaEstado();
						
		}
		else if(this.getPersonagem().getLife()> this.getLimiteSuperior()) {
			this.getPersonagem().setE(new Forte(this.getPersonagem()));

		}
		

	}
	
}
