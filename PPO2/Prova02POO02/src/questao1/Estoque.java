package questao1;

public class Estoque {
	private Fornecedor fornecedor;
	private int qtd;

	public Estoque( Fornecedor f) {
		this.fornecedor = f;
		this.setQtd(50);
	}
	
	
	//get set
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	public int getQtd() {
		return qtd;
	}



	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	

}
