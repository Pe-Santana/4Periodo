package questao3;

public class S4 extends Estado{

	public void percorreCadeia(String cadeia) {
		for (int i = 0; i<cadeia.length(); i++) {
			if ('d' == cadeia.charAt(i)) {
				this.getAutomato().setEstado(new S3());
				cadeia.substring(i);
				percorreCadeia(cadeia);
				
			}else {
				cadeia.substring(i);
				percorreCadeia(cadeia);
			}
		}
	}
}
