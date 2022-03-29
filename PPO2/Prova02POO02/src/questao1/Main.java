package questao1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fornecedor coca = new Fornecedor("Coca-Cola");
		Estoque refrigerante = new Estoque(coca);
		
		
		Command solicita = new PedidoReposicao(coca);
		
		DepCompras departamento = new DepCompras(refrigerante);
		
		departamento.setCommand(solicita);
		
		departamento.pedidoReposicao();
		
		refrigerante.setQtd(18); // abaixo do valor critico de estoque 
		
		departamento.pedidoReposicao();
		
	}

}
