package main;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import inimigo.Chefe;
import inimigo.Goblin;
import inimigo.Orc;
import personagem.Personagem;
import escudo.*;
import habilidades.PoderAtqMedio;

public class Game extends JPanel {
	private Personagem personagem;
	private Orc orc;
	private Goblin gob;
	private Chefe chefe;
	
	public Game() {
		KeyListener listener = new MyKeyListener();
		addKeyListener(listener);
		setFocusable(true);
	}

	public class MyKeyListener implements KeyListener{
		
		public void keyPressed(KeyEvent e) {
			
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				personagem.setPosX(personagem.getPosX() - 1);
			
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				personagem.setPosX(personagem.getPosX() + 1);
			
			if (e.getKeyCode() == KeyEvent.VK_UP)
				personagem.setPosY(personagem.getPosY() - 1);
			
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				personagem.setPosY(personagem.getPosY() + 1);
			
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				personagem.hita(gob);
				personagem.hita(chefe);
				personagem.hita(orc);
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

		personagem = new Personagem(200,50);
		chefe = new Chefe(10, 50);
		orc = new Orc(40, 9);
		gob = new Goblin(20, 20);

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
