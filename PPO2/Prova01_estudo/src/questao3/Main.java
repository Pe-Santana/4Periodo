package questao3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Automato auto = new Automato("aaacdb");
		
		auto.getEstado().percorreCadeia(auto.getCadeia());
		
		System.out.println(auto.getEstado());
		

	}



}
