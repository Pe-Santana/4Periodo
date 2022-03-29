package fases;

import main.Game;

public class Fase implements Mundo{
	
	private String nome;
	private Mundo opcao1;
	private Mundo opcao2;
	private int inimigoQtd;
	private int velocidade;
	
	
	public Fase( int inimigoQtd, int velocidade, String nome, Mundo opcao1, Mundo opcao2 ) {
		super();
		this.nome = nome;
		this.opcao1 = opcao1;
		this.opcao2 = opcao2;
		this.inimigoQtd = inimigoQtd;
		this.velocidade = velocidade;
	}
	
	public void avanca(Game game) throws Exception{
		double valor = Math.random();
		game.jogar(game);
		if (valor < 0.5) {
			
			opcao1.avanca(game);
			System.out.println("foi tomado a 1ª opção.");
		}else {
			opcao2.avanca(game);
			System.out.println("foi tomado a 2ª opção.");
		}
	}

	// get set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Mundo getOpcao1() {
		return opcao1;
	}

	public void setOpcao1(Mundo opcao1) {
		this.opcao1 = opcao1;
	}

	public Mundo getOpcao2() {
		return opcao2;
	}

	public void setOpcao2(Mundo opcao2) {
		this.opcao2 = opcao2;
	}

	public int getInimigoQtd() {
		return inimigoQtd;
	}

	public void setInimigoQtd(int inimigoQtd) {
		this.inimigoQtd = inimigoQtd;
	}


	
	

}
