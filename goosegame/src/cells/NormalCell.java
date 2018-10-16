package cells;

import goosegame.Player;

public class NormalCell implements Cell {
	protected Player player;
	protected int index;
	
	public NormalCell(int i) {
		this.index = i;
	}

	@Override
	public boolean canBeLeft() {
		return true;
	}

	@Override
	public int getIndex() {
		return this.index;
	}

	@Override
	public int handleMove(int diceThrow) {
		return this.index;
	}

	@Override
	public boolean isBusy() {
		return ! (this.player == null);
	}

	@Override
	public void welcomePlayer(Player newPlayer) {
		Player currentPlayer = this.player;
		Cell prevCell = newPlayer.getCell();
		
		prevCell.leave(newPlayer);
		if(currentPlayer != null) {
			this.leave(currentPlayer);
			prevCell.welcomePlayer(currentPlayer);
		}
		this.player = newPlayer;
		newPlayer.setCell(this);
	}
	

	@Override
	public Player getPlayer() {
		return this.player;
	}

	@Override
	public void leave(Player player) {
		assert player == this.player; //you can't leave if you're not here
		this.player = null;
	}

	@Override
	public void nextTurn() {	
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "("+this.getIndex()+")";
	}

}
