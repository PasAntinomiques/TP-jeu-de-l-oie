package cells;

import goosegame.Player;

public class NormalCell implements Cell {
	protected Player player;
	protected int index;
	
	/**
	 * @param i create a cell of i index
	 */
	public NormalCell(int i) {
		this.index = i;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#canBeLeft()
	 */
	@Override
	public boolean canBeLeft() {
		return true;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#getIndex()
	 */
	@Override
	public int getIndex() {
		return this.index;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#handleMove(int)
	 */
	@Override
	public int handleMove(int diceThrow) {
		return this.index;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#isBusy()
	 */
	@Override
	public boolean isBusy() {
		return ! (this.player == null);
	}

	/* 
	 * welcome a player on a cell
	 * manage the dual pointer (a cell has a player and a player has a cell)
	 */
	@Override
	public void welcomePlayer(Player newPlayer) {
		Player currentPlayer = this.player;
		Cell prevCell = newPlayer.getCell();
		if(currentPlayer != null) {
			this.leave(currentPlayer);
			prevCell.welcomePlayer(currentPlayer);
		}
		this.player = newPlayer;
		newPlayer.setCell(this);
	}
	

	/* (non-Javadoc)
	 * @see cells.Cell#getPlayer()
	 */
	@Override
	public Player getPlayer() {
		return this.player;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#leave(goosegame.Player)
	 */
	@Override
	public void leave(Player player) {
		assert player == this.player; //you can't leave if you're not here
		this.player = null;
	}

	/* (non-Javadoc)
	 * @see cells.Cell#nextTurn()
	 */
	@Override
	public void nextTurn() {	
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.getClass().getSimpleName() + "("+this.getIndex()+")";
	}

}
