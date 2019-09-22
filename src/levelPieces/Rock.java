package levelPieces;

import gameEngine.Drawable;

public class Rock implements Drawable {
	public final static char SYMBOL = 'R';
	public final static int LOCATION = 4;
	
	
	
	public Rock() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void draw() {
		System.out.print(SYMBOL);
	}
}
