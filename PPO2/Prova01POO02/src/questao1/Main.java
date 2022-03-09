package questao1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//moedas
		Moeda moeda1 = new Moeda(0.01f);
		
		Moeda moeda2 = new Moeda(0.10f);
		moeda1.setProximo(moeda2);

		Moeda moeda3 = new Moeda(0.50f);
		moeda2.setProximo(moeda3);
		
		Moeda moeda4 = new Moeda(0.25f);
		moeda3.setProximo(moeda4);
		
		Moeda moeda5 = new Moeda(1.0f);
		moeda4.setProximo(moeda5);
	
		//manipuladores
		
		Manipulador fenda1 = new Diam_10();
		
		Manipulador fenda2 = new Diam_12();
		fenda1.setProximo(fenda2);

		Manipulador fenda3 = new Diam_14();
		fenda2.setProximo(fenda3);
		
		Manipulador fenda4 = new Diam_16();
		fenda3.setProximo(fenda4);
		
		Manipulador fenda5 = new Diam_18();
		fenda4.setProximo(fenda5);
		
		
		fenda1.processaCompra(moeda1);
	}

}
