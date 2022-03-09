package questao2;

import java.util.Observable;
import java.util.Observer;

public class HomeBroker implements Observer {

	
	public void update(Observable subject, Object arg) {
		
		Acoes acoes = (Acoes)subject;
							
		System.out.println("o pre�o da a��o "+acoes.getNome()+" foi atualizado");
		
		acoes.imprime();
	
	}
}
