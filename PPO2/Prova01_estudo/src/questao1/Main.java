package questao1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdemCompra compra1 = new OrdemCompra(123, 1, 12.5f);
		
		OrdemVenda venda1 = new OrdemVenda(122, 2, 5.9f);
		
		OrdemVenda venda2 = new OrdemVenda(123, 3, 15.5f);
		venda1.setProximo(venda2);
		OrdemVenda venda3 = new OrdemVenda(133, 4, 22.0f);
		venda2.setProximo(venda3);
		OrdemVenda venda4 = new OrdemVenda(003, 1, 1.5f);
		venda3.setProximo(venda4);
		
		venda1.imprime();
		
		
		venda1.processaCompra(compra1);
		
	}

}
