package personagem;
import habilidades.AtqMedio;
import habilidades.MovMedio;



/**
 * Escreva uma descrição da classe Personagem_02 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Personagem_02 extends Personagem
{
	public Personagem_02(){
		this.setPosX(250);
		this.setPosY(250);
        this.setA(AtqMedio.getInstancia());
        this.setM(MovMedio.getInstancia());
    }
}
