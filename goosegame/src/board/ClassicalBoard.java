package board;

import cells.BigCell;
import cells.GooseCell;
import cells.NormalCell;
import cells.StartCell;
import cells.TeleportCell;
import cells.TrapCell;
import cells.WaitCell;

public class ClassicalBoard extends Board {

	/**
	 * Create a board with 63 cells plus the start cell
	 */
	public ClassicalBoard() {
		super(63);
	}
	
	/* (non-Javadoc)
	 * @see board.Board#initBoard()
	 */
	protected void initBoard() {
		//this.theCells = new Cell[nbOfCells];
		this.theCells[0] = new StartCell(0);
		this.startCell = this.theCells[0];
		for(int i = 1; i < nbOfCells; i++) {
			
			//Goose cells
			if(i == 9 || i == 18 || i == 27 ||i == 36 || i == 45 
					|| i == 54) {
				this.theCells[i] = new GooseCell(i);
			}
			//Trap cells
			else if (i == 31 || i == 52) {
				this.theCells[i] = new TrapCell(i);
			}
			//Wait cells
			else if (i == 19) {
				this.theCells[i] = new WaitCell(i, 2);
			}
			//Teleport cells
			else if (i == 6) {
				this.theCells[i] = new TeleportCell(i, 12);
			}
			else if (i == 42) {
				this.theCells[i] = new TeleportCell(i, 30);
			}
			else if (i == 58) {
				this.theCells[i] = new TeleportCell(i, 1);
			}
			else if(i == 10 || i == 20 || i == 30 ) 
				this.theCells[i] = new BigCell(i,2);
			//Normal cells
			else {
				this.theCells[i] = new NormalCell(i);
			}
		}
		this.endCell = new NormalCell(63);
	}
	
}
