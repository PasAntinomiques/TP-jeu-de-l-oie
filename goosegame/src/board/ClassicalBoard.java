package board;

import cells.Cell;
import cells.GooseCell;
import cells.NormalCell;
import cells.StartCell;
import cells.TeleportCell;
import cells.TrapCell;
import cells.WaitCell;

public class ClassicalBoard extends Board {

	public ClassicalBoard(int nbOfCells) {
		super(nbOfCells);
	}
	
	
	
	protected void initBoard() {
		this.theCells = new Cell[nbOfCells];
		for(int i = 1; i <= nbOfCells; i++) {
			
			//cases de l'oie
			if(i == 9 || i == 18 || i == 27 ||i == 36 || i == 45 
					|| i == 54) {
				this.theCells[i] = new GooseCell(i);
			}
			else if (i == 31 || i == 52) {
				this.theCells[i] = new TrapCell(i);
			}
			else if (i == 19) {
				this.theCells[i] = new WaitCell(i, 2);
			}
			else if (i == 6) {
				this.theCells[i] = new TeleportCell(i, 12);
			}
			else if (i == 42) {
				this.theCells[i] = new TeleportCell(i, 30);
			}
			else if (i == 58) {
				this.theCells[i] = new TeleportCell(i, 1);
			}
			else {
				this.theCells[i] = new NormalCell(i);
			}
		}
		this.theCells[0] = new StartCell(0);
		
	}

}
