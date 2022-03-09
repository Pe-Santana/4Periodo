package questao3;

public class S1 extends Estado{
	

	public void percorreCadeia(String cadeia) {
		for (int i = 0; i<cadeia.length(); i++) {
			if ('a' == cadeia.charAt(i)) {
				this.getAutomato().setEstado(new S2());
				cadeia.substring(i);
				percorreCadeia(cadeia);
				
			}else {
				cadeia.substring(i);
				percorreCadeia(cadeia);
			}
		}
	}

	
	
}
