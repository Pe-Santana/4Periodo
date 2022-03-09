package Personagem;

import AcoesPersonagem.Ataque;
import AcoesPersonagem.Corre;
import AcoesPersonagem.Pulo;
import Escudo.Escudo;
import State.CharState;
import java.util.Observable;

/**
 * Implementa a classe abstrata de Personagem.
 **/
@SuppressWarnings("deprecation")
public abstract class Personagem extends Observable {
	private int vida;
	private Ataque ataque;
	private Pulo pulo;
	private Corre corre;
	private CharState estado;
	private int x = 0;
	private int y = 0;
	private Escudo escudo1 = new Escudo();

	// Construtor
	public Personagem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Getters & Setters
	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVida() {
		return vida;
	}

	public void setAtaque(Ataque ataque) {
		this.ataque = ataque;
	}

	public void setPulo(Pulo pulo) {
		this.pulo = pulo;
	}

	public void setCorre(Corre corre) {
		this.corre = corre;
	}

	public CharState getEstado() {
		return estado;
	}

	public void setEstado(CharState estado) {
		this.estado = estado;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Escudo getEscudo1() {
		return escudo1;
	}

	public void setEscudo1(Escudo escudo1) {
		this.escudo1 = escudo1;
	}

	public Ataque getAtaque() {
		return ataque;
	}

	// Methods
	public void atacar() {
		ataque.atacar();
	}

	public void pular() {
		pulo.pular();
	};

	public void correr() {
		corre.correr();
	}

	public void setPos(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Observable methods

	public void show() {
		setChanged();
		notifyObservers();
	}
}
