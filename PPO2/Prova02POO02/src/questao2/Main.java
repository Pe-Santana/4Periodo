package questao2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractFactory fabrica2D = new Concrete2D();
		AbstractFactory fabrica3D = new Concrete3D();
		
		//objetos 2D
		
		AbstractCopo copo1 = fabrica2D.criaCopo();
		copo1.desenhar();
		System.out.println("----------------------");

		AbstractGarrafa garrafa1 = fabrica2D.criaGarrafa();
		garrafa1.desenhar();
		System.out.println("----------------------");
		
		AbstractPrato prato1 = fabrica2D.criaPrato();
		prato1.desenhar();
		System.out.println("----------------------");
		
		//objetos 3D
		
		AbstractCopo copo2 = fabrica3D.criaCopo();
		copo2.desenhar();
		System.out.println("----------------------");

		AbstractGarrafa garrafa2 = fabrica3D.criaGarrafa();
		garrafa2.desenhar();
		System.out.println("----------------------");
		
		AbstractPrato prato2 = fabrica3D.criaPrato();
		prato2.desenhar();
		System.out.println("----------------------");
	}
	
	

}
