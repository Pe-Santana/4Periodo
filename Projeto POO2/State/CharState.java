package State;
import Personagem.Personagem;
/**
 * Classe abstrata que implementa os estados do personagem em relacao a sua vida atual.
 */
public abstract class CharState {
	private Personagem personagem;
	private int limiteInferior;
	private int limiteSuperior;
	
	//Construtor
	public CharState(Personagem personagem) {
		this.personagem = personagem;
		setLimites();
	}
	
	//Getters & Setters
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
	
	public Personagem getPersonagem() {
		return personagem;
	}

	//Methods
	public void levarDano(int dano) {
		int danofiltrado;
		danofiltrado = personagem.getEscudo1().processaEscudo(dano);
		this.personagem.setVida(this.personagem.getVida() - danofiltrado);
		if(dano>0) {
			System.out.println("Personagem perde " + danofiltrado + " de vida!");
			System.out.println("Vida do personagem: " + personagem.getVida());
		}
		if(personagem.getVida()<0) {
			personagem.setVida(0);
		}
		this.verificarEstado();
	}


	public void recuperarVida(int vida) {
		this.personagem.setVida(this.personagem.getVida() +vida);
		if(personagem.getVida()>100) {
			personagem.setVida(100);
		}
		this.verificarEstado();
	}
	
	protected abstract void setLimites();
	protected abstract void verificarEstado();

}
