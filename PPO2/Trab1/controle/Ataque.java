package controle;

import java.util.ArrayList;


import inimigo.Inimigo;
import personagem.Personagem;

public class Ataque implements Comandos{
		
	Personagem personagem;
    private ArrayList<Inimigo> inimigo = new ArrayList<Inimigo>();
	
	public Ataque(Personagem p, ArrayList<Inimigo> inimigo) {
		this.personagem = p;
		this.inimigo=inimigo;
		
	}

	public void execute() {
		for(int i = 0; inimigo.size()> i; i++) {
			
			personagem.hita(inimigo.get(i));
		}
	}








}
