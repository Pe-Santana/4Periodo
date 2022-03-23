package habilidades;

/**
 * Escreva uma descrição da classe AtqForte aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AtqForte extends Ataque
{
    private static AtqForte instancia = null;
    
    private AtqForte() {
    	super();
    }
    
    public static synchronized AtqForte getInstancia() {
    	if (instancia == null) {
			instancia = new AtqForte();
		}
    	return instancia;
    }
	public int atacar(){
        System.out.println("Implementa ataque forte.");
        return 10;
    }
}
