package main;

import habilidades.*;

import inimigo.*;
import personagem.Personagem;

public class Main {
	public static void main(String[] args) throws InterruptedException {
			
		Game jogo = new Game();
		
		jogo.jogar(jogo);

		/*	
		Ataque ataque = new AtqForte();
		ataque.atacar();
		System.out.println(ataque.atacar());
		ataque = new PoderAtqFraco(ataque);
		ataque.atacar();
		System.out.println(ataque.atacar());
		
		Personagem personagem = new Personagem();
		
		Inimigo chefe = new Chefe(5, 8);
		Inimigo orc1 = new Orc(3, 4);
		Inimigo orc2 = new Orc(-4, 2);
		Inimigo goblin1 = new Goblin(0, 3);
		Inimigo goblin2 = new Goblin(-1, 2);
		
		personagem.addObserver(chefe);
		personagem.addObserver(orc1);
		personagem.addObserver(orc2);
		personagem.addObserver(goblin1);
		personagem.addObserver(goblin2);
		
		
		while(personagem.getLife() != 0) {
			personagem.show();
			System.out.println(personagem.getLife());
			System.out.println(personagem.getPosX()+"|"+ personagem.getPosY());
			Thread.sleep(500);

			
			
		}
		
	
					System.out.println(personagem.getLife());
			System.out.println(orc1.getPosX()+"|"+ orc1.getPosY());
		personagem.atacar();
		
		personagem.ganhaLife(1);
		
		personagem.atacar();
		
		personagem.perdeLife(69);
		
		personagem.atacar();
		*/	
	}
	

}
