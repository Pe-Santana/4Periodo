package questao2;

public class Critico extends Estado{
	
	public Critico(Produto produto) {
		super(produto);
	}
	
	public void verificaEstado() {
		if (this.getProduto().getQtd() > 10) {
			System.out.println("Estoque atualizado para Disponivel.");
			this.getProduto().setEstado(new Disponivel(this.getProduto()));
		}else if (this.getProduto().getQtd() == 0) {
			System.out.println("Estoque atualizado para Indisponivel.");
			this.getProduto().setEstado(new Indisponivel(this.getProduto()));
		}
	}
}
