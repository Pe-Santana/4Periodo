package personagem;

import habilidades.AtqFraco;

import habilidades.MovRapido;


/**
 * Escreva uma descrição da classe Personagem_01 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Personagem_01 extends Personagem
{
    public Personagem_01(){
		this.setPosX(250);
		this.setPosY(250);
        this.setA(AtqFraco.getInstancia());
        this.setM(MovRapido.getInstancia());
    }
}
