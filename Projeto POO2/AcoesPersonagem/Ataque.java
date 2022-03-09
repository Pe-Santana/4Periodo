package AcoesPersonagem;
/**
 Implementa o metodo abstrato ataque.
**/

public abstract class Ataque {
	private int dano;
	
	//Getters & Setters
	public int getDano() {
		return dano;
	}
	
	public void setDano(int dano) {
		this.dano = dano;
	}

	public void atacar() {
		int dmg = getDano();
		System.out.println("Ataque fraco: " + dmg + " de dano causado!");
	}
}