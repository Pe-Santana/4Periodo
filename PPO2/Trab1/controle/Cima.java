package controle;

import personagem.Personagem;

public class Cima implements Comandos{
		
	Personagem personagem;
	
	public Cima(Personagem p) {
		this.personagem = p;
	}

	public void execute() {
		personagem.moverCima();
	}








}
