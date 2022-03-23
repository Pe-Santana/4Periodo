package personagem;
import habilidades.AtqFraco;
import habilidades.AtqMedio;
import habilidades.MovMedio;
import habilidades.MovRapido;
import habilidades.PuloAlto;

/**
 * Escreva uma descrição da classe Personagem_02 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Personagem_02 extends Personagem
{
	public Personagem_02(){
        this.setA(AtqMedio.getInstancia());
        this.setM(MovMedio.getInstancia());
    }
}
