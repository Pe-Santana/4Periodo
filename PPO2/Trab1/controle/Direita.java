package controle;

import personagem.Personagem;

public class Direita implements Comandos{
		
	Personagem personagem;
	
	public Direita(Personagem p) {
		this.personagem = p;
	}

	public void execute() {
		personagem.moverDireita();
	}








}
