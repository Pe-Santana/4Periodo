package questao1;
//concrete command
public class PedidoReposicao implements Command{
	private Fornecedor f;

	
	
	public PedidoReposicao(Fornecedor f) {
		this.f = f;
				
	}
	
	
	public void execute() {
		f.reporEstoque();
	}
	

	public void fail() {
		f.falhaReposicao();
	}







}
