package game.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Window extends JFrame implements ActionListener{
	private Board board;
	public Window() {
		getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		Timer time = new Timer(40, this);
		time.start();
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		setSize(800, 600);
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(664, 81, 88, 37);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pause");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(664, 201, 88, 37);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(664, 295, 88, 37);
		getContentPane().add(btnNewButton_2);
	}

	public void intiStart() {
	}
	
	public void intiLoad() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
