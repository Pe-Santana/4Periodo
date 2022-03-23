package estado;

import habilidades.AtqForte;
import habilidades.MovRapido;
import personagem.Personagem;

public class Forte extends Estado{
	
	public Forte(Personagem personagem) {
		super(personagem);
		this.getPersonagem().setA((AtqForte.getInstancia()));
		this.getPersonagem().setM(MovRapido.getInstancia());
		
	}
	
	public void setLimites() {
		this.setLimiteInferior(71);
		this.setLimiteSuperior(100);
	}
	
	public void verificaEstado() {
		if(this.getPersonagem().getLife()< this.getLimiteInferior()) {
			this.getPersonagem().setE(new Normal(this.getPersonagem()));
			this.getPersonagem().getE().verificaEstado();
						
		}

	}
	
}
