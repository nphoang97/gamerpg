package game.object;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Animation {
	private int fps;
	private ArrayList<BufferedImage>  img;
	private int cur;
	private int count;
	
	public Animation(int fpsArg) {
		img = new ArrayList<>();
		fps = fpsArg;
		cur = 0;
		count = 1;
	}
	
	public void add(BufferedImage i) {
		img.add(i);
	}
	
	public BufferedImage show() {
		count ++;
		if(count == Math.round(1000 / (4 * fps)))
			cur = (cur + 1) / img.size();
		return img.get(cur);
		
	}
}
