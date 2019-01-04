import java.awt.*;

public class Loop extends GameDriverV3 {

	public Loop() {
		super();
	}

	@Override
	public void draw(Graphics2D win) {
		win.setColor(Color.BLACK);
		win.fillRect(0, 0, 1200, 800);
	}

}
