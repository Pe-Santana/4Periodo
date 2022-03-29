package personagem;
import habilidades.AtqForte;
import habilidades.MovMedio;

/**
 * Escreva uma descrição da classe Personagem_03 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Personagem_03 extends Personagem
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
	public Personagem_03(){
		this.setPosX(250);
		this.setPosY(250);
        this.setA(AtqForte.getInstancia());
        this.setM(MovMedio.getInstancia());
    }
}
