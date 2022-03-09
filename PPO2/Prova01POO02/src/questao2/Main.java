package questao2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto prod1 = new Produto("Coca");

		System.out.println(prod1.getEstado());
		
		prod1.compra(12);
	
		System.out.println(prod1.getQtd());
		System.out.println(prod1.getEstado());
		
		prod1.venda(12);
		
		System.out.println(prod1.getQtd());
		
		
	}
	

}
