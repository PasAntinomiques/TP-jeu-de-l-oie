package board;

import cells.Cell;

public abstract class Board {
	
	protected final int nbOfCells;
	protected Cell[] theCells;
	protected Cell startCell;
	protected Cell endCell;
	
	/**
	 * @return the end cell of the board
	 */
	public Cell getEndCell() {
		return endCell;
	}
	/**
	 * @return the start cell of board
	 */
	public Cell getStartCell() {
		return startCell;
	}

	/**
	 * @param nbOfCells number of cell without the start cell
	 */
	public Board(int nbOfCells) {
		this.nbOfCells = nbOfCells + 1;
		theCells = new Cell[nbOfCells + 1];
		this.initBoard();
	}
	
	/**
	 * Create all cell of the game
	 */
	protected abstract void initBoard();

	/**
	 * @return the number of cells of the board
	 */
	public int getNbOfCells() {
		return nbOfCells;
	}

	/**
	 * @return the list of cells of the game 
	 */
	public Cell[] getTheCells() {
		return theCells;
	}
	
	/**
	 * @param i 
	 * @return the i_th cells of the game
	 */
	public Cell getCell(int i) {
		return this.theCells[i];
	}
	
	/**
	 * Call the method nexturn for each cell of the board
	 */
	public void nextTurn() {
		for(Cell c : this.theCells) {
			c.nextTurn();
		}
	}

	
	
	
}
