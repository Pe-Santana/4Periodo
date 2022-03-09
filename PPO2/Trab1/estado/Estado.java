package estado;

import personagem.Personagem;

public abstract class Estado {

	private Personagem personagem;
	private int limiteInferior;
	private int limiteSuperior;
	
	
	public Estado(Personagem personagem) {
		this.personagem = personagem;
		setLimites();
	}

	
	public abstract void setLimites();
	
	public abstract void verificaEstado();
	
	
	public void ganharVida(int valor) {
		this.personagem.setLife(valor+this.personagem.getLife());
		if(this.personagem.getLife() > 100) {
			this.personagem.setLife(100);
		}
		verificaEstado();
	}
	
	public void perderVida(int valor) {
		this.personagem.setLife(this.personagem.getLife()-valor);
		verificaEstado();
	}
		
	
	
//get set
	
	public Personagem getPersonagem() {
		return personagem;
	}


	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}


	public int getLimiteInferior() {
		return limiteInferior;
	}


	public void setLimiteInferior(int limiteInferior) {
		this.limiteInferior = limiteInferior;
	}


	public int getLimiteSuperior() {
		return limiteSuperior;
	}


	public void setLimiteSuperior(int limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}
	
	
	
	
}
