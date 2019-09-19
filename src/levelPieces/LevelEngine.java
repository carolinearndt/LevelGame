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
	
	private int gameBoardLength = 20;
	
	
	
	public void createLevel(int levelNum){
		
	};
	public LevelEngine() {
		super();				

		Spongebob spongebob = new Spongebob('S', gameBoardLength - 1);
		Squidward squidward = new Squidward('Q', 0);
		Plankton plankton = new Plankton('p', gameBoardLength - 3);
		Gary gary = new Gary('G', gameBoardLength- 7);
		Patrick patrick = new Patrick('r', 3);
		
		movingPieces.add(squidward);
		movingPieces.add(plankton);
		movingPieces.add(gary);
		
		interactingPieces.add(spongebob);
		interactingPieces.add(patrick);
		interactingPieces.add(plankton);
		interactingPieces.add(gary);
		interactingPieces.add(squidward);
		
		
				
		gameBoard = new Drawable[gameBoardLength];

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
	
//	getBoard();
//	updateBoard(){
	// set all locations to null except rock and player
	// place in a certain order based on array list
//}
//	getMovingPieces();
//	getInteractingPieces();
//	getPlayerStartLoc();

	}
