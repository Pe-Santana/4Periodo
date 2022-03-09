package habilidades;

/**
 * Escreva uma descrição da classe MovDevagar aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MovDevagar implements Movimento
{
    public int movimentar(){
        System.out.println("Implementa movimento devagar.");
        
        return 5;
    }
}
