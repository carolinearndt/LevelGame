package levelPieces;
import gameEngine.*;
import java.util.Random;

public class Squidward extends GamePiece implements Moveable {

	public Squidward(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}
	
	public InteractionResult interact(Drawable [] pieces, int playerLocation) {
		if (Math.abs(playerLocation - getLocation() ) <= 1) {
			return InteractionResult.HIT;
		}
		else {
			return InteractionResult.NONE;
		}
	}
	
	public void move(Drawable[] gameBoard, int playerLocation) {

		Random generator = new Random();
		
		int newLocation = generator.nextInt(gameBoard.length);
		
		// Loops until finds a location that is not taken
		while(gameBoard[newLocation] != null ) {
			newLocation = generator.nextInt(gameBoard.length);
		}
	}
}
