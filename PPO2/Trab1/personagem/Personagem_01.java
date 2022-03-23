package personagem;
import habilidades.AtqForte;
import habilidades.AtqFraco;
import habilidades.MovMedio;
import habilidades.MovRapido;
import habilidades.PuloMedio;

/**
 * Escreva uma descrição da classe Personagem_01 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Personagem_01 extends Personagem
{
    public Personagem_01(){
        this.setA(AtqFraco.getInstancia());
        this.setM(MovRapido.getInstancia());
    }
}
