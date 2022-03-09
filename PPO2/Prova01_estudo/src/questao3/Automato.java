package questao3;

public class Automato {

	private String cadeia;
	private Estado estado;
	
	
	public Automato(String cadeia) {
		this.setCadeia(cadeia);
		this.estado = new S1();
	}
	
	
	//get set
	public String getCadeia() {
		return cadeia;
	}
	public void setCadeia(String cadeia) {
		this.cadeia = cadeia;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}
