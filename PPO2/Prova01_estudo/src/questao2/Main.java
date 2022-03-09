package questao2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Acoes acao1 = new Acoes("Petrobras", 7.5f);
		Acoes acao2 = new Acoes("Vale", 6f);
		Acoes acao3 = new Acoes("Twitch", 18.22f);
		
		
		HomeBroker home1 = new HomeBroker();
		HomeBroker home2 = new HomeBroker();
		HomeBroker home3 = new HomeBroker();
		
		acao1.addObserver(home1);
		acao2.addObserver(home2);
		acao3.addObserver(home3);
		
		acao1.imprime();
		acao2.imprime();
		acao3.imprime();
		
		acao2.setValor(10.4f);
		
	}

}
