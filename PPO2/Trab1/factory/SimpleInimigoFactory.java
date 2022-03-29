package factory;
import inimigo.*;




public class SimpleInimigoFactory {
	
	public static Inimigo createInimigo(int tipo, int x, int y){

		if (tipo == 1) {
			//tipo 1
			return new Chefe(x, y);
		} else if(tipo == 2) {
			//tipo 2
			return new Orc(x,y);

		} else {
			//tipo 3
			return new Goblin(x,y);

		} 
	}

}
