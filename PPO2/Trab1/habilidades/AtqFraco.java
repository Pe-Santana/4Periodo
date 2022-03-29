package habilidades;

/**
 * Escreva uma descrição da classe AtqFraco aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AtqFraco implements Ataque
{
    private static AtqFraco instancia = null;
    
    private AtqFraco() {
    	super();
    }
    
    public static synchronized AtqFraco getInstancia() {
    	if (instancia == null) {
			instancia = new AtqFraco();
		}
    	return instancia;
    }
    public int atacar(){
        System.out.println("Implementa ataque fraco.");
        return 3;
    }
}
