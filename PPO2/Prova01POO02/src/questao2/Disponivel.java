package questao2;

public class Disponivel extends Estado{
	
	public Disponivel(Produto produto) {
		super(produto);
	}
	
	public void verificaEstado() {
		if (this.getProduto().getQtd() < 10 && this.getProduto().getQtd() > 0) {
			System.out.println("Estoque atualizado para Critico.");
			this.getProduto().setEstado(new Critico(this.getProduto()));
		}else if (this.getProduto().getQtd() == 0) {
			System.out.println("Estoque atualizado para Indisponivel.");
			this.getProduto().setEstado(new Indisponivel(this.getProduto()));
		}
	}
}
