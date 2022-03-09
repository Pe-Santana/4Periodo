package questao3;

public abstract class Estado {
	
	private Automato automato;
	
	public abstract void percorreCadeia(String cadeia);

	public Automato getAutomato() {
		return automato;
	}

	public void setAutomato(Automato automato) {
		this.automato = automato;
	}
	
	
}
