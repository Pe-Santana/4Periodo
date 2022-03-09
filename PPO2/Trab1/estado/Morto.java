package estado;


import personagem.Personagem;

public class Morto extends Estado{
	
	public Morto(Personagem personagem) {
		super(personagem);
	
	}
	
	public void setLimites() {
		this.setLimiteInferior(0);
		this.setLimiteSuperior(0);
	}
	
	public void verificaEstado() {
		if(this.getPersonagem().getLife()< this.getLimiteInferior()) {
			this.getPersonagem().getE().verificaEstado();
						
		}

	}
	
}
