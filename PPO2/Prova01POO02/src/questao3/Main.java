package questao3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forma forma1 = new Triangulo();
		
		System.out.println(forma1.desenhar());
		
		forma1 = new Preenchimento(forma1);
		
		System.out.println(forma1.desenhar());
		
		forma1 = new Textura(forma1);
		
		System.out.println(forma1.desenhar());
	}

}
