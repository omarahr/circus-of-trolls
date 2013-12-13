import java.awt.Color;


public class Shape {
	Color c = Color.BLACK;
	int posX;
	int posY;
	ShapeState falling;
	ShapeState onTheLine;
	ShapeState withPlayer;
	ShapeState notVisual;
	ShapeState currentState;
	
	/* 
	 * every shape has [as i think] 7 states
	 * 1- in the pool and not visual on the screen
	 * 2- on the line belt
	 * 3- falling in free motion
	 * 4- a player hold it 
	 * 		a) with player1 right hand 4
	 * 		b) with player1 left  hand 5
	 * 		c) with player2 right hand 6
	 * 		d) with player2 left  hand 7
	 */
	public Shape(Color c,int x,int y) {
		this.c = c;
		posX = x;
		posY = y;
		falling    = new ShapeFalling(this);
		onTheLine  = new ShapeOnTheLine(this);
		withPlayer = new ShapeWithPlayer(this);
		notVisual  = new ShapeNotVisual(this);
		currentState = notVisual;
	}
	
	
	public int getPostionX() { return posX;}
	public int getPostionY() { return posY;}
	public Color getColor()  { return 	 c;}
	
	public void setPostionX(int x) { posX = x;}
	public void setPostionY(int y) { posY = y;}
	public void setColor(Color color)  { c = color ;}
}
