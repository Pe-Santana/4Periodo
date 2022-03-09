package Escudo;

public class Escudo {
	private Escudo sucessor;
	private int qtdescudo = 0;

	public void setSucessor(Escudo sucessor) {
		this.sucessor = sucessor;
	}

	public Escudo getSucessor() {
		return this.sucessor;
	}

	public int getQtdescudo() {
		return qtdescudo;
	}

	public void setQtdescudo(int qtdescudo) {
		this.qtdescudo = qtdescudo;
	}

	public void encadeiaEscudo(Escudo escudo) {

	}

	public int processaEscudo(int dano) {
		int valorescudo = qtdescudo;
		if ((getQtdescudo() - dano) >= 0) {
			setQtdescudo(getQtdescudo() - dano);
			System.out.println("Personagem perdeu: " + dano + " de escudo!");
			return 0;
		} else {
			if (getSucessor() == null) {
				System.out.println("Personagem perdeu: " + qtdescudo + " de escudo!");
				return (dano - valorescudo);
			} else {
				if (qtdescudo > 0)
					System.out.println("Personagem perdeu: " + qtdescudo + " de escudo!");
				valorescudo = getSucessor().processaEscudo(dano - getQtdescudo());
				return valorescudo;
			}
		}
	}
}