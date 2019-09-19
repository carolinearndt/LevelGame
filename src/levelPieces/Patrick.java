package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Patrick extends GamePiece{

	public Patrick(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}
	
	public InteractionResult interact(Drawable [] pieces, int playerLocation) {
		
		if (Math.abs(playerLocation - getLocation()) <= 1) {
			System.out.println("Is mayonnaise an instrument?");
		}
		return InteractionResult.NONE;	
	}

	
}
