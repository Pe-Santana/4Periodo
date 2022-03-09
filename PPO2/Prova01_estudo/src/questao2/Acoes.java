package questao2;

import java.util.Observable;

public class Acoes extends Observable{
	private String nome;
	private float valor;
	
	
	public Acoes() {
		
	}
	
	public Acoes(String string, float f) {
		this.setNome(string);
		this.setValor(f);
		
	}
	public void imprime() {
		System.out.println(this.getNome()+":"+this.getValor());
	}
	//get set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
		setChanged();
		notifyObservers();
	}
	
	
}
