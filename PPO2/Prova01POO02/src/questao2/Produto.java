package questao2;

public class Produto {
	
	private String nome;
	private Estado estado = new Indisponivel(this);
	private float valor;
	private int qtd;
	
	public Produto(String nome) {
		this.setNome(nome);
	}
	
	public void compra(int qtd) {
		this.getEstado().compra(qtd);
	}
	public void venda(int qtd) {
		this.getEstado().venda(qtd);
	}
	//get set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
}
