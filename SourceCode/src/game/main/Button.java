package game.main;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

public class Button extends JComponent {
	
	private BufferedImage img;
	
	public Button(BufferedImage i, MouseAdapter m) {
		img = i;
		addMouseListener(m);
		setSize(200, 300);
		setVisible(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, null);
	}
}

