package main;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controle.*;
import inimigo.Chefe;
import inimigo.Goblin;
import inimigo.Inimigo;
import inimigo.Orc;
import personagem.Personagem;
import escudo.*;
import factory.SimpleInimigoFactory;
import factory.SimplePersonagemFactory;
import fases.EndGame;
import fases.Fase;
import fases.Mundo;
import habilidades.PoderAtqMedio;

public class Game extends JPanel {
	private Personagem personagem;
    private ArrayList<Inimigo> inimigo = new ArrayList<Inimigo>();
	private Inimigo orc;
	private Inimigo gob;
	private Inimigo chefe;
	private Mundo fases = new Fase(4, 4, "1ª fase.", new Fase(5, 4, "2ª fase.", new EndGame(), new EndGame()), new Fase(7, 3, "2 ªFase", new EndGame(), new EndGame()));
	private Controle controle = new Controle();
	private Macro golpeDash = new Macro();
	
	public Game() {
		KeyListener listener = new MyKeyListener();
		addKeyListener(listener);
		setFocusable(true);
	}

	public class MyKeyListener implements KeyListener{
		
		public void keyPressed(KeyEvent e) {
			
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				controle.pressionar(2);
			
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				controle.pressionar(3);
			
			if (e.getKeyCode() == KeyEvent.VK_UP)
				controle.pressionar(0);
			
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				controle.pressionar(1);
			
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				controle.pressionar(4);
			}
			if (e.getKeyCode() == KeyEvent.VK_Z) {
				controle.pressionar(5);
			}

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}


	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//" makes the borders of the figures smoother

		g2d.setColor(Color.BLACK);
		g2d.fillOval(personagem.getPosX(), personagem.getPosY(), 20, 20);

		g2d.setColor(Color.GREEN);
		g2d.fillOval(chefe.getPosX(), chefe.getPosY(), 30, 30);

		g2d.setColor(Color.RED);
		g2d.fillOval(orc.getPosX(), orc.getPosY(), 20, 20);

		g2d.setColor(Color.BLUE);
		g2d.fillOval(gob.getPosX(), gob.getPosY(), 10, 10);
		
		g2d.setColor(Color.RED);
		g2d.fillRect(53, 53, 5, 5);
		
		g2d.drawString("vida:"+personagem.getLife(), 450, 450);
		g2d.drawString("inimigos Restantes:"+ personagem.countObservers(), 450, 475);
	}
		
		
	public void jogar(Game game) throws InterruptedException {
		JFrame frame = new JFrame("Teste");
		frame.add(game);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//personagem = SimplePersonagemFactory.createPersonagem();
		personagem = new Personagem(250,250);
		orc = SimpleInimigoFactory.createInimigo(2, 100, 150);
		gob = SimpleInimigoFactory.createInimigo(4, 50, 150);
		chefe = SimpleInimigoFactory.createInimigo(1, 200, 150);
		
		inimigo.add(chefe);
		inimigo.add(orc);
		inimigo.add(gob);
		
		
		controle.setCommand(new Cima(personagem), 0);
		controle.setCommand(new Baixo(personagem), 1);
		controle.setCommand(new Esquerda(personagem), 2);
		controle.setCommand(new Direita(personagem), 3);
		controle.setCommand(new Ataque(personagem, inimigo), 4);
		controle.setCommand(golpeDash, 5);
		golpeDash.add(new Ataque(personagem, inimigo));
		golpeDash.add(new Direita(personagem));
		golpeDash.add(new Direita(personagem));
		golpeDash.add(new Direita(personagem));
		
		
		
		personagem.addObserver(chefe);
		personagem.addObserver(orc);
		personagem.addObserver(gob);
		
		Escudo escudo1 = new EscudoFraco();
		Escudo escudo3 = new EscudoForte();
		
		PoderAtqMedio poder1 = new PoderAtqMedio(personagem.getA());
		personagem.setA(poder1);
		
		
		personagem.ganhaEscudo(escudo1);
		
		while (personagem.getLife() > 0) {
			personagem.show();
			game.repaint();
			Thread.sleep(100);
			
			if (personagem.getPosX() == 50 && personagem.getPosY() == 50) {
				personagem.ganhaEscudo(escudo3);
				System.out.println(personagem.getEscudo());
			}
			System.out.println(personagem.getPosX()+"|"+personagem.getPosY());
			System.out.println(personagem.getLife()+ "de vida");
		}
	}
	
	
	
	
	
	
}
