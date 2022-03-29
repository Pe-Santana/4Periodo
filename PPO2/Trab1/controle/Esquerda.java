package controle;

import personagem.Personagem;

public class Esquerda implements Comandos{
		
	Personagem personagem;
	
	public Esquerda(Personagem p) {
		this.personagem = p;
	}

	public void execute() {
		personagem.moverEsquerda();
	}








}
