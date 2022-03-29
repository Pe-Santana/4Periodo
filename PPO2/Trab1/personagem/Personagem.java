package personagem;
import estado.Estado;
import habilidades.Ataque;
import habilidades.Movimento;
import inimigo.*;

import java.util.Observable;

import escudo.*;
import estado.*;

/**
 * Classe abstrata Personagem - escreva uma descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (número da versão ou data aqui)
 */
public class Personagem extends Observable
{
	private int life;
	private Ataque a;
    private Movimento m;
    private Estado e;
    private int posX;
    private int posY;
    private Escudo escudo;
    
    
	public Personagem(int x, int y) {
		this.life = 70;
		this.e = new Normal(this);
		this.setPosicao(x,y);
		this.escudo = null;
	}
	
	public Personagem() {
		
	}
	
	public void hita(Inimigo inimigo) {
        //se estiver em distancia de atacar
        if ( (Math.abs(this.getPosX() - inimigo.getPosX()) <=5) && (Math.abs(this.getPosY() - inimigo.getPosY()) <=5) ){
            System.out.println("ataca o Inimigo!" );
            inimigo.perdeLife(this.atacar());
            if (inimigo.getLife() <= 0) {
            	this.deleteObserver(inimigo);
				
			}
            if (Math.random() < 0.5){
                inimigo.setPosicao(inimigo.getPosX()+5, inimigo.getPosY()-5);
            }
            else {
            	inimigo.setPosicao(inimigo.getPosX()-5, inimigo.getPosY()+5);
            }
        }
	}
	
	//mover
	public void moverCima() {
		this.setPosY(this.getPosY() - 1);
	}
	public void moverBaixo() {
		this.setPosY(this.getPosY() + 1);
	}
	public void moverEsquerda() {
		this.setPosX(this.getPosX() - 1);
	}
	public void moverDireita() {
		this.setPosX(this.getPosX() + 1);
	}
	
	
	public void ganhaEscudo(Escudo novoescudo) {
		novoescudo.setProximo(escudo);
		escudo = novoescudo;
	}
	public int atacar(){
		return a.atacar();
    }
    public void movimentar(){
        m.movimentar();
    }

    
    public void ganhaLife(int life) {
    	this.getE().ganharVida(life);
       	System.out.println("+"+life);
    }
    
    public void perdeLife(int life) {
    	if(escudo != null) {
        	this.getE().perderVida(this.getEscudo().absorveDano(life));
    		System.out.println("-"+life);
    	}else {
    		
    		this.getE().perderVida(life);
    		System.out.println("-"+life);
    	}
    }
    
    public void setPosicao(int x, int y) {
    	setPosX(x);
    	setPosY(y);
    	setChanged();
    	notifyObservers(this);
    	
    }
    
    public void show(){
        setChanged();
        notifyObservers();
    }
    
    //get set
    public Estado getE() {
		return e;
	}

	public void setE(Estado e) {
		this.e = e;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public Ataque getA() {
		return a;
	}

	public void setA(Ataque a) {
		this.a = a;
	}

	public Movimento getM() {
		return m;
	}

	public void setM(Movimento m) {
		this.m = m;
	}


	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}




}
