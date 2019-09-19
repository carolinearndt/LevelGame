package levelPieces;


import gameEngine.*;


public class Gary extends GamePiece implements Moveable {

	public Gary(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}

	public InteractionResult interact(Drawable [] pieces, int playerLocation) {
		if (Math.abs(playerLocation - getLocation() ) <= 1) {
			return InteractionResult.ADVANCE;
		}
		else {
			return InteractionResult.NONE;
		}
	}

	public void move(Drawable[] gameBoard, int playerLocation) {

		int newLocation = getLocation() -1;
		
		if (newLocation < 0 ) {
			newLocation = gameBoard.length - 1;
		}
		
		// Loops until finds a location that is not taken
		while(gameBoard[newLocation] != null ) {
			newLocation -= 1;
			if (newLocation < 0 ) {
				newLocation = gameBoard.length - 1;
			}
		}
		
		setLocation(newLocation);
	}
}
