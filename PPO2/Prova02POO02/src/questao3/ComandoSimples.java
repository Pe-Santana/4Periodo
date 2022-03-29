package questao3;

public class ComandoSimples implements Programa{
	
	private String nome;

	
	public ComandoSimples(String nome) {
		this.setNome(nome);
	}
	public void execute() {
		System.out.println(nome);
	}
	//get set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
