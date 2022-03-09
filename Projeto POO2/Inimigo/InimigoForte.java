package Inimigo;

import java.util.Observable;

import Personagem.Personagem;

@SuppressWarnings("deprecation")
public class InimigoForte extends Robo {
	// Construtor
	public InimigoForte(int x, int y) {
		super(x, y);
		setDano(10);
	}

	// Methods
	public void update(Observable subject, Object arg) {
		Personagem personagem = (Personagem) subject;

		// se estiver em distancia de atacar
		if (((this.x - personagem.getX()) == 0) && ((this.y - personagem.getY()) == 0)) {
			if (Math.random() < 0.5) {
				personagem.getEstado().levarDano(dano);
				personagem.setPos(personagem.getX() + 8, personagem.getY() - 8);
			} else {
				personagem.getEstado().levarDano(dano);
				personagem.setPos(personagem.getX() - 8, personagem.getY() + 8);
			}
		}
		// se estiver longe do personagem
		else {
			// se precisa andar para frente
			if (personagem.getX() > this.x)
				this.x = this.x + 1;
			else
				this.x = this.x - 1;
			// se precisa andar para tras
			if (personagem.getY() > this.y)
				this.y = this.y + 1;
			else
				this.y = this.y - 1;

		}
	}

}
