package escudo;

public class Escudo {
	
	private Escudo proximo;
	private int def;
	
	
	public int absorveDano(int dano) {
		
		if ((getDef() - dano) > 0 ){
			setDef(getDef() - dano);
			System.out.println("Personagem perdeu: " + dano + " de escudo!");
			return 0;
			
		} else if ((getDef() - dano) == 0 ){
			System.out.println("Personagem perdeu um escudo!");
			this.getProximo();
			return 0;
		}else if (this.proximo != null ){
			System.out.println("Personagem perdeu um escudo!");
			int resto =  dano - this.getDef();
			return this.getProximo().absorveDano(resto);
		} else if(this.proximo == null) {
			System.out.println("Personagem perdeu seu último escudo!");
			int resto =  dano - this.getDef();
			this.getProximo();
			return resto;
		}
		return 0;
	}
	
	//get set
	public Escudo getProximo() {
		return proximo;
	}
	public void setProximo(Escudo proximo) {
		this.proximo = proximo;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	

}
