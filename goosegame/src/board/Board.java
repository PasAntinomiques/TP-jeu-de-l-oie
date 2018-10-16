package board;

import cells.Cell;

public abstract class Board {
	
	protected final int nbOfCells;
	protected Cell[] theCells;
	protected Cell startCell;
	protected Cell endCell;
	
	public Cell getEndCell() {
		return endCell;
	}
	public Cell getStartCell() {
		return startCell;
	}

	public Board(int nbOfCells) {
		this.nbOfCells = nbOfCells + 1;
		theCells = new Cell[nbOfCells + 1];
		this.initBoard();
	}
	
	/**
	 * Create all cell of the game
	 */
	/**
	 * 
	 */
	protected abstract void initBoard();

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
