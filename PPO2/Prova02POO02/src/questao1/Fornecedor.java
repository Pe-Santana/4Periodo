package questao1;

public class Fornecedor {
	
	private String nome;

	
	public Fornecedor(String nome) {
		super();
		this.nome = nome;
	}
	
	public void reporEstoque() {
		
		System.out.println("Solicita��o para reposi��o do estoque enviada ao fornecedor " + nome +".");
	}
	public void falhaReposicao() {
		
		//est.setQtd(50); // definido 50 como estoque maximo
		System.out.println("A Solicita��o foi recusada. Estoque acima do valor cr�tico(20).");
	}

	


	
	
}
