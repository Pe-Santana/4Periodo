package habilidades;

/**
 * Escreva uma descrição da classe AtqMedio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AtqMedio extends Ataque
{
    private static AtqMedio instancia = null;
    
    private AtqMedio() {
    	super();
    }
    
    public static synchronized AtqMedio getInstancia() {
    	if (instancia == null) {
			instancia = new AtqMedio();
		}
    	return instancia;
    }
    public int atacar(){
        System.out.println("Implementa ataque m�dio.");
        return 7;
    }
}
