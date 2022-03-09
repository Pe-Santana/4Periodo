package questao3;

public class Forma {
	private String descricao;

	
	
	public String desenhar() {
		return this.getDescricao();	
	}
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
