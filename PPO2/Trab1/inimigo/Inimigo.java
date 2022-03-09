package inimigo;

import java.util.Observable;
import java.util.Observer;

import personagem.Personagem;

public class Inimigo extends Personagem implements Observer {
	
	
	public Inimigo(int x, int y) {
		this.setPosicao(x, y);		
	}
	
	 public void update(Observable subject, Object arg) {
	        Personagem personagem = (Personagem)subject;
	        
	        //se estiver em distancia de atacar
	        if ( ( (this.getPosX() - personagem.getPosX()) == 0) && ((this.getPosY() - personagem.getPosY()) == 0) ){
	            System.out.println("Inimigo: "+this+" ataca o personagem!" );
            	personagem.perdeLife(this.atacar());
	            if (Math.random() < 0.5){
	                personagem.setPosicao(personagem.getPosX()+5, personagem.getPosY()-5);
	            }
	            else {
	                personagem.setPosicao(personagem.getPosX()-5, personagem.getPosY()+5);
	            }
	        }
	        //se estiver longe do personagem
	        else {
	           //se precisa andar para frente
	           if (personagem.getPosX() > this.getPosX()) {
	        	   this.setPosX(this.getPosX()+1);
	           }
	           else {
	        	   this.setPosX(this.getPosX()-1);
	           }
	           //se precisa andar para tras
	           if (personagem.getPosY() > this.getPosY()) {
	        	   this.setPosY(this.getPosY()+1);
	           }
	           else {
	        	   this.setPosY(this.getPosY()-1);
	           }
	     
	        }
	 }
	
}
