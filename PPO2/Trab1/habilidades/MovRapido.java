package habilidades;

/**
 * Escreva uma descrição da classe MovRapido aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MovRapido implements Movimento
{
	private static MovRapido instancia = null;
	
	private MovRapido() {
		super();
	}
	
	public static synchronized MovRapido getInstancia() {
		if (instancia == null) {
			instancia = new MovRapido();
		}
		return instancia;
	}
    public int movimentar(){
        System.out.println("Implementa movimento r�pido.");
        
        return 20;
    }
}
