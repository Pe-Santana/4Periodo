package personagem;
import habilidades.AtqForte;
import habilidades.MovMedio;
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
        setA(new AtqForte());
        setP(new PuloMedio());
        setM(new MovMedio());
    }
}
