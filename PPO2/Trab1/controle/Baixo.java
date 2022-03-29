package controle;

import personagem.Personagem;

public class Baixo implements Comandos{
		
	Personagem personagem;
	
	public Baixo(Personagem p) {
		this.personagem = p;
	}

	public void execute() {
		personagem.moverBaixo();
	}








}
