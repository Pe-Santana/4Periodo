package questao2;

public class Indisponivel extends Estado{
	
	public Indisponivel(Produto produto) {
		super(produto);
		this.getProduto().setQtd(0);
	}
	
	public void verificaEstado() {
		if (this.getProduto().getQtd() > 0 && this.getProduto().getQtd() < 10 ) {
			System.out.println("Estoque atualizado para Critico.");
			this.getProduto().setEstado(new Critico(this.getProduto()));
		}else if (this.getProduto().getQtd() > 10) {
			System.out.println("Estoque atualizado para Disponivel.");
			this.getProduto().setEstado(new Disponivel(this.getProduto()));
		}
	}

}
