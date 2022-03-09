package Inimigo;
import Personagem.Personagem;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Robo implements Observer {
	protected int x;
	protected int y;
	protected int dano;
	
	//Construtor
	public Robo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Getters & Setters
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setDano(int dano) {
		this.dano = dano;
	}
	
	//Methods
    public void update(Observable subject, Object arg) {
        Personagem personagem = (Personagem)subject;
        
        //se estiver em distancia de atacar
        if ( ( (this.x - personagem.getX()) == 0) && ((this.y - personagem.getY()) == 0) ){
            System.out.println("Inimigo: "+this+" ataca o personagem!" );
            if (Math.random() < 0.5){
            	personagem.setVida(personagem.getVida()-5);
                personagem.setPos(personagem.getX()+6, personagem.getY()-6);
            }
            else {
            	personagem.setVida(personagem.getVida()-5);
                personagem.setPos(personagem.getX()-6, personagem.getY()+6);
            }
        }
        //se estiver longe do personagem
        else {
           //se precisa andar para frente
           if (personagem.getX() > this.x) this.x = this.x+1;
           else this.x = this.x-1;
           //se precisa andar para tras
           if (personagem.getY() > this.y) this.y = this.y+1;
           else this.y = this.y-1;
     
        }                        
    }
}