package personagem;
import habilidades.AtqMedio;
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
        setA(new AtqMedio());
        setP(new PuloAlto());
        setM(new MovRapido());
    }
}
