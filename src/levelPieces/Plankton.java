package levelPieces;

import java.util.Random;

import gameEngine.*;


public class Plankton extends GamePiece implements Moveable {

	public Plankton(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}
	
	public InteractionResult interact(Drawable [] pieces, int playerLocation) {
		if (Math.abs(playerLocation - getLocation() ) <= 3) {
			return InteractionResult.KILL;
		}
		else {
			return InteractionResult.NONE;
		}
	}
	
	public void move(Drawable[] gameBoard, int playerLocation) {

		Random generator = new Random();
		
		int newLocation = getLocation() + generator.nextInt(gameBoard.length);
		
		newLocation %= gameBoard.length;
		
		// Loops until finds a location that is not taken
		while(gameBoard[newLocation] != null || newLocation == playerLocation) {
			newLocation += generator.nextInt(gameBoard.length);
			newLocation %= gameBoard.length;
		}
		
		setLocation(newLocation);
	}

}
