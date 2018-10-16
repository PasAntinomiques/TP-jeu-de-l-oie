package board;

import cells.Cell;

public abstract class Board {
	
	protected final int nbOfCells;
	protected Cell[] theCells;
	protected Cell endCell;
	
	public Cell getEndCell() {
		return endCell;
	}

	public Board(int nbOfCells) {
		this.nbOfCells = nbOfCells;
		theCells = new Cell[nbOfCells];
		this.initBoard();
	}
	
	/**
	 * Create all cell of the game
	 */
	/**
	 * 
	 */
	protected void initBoard() {
		
	}

	/**
	 * @return
	 */
	public int getNbOfCells() {
		return nbOfCells;
	}

	/**
	 * @return
	 */
	public Cell[] getTheCells() {
		return theCells;
	}
	
	public Cell getCell(int i) {
		return this.theCells[i];
	}
	
	public void nextTurn() {
		for(Cell c : this.theCells) {
			c.nextTurn();
		}
	}
	
	
}
