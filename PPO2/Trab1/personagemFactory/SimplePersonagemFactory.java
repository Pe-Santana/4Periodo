package personagemFactory;

import personagem.*;


public class SimplePersonagemFactory {
	
	public static Personagem createPersonagem(){
		
		Personagem p = new Personagem();
		double tipo = Math.random();
		if (tipo <= 0.2) {
			//tipo 1
			return new Personagem_01();
		} else if(tipo > 0.2 && tipo <= 0.4) {
			//tipo 2
			return new Personagem_02();

		} else if(tipo > 0.4 && tipo <= 0.6) {
			//tipo 3
			return new Personagem_03();
		} else if(tipo > 0.6 && tipo <= 0.8) {
			//tipo 4
			return new Personagem_04();
		} else {
			//tipo 5
			return new Personagem_05();
		}
	}
}
