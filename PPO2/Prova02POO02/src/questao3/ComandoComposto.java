package questao3;

import java.util.ArrayList;

public class ComandoComposto implements Programa {

    private ArrayList<Programa> prog = new ArrayList<Programa>();

	
	public ComandoComposto(ArrayList<Programa> p) {
			this.prog = p;
	}
	
	public void execute() {
        for (Programa p : prog)
            p.execute();
	}



	
	
}
