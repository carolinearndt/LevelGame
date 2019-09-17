package levelPieces;

import gameEngine.*;

public class Spongebob extends GamePiece {
	public final static InteractionResult interaction = InteractionResult.GET_POINT;

	public Spongebob(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}
	
	public InteractionResult interact(Drawable [] pieces, int playerLocation) {
		if (Math.abs(playerLocation - getLocation() ) <= 1) {
			return InteractionResult.GET_POINT;
		}
		else {
			return InteractionResult.NONE;
		}
	}
	
	// Get point
	
}
