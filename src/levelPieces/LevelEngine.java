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
	//private ArrayList<Drawable> piecesOnBoard; 
	// Player keeps track of player status and controls player movement/location
	private int playerStartingLocation;
	private int gameBoardLength;
	
	
	
	public void createLevel(int levelNum){
		if (levelNum == 1) {
			levelOne();
		}
		else {
			levelTwo();
		}
	};
	public LevelEngine() {
		super();				

		
		movingPieces = new ArrayList<Moveable>();
		interactingPieces = new ArrayList<GamePiece>();
		gameBoardLength = 20;
		playerStartingLocation = gameBoardLength/2;
		//piecesOnBoard = new ArrayList<Drawable>();
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
		interactingPieces.add(squidward);
		interactingPieces.add(plankton);
		interactingPieces.add(gary);
		
		//piecesOnBoard.add(squidward);
		
		
		
				
		gameBoard = new Drawable[gameBoardLength];

	}
	
	private void levelOne() {
		Rock rock = new Rock();
		gameBoard[Rock.LOCATION] = rock;
		for (GamePiece g: interactingPieces) {
			gameBoard[g.getLocation()] = g;
		}
	}
	private void levelTwo() {
		movingPieces.clear();
		interactingPieces.clear();
		
		gameBoardLength = 25;
		playerStartingLocation = gameBoardLength/2;
		gameBoard = new Drawable [gameBoardLength];
		
		Squidward squid1 = new Squidward('Q', 18);
		Squidward squid2 = new Squidward('Q', 2);
		Plankton plankton1 = new Plankton('p', 3);
		Plankton plankton2 = new Plankton('p', 19);
		Gary gary = new Gary('G', 8);
		Spongebob spongebob = new Spongebob('S', 24);
		Patrick patrick = new Patrick('r', 15);
		
		movingPieces.add(squid1);
		movingPieces.add(squid2);
		movingPieces.add(plankton1);
		movingPieces.add(plankton2);
		movingPieces.add(gary);
		
		interactingPieces.add(spongebob);
		interactingPieces.add(patrick);
		interactingPieces.add(squid1);
		interactingPieces.add(squid2);
		interactingPieces.add(plankton1);
		interactingPieces.add(plankton2);
		interactingPieces.add(gary);
		
		Rock rock = new Rock();
		gameBoard[Rock.LOCATION] = rock;
		for (GamePiece g: interactingPieces) {
			gameBoard[g.getLocation()] = g;
		}
		
		
	}
	
	public Drawable [] getBoard(){
		return gameBoard;
	}
	;
	
	public ArrayList<Moveable> getMovingPieces(){
		return movingPieces;
	};
	public ArrayList<GamePiece> getInteractingPieces(){
		return interactingPieces;
	};
	public int getPlayerStartLoc() {
		return playerStartingLocation;
	};
	
}
