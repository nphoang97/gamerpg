package game.object;

import java.awt.image.BufferedImage;

public class Object {
	protected Boolean visible;
	protected Boolean solid;
	protected BufferedImage img;
	protected int x;
	protected int y;
	
	public void setVisible(Boolean a) {
		visible = a;
	}
	public void setSolid(Boolean a) {
		solid = a;
	}
	public void setImg(BufferedImage i) {
		img = i;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
