package habilidades;

/**
 * Escreva uma descrição da classe MovMedio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MovMedio implements Movimento
{
	private static MovMedio instancia = null;
	
	private MovMedio() {
		super();
	}
	
	public static synchronized MovMedio getInstancia() {
		if (instancia == null) {
			instancia = new MovMedio();
		}
		return instancia;
	}
    public int movimentar(){
        System.out.println("Implementa movimento m�dio.");
        
        return 10;

    }
}
