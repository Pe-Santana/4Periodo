package questao1;

public class Moeda extends Gerencia {
	private Moeda proximo;

	public Moeda(float valor) {
		if (valor == 0.01f) {
			this.setValor(valor);
			this.setDiametro(1.0f);
			this.setProximo(null);
		}else if (valor == 0.05f) {
			this.setValor(valor);
			this.setDiametro(1.2f);
			this.setProximo(null);
		}else if (valor == 0.10f) {
			this.setValor(valor);
			this.setDiametro(1.4f);
			this.setProximo(null);
		}else if (valor == 0.50f) {
			this.setValor(valor);
			this.setDiametro(1.6f);
			this.setProximo(null);
		}else if (valor == 1.00f) {
			this.setValor(valor);
			this.setDiametro(1.8f);
			this.setProximo(null);
		}else {
			this.setValor(valor);
			this.setDiametro(2.42f); // o diametro foi setado como 2.42 apenas para fins de validação para erro
			this.setProximo(null);
		}
	}
	
	
	//get set
	public Moeda getProximo() {
		return proximo;
	}

	public void setProximo(Moeda proximo) {
		this.proximo = proximo;
	}
	
}
