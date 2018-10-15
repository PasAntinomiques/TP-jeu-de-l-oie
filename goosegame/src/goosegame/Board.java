package goosegame;

import cells.Cell;

public abstract class Board {
	private final int nbOfCells;
	Cell theCells;
	
	public Board(int nbOfCells) {
		this.nbOfCells = nbOfCells;
	}
	
	/**
	 * Create all cell of the game
	 */
	/**
	 * 
	 */
	public void initBoard() {}

	/**
	 * @return
	 */
	public int getNbOfCells() {
		return nbOfCells;
	}

	/**
	 * @return
	 */
	public Cell getTheCells() {
		return theCells;
	}
	
	
}
