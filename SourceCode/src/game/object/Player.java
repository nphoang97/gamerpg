package game.object;

public class Player extends Actor{
	private Animation moveLeft;
	private Animation moveRight;
	private Animation moveUp;
	private Animation moveDown;
	public void iniAnimation() {
		
	}
	public Player() {
	}
	public void moveLeft() {
		x = x - speed;
	}
	public void moveRight() {
		x = x + speed;
	}
	public void moveDown() {
		y = y + speed;
	}
	public void moveUp() {
		y = y - speed;
	}
}
