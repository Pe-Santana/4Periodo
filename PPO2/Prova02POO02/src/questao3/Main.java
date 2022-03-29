package questao3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programa s1 = new ComandoSimples("comando Simples -01-");
		Programa s2 = new ComandoSimples("comando Simples -02-");
		Programa s3 = new ComandoSimples("comando Simples -03-");
		Programa s4 = new ComandoSimples("comando Simples -04-");
		Programa s5 = new ComandoSimples("comando Simples -05-");
		Programa s6 = new ComandoSimples("comando Simples -06-");
		ArrayList<Programa> composto = new ArrayList<Programa>();
		composto.add(s1);
		composto.add(s2);
		composto.add(s4);
		
		ArrayList<Programa> composto2 = new ArrayList<Programa>();
		composto2.add(s3);
		composto2.add(s5);
		
		Programa cComposto1 = new ComandoComposto(composto);
		
		composto2.add(cComposto1);
		
		Programa cComposto2 = new ComandoComposto(composto2);
		
		Programa cCondicional = new ComandoCondicional(cComposto1,cComposto2);
		
		
		s6.execute();
		System.out.println("-------------");
		cComposto1.execute();
		System.out.println("-------------");
		cCondicional.execute();
	}

}
