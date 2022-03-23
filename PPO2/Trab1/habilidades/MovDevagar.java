package habilidades;

/**
 * Escreva uma descrição da classe MovDevagar aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MovDevagar implements Movimento
{
	private static MovDevagar instancia = null;
	
	private MovDevagar() {
		super();
	}
	
	public static synchronized MovDevagar getInstancia() {
		if (instancia == null) {
			instancia = new MovDevagar();
		}
		return instancia;
	}
    public int movimentar(){
        System.out.println("Implementa movimento devagar.");
        
        return 5;
    }
}
