package Inimigo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Personagem.PersonagemA;

@SuppressWarnings("serial")
public class Game extends JPanel {
	private PersonagemA personagem;
	private InimigoFraco i1;
	private InimigoMedio i2;
	private InimigoForte i3;

	public Game() {
		KeyListener listener = new MyKeyListener();
		addKeyListener(listener);
		setFocusable(true);
	}

	public class MyKeyListener implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				personagem.setX(personagem.getX() - 10);
			
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				personagem.setX(personagem.getX() + 10);

			if (e.getKeyCode() == KeyEvent.VK_UP)
				personagem.setY(personagem.getY() - 10);

			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				personagem.setY(personagem.getY() + 10);

		}

		public void keyReleased(KeyEvent e) {
			// System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//" makes the borders of the figures smoother

		g2d.setColor(Color.BLACK);
		g2d.fillOval(personagem.getX(), personagem.getY(), 20, 20);

		g2d.setColor(Color.GREEN);
		g2d.fillOval(i1.getX(), i1.getY(), 20, 20);

		g2d.setColor(Color.RED);
		g2d.fillOval(i2.getX(), i2.getY(), 20, 20);

		g2d.setColor(Color.WHITE);
		g2d.fillOval(i3.getX(), i3.getY(), 20, 20);

	}

	@SuppressWarnings("deprecation")
	public void jogar(Game game) throws InterruptedException {
		JFrame frame = new JFrame("Teste");
		frame.add(game);
		frame.setSize(700, 700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		personagem = new PersonagemA(250, 250);
		i1 = new InimigoFraco(10, 450);
		i2 = new InimigoMedio(400, 20);
		i3 = new InimigoForte(50, 50);

		personagem.addObserver(i1);
		personagem.addObserver(i2);
		personagem.addObserver(i3);

		while (true) {
			personagem.show();
			game.repaint();
			Thread.sleep(50);
		}
	}
}
