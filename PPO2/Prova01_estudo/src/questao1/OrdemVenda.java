package questao1;

public class OrdemVenda extends Gerencia {

	private OrdemVenda proximo;
	
	public OrdemVenda(int cod, int qtd, float valor) {
		this.setCodAcao(cod);
		this.setQtd(qtd);
		this.setValor(valor);
		this.setProximo(null);
	}
	
	public void processaCompra(OrdemCompra compra) {
		
		if (this.getCodAcao() == compra.getCodAcao() && this.getQtd() >= compra.getQtd() && this.getValor() <= compra.getValor()) {
			
			this.setQtd(this.getQtd()-compra.getQtd());
			System.out.println("Vendido");
						
		} else if (this.getProximo() == null) {
			System.out.println("Não foram encontradas ações que atendam seus parâmetros.");
		} else {
			this.getProximo().processaCompra(compra);
		}
	}
	
	public void imprime() {
		System.out.println("Ação nº:"+this.getCodAcao());
		System.out.println("Quantidade:" + this.getQtd()+"    Valor:"+this.getValor());
		if (this.getProximo() == null) {
			System.out.println("------------------------------");
		}else {
			
			this.getProximo().imprime();
		}
		
	}
	
	//get set
	public OrdemVenda getProximo() {
		return proximo;
	}

	public void setProximo(OrdemVenda proximo) {
		this.proximo = proximo;
	}
}
