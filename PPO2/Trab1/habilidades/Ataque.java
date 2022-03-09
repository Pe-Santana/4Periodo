package habilidades;

/**
 * Escreva a descrição da interface Ataque aqui.
 * 
 * @author (seu nome aqui) 
 * @version (um número da versão ou data aqui)
 */

public abstract class Ataque {
	
	public int dano;
	
	
	public int atacar(){
		return getDano();
	}
	
	
	//get set
    public int getDano() {
		return dano;
	}


	public void setDano(int dano) {
		this.dano = dano;
	}

}
