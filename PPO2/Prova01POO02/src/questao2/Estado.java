package questao2;

public abstract class Estado {
	

	private Produto produto;
	
	
	public Estado(Produto produto) {
		setProduto(produto);
	}
	
	public abstract void verificaEstado();
	
	public void compra(int qtd) {
		this.getProduto().setQtd(this.getProduto().getQtd() + qtd);
		verificaEstado();
	}
	
	public void venda(int qtd) {
		if (this.getProduto().getQtd() - qtd < 0) {
			System.out.println("Não há estoque suficiente. Operação negada.");
		}else {
			this.getProduto().setQtd(this.getProduto().getQtd() - qtd);
			verificaEstado();
		}
	}
	//get set

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
