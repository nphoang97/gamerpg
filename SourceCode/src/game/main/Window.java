package game.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Window extends JFrame{
	Board board;
	BoardGUI boardGui;
	Button start;
	Button exit;
	
	public Window() {
		
		iniWindow();
		prepareGUI();
		iniEvent();
	}
	
	public void iniWindow() {
		try {
			start = new Button(ImageIO.read(new File("img/start.png")), new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					board = new Board();
					boardGui = new BoardGUI();
				}
			});
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		start.setLocation(600, 0);
		
		try {
			exit = new Button(ImageIO.read(new File("img/end.png")), new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					System.exit(-1);
				}
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		exit.setLocation(600, 300);
	}
	
	public void prepareGUI() {
		setSize(800, 605);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		add(exit);
		add(start);
	}
	
	public void iniEvent() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		addActionListener(new ActionAdapter() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	public static void main(String[] args) {
		new Window();
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000, 1000);
	}
}

class ActionAdapter implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}