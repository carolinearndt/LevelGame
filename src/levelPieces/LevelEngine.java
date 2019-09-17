package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelEngine {
	// make game pieces
	// rock, Get_point: Spongebob, HIT: Squidward, KILL: Plankton, ADVANCE: Gary, NONE: Patrick
	
	
	private Drawable [] gameBoard;
	// Only some pieces can move.
	private ArrayList<Moveable> movingPieces;
	// Only game pieces interact
	private ArrayList<GamePiece> interactingPieces;
	// Player keeps track of player status and controls player movement/location
	
	
	
	public void createLevel(int levelNum){
		
	};
	public LevelEngine() {
		super();
		gameBoard = new Drawable[7];
		movingPieces.add(new Squidward('Q', 0));
		interactingPieces.add(new Spongebob('S', gameBoard.length));
		interactingPieces.add(new Squidward('Q', 0));
		
		levelOne();
	}
	
	private void levelOne() {
		Rock rock = new Rock();
		gameBoard[Rock.LOCATION] = rock;
		for (int i = 0; i < gameBoard.length; i++) {
			if (i == Rock.LOCATION) {
				continue;
			}
			for (int j = 0; j < interactingPieces.size(); j++) {
				if (i == interactingPieces.get(j).getLocation()) {
					gameBoard[i] = interactingPieces.get(j);
				}
				else {
					gameBoard[i] = null;
				}
			}
		}
	}
	getBoard();
	getMovingPieces();
	getInteractingPieces();
	getPlayerStartLoc();

	}
