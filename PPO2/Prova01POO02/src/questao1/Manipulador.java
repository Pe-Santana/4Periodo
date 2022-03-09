package questao1;

public class Manipulador extends Gerencia{
	private Manipulador proximo;

	public Manipulador(float diametro) {
			this.setDiametro(diametro);
			this.setProximo(null);

	}

	public void processaCompra(Moeda moeda) {
		if (this.getDiametro() == moeda.getDiametro() && moeda.getProximo() != null) {
			System.out.println("valor:"+moeda.getValor());
			moeda = moeda.getProximo();
			processaCompra(moeda);
		}else if (this.getDiametro() == moeda.getDiametro() && moeda.getProximo() == null) {
			System.out.println("valor:"+moeda.getValor());
			moeda = moeda.getProximo();
		}else if (this.getDiametro() != moeda.getDiametro() && this.getProximo() != null) {
			this.getProximo().processaCompra(moeda);
		}else if (this.getDiametro() != moeda.getDiametro() && this.getProximo() == null && moeda.getProximo() != null) {
			System.out.println("A moeda de "+moeda.getValor()+" não possui diametro compativel(" +moeda.getDiametro()+"cm).");
			moeda = moeda.getProximo();
			processaCompra(moeda);
		}else {
			System.out.println("A moeda de "+moeda.getValor()+" não possui diametro compativel(" +moeda.getDiametro()+"cm).");
			moeda = moeda.getProximo();
		}
	}
	//get set
	public Manipulador getProximo() {
		return proximo;
	}

	public void setProximo(Manipulador proximo) {
		this.proximo = proximo;
	}
	
	
}
