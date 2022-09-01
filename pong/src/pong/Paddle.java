import java.awt.Color;

public class Paddle extends Sprite {
	
	private static final Color PADDLE_COLOUR = Color.BLUE;
	private static final int PADDLE_HEIGHT = 50;   //reduced paddle size
	private static final int PADDLE_WIDTH = 30;    //increased paddle width
	private static final int PADDLE_DISTANCE_EDGE = 40;
	
	public Paddle(Player player, int panelWidth, int panelHeight) {
		
		setWidth( PADDLE_WIDTH);
		setHeight( PADDLE_HEIGHT);
		setColour( PADDLE_COLOUR);
		int xPos;
		if(player == Player.One) {
			xPos = PADDLE_DISTANCE_EDGE;
		} else {
			xPos = panelWidth - PADDLE_DISTANCE_EDGE - getWidth();
		}
		
		setInitialPosition(xPos, panelHeight / 2 - (getHeight() / 2));
		resetToInitialPosition();
	}

}
