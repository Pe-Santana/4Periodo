package questao3;

public class ComandoCondicional implements Programa {
	
	private Programa p1;
	private Programa p2;
	double opcao = Math.random();
	
	public ComandoCondicional(Programa p1, Programa p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	
	
	public void execute() {
		if (opcao < 0.5) {
			p1.execute();
		}else {
			p2.execute();
		}
	}


}
