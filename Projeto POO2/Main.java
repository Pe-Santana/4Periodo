import AcoesPersonagem.Ataque;
import AcoesPersonagem.AtaqueForte;
import AcoesPersonagem.BonusDanoForte;
import AcoesPersonagem.BonusDanoFraco;
import Escudo.EscudoForte;
import Escudo.EscudoMedio;
import Inimigo.Game;
import Personagem.PersonagemA;
public class Main {

	public static void main(String[] args) throws InterruptedException {

		//PersonagemA pa= new PersonagemA(10, 10);
		// PersonagemB pb= new PersonagemB();
		// PersonagemC pc= new PersonagemC();

		/*
		 * Testes Pratica 1 
		 * System.out.println("Testanto PersonagemA:"); pa.atacar();
		 * pa.correr(); pa.pular(); System.out.println("FIM TESTE PersonagemA:");
		 * System.out.println("---------------------------");
		 * 
		 * System.out.println("Testanto PersonagemB:"); pb.atacar(); pb.correr();
		 * pb.pular(); System.out.println("FIM TESTE PersonagemB:");
		 * System.out.println("---------------------------");
		 * 
		 * System.out.println("Testanto PersonagemC:"); pc.atacar(); pc.correr();
		 * pc.pular(); System.out.println("FIM TESTE PersonagemC:");
		 * System.out.println("---------------------------");
		 */

		/*
		 * testes pratica 2 
		 * System.out.println("Testanto PersonagemA:"); pa.atacar();
		 * pa.correr(); pa.pular(); System.out.println("vida:"+ pa.getVida());
		 * System.out.println("Estado:"+ pa.getEstado());
		 * System.out.println("FIM TESTE PersonagemA:");
		 * System.out.println("---------------------------");
		 * 
		 * System.out.println("---------------------------");
		 * System.out.println("Personagem A recupera 10 de vida");
		 * pa.getEstado().recuperarVida(10);
		 * System.out.println("---------------------------");
		 * 
		 * System.out.println("Testanto PersonagemA:"); pa.atacar(); pa.correr();
		 * pa.pular(); System.out.println("vida:"+ pa.getVida());
		 * System.out.println("Estado:"+ pa.getEstado());
		 * System.out.println("FIM TESTE PersonagemA:");
		 * System.out.println("---------------------------");
		 * 
		 * System.out.println("---------------------------");
		 * System.out.println("Personagem A perde 60 de vida");
		 * pa.getEstado().levarDano(60);
		 * System.out.println("---------------------------");
		 * 
		 * System.out.println("Testanto PersonagemA:"); pa.atacar(); pa.correr();
		 * pa.pular(); System.out.println("vida:"+ pa.getVida());
		 * System.out.println("Estado:"+ pa.getEstado());
		 * System.out.println("FIM TESTE PersonagemA:");
		 * System.out.println("---------------------------");
		 * 
		 * System.out.println("---------------------------");
		 * System.out.println("Personagem A perde 20 de vida");
		 * pa.getEstado().levarDano(20);
		 * System.out.println("---------------------------");
		 * 
		 * System.out.println("Testanto PersonagemA:"); pa.atacar(); pa.correr();
		 * pa.pular(); System.out.println("vida:"+ pa.getVida());
		 * System.out.println("Estado:"+ pa.getEstado());
		 * System.out.println("FIM TESTE PersonagemA:");
		 * System.out.println("---------------------------");
		 */
		
		//teste pratica 3
		//Game teste = new Game();
		//teste.jogar(teste);
		
		//teste pratica 4
		//PersonagemA pa= new PersonagemA(20, 20);
		//EscudoForte teste = new EscudoForte();
		//EscudoMedio teste2 = new EscudoMedio();
		
		//pa.getEscudo1().setSucessor(teste);
		//teste.setSucessor(teste2);
		//pa.getEstado().levarDano(45);
		
		//teste pratica 5
		Ataque ataque = new AtaqueForte();
		ataque.atacar();
		ataque = new BonusDanoFraco(ataque);
		ataque.atacar();
		ataque = new BonusDanoForte(ataque);
		ataque.atacar();
		ataque = new AtaqueForte();
		ataque.atacar();
		}
}