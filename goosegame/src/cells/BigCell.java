package cells;

import java.util.LinkedList;
import java.util.List;

import goosegame.Player;

/** A cell that can hold multiple players at the same time
 * If there the the number of players reaches the max capacity, a arriving player will evict the player that entered first the BigCell
 * @author Jules
 *	
 */
public class BigCell implements Cell {
	protected LinkedList<Player> players;
	protected int capacity;
	protected int index;

	
	public BigCell(int index,int capacity) {
		this.players = new LinkedList<Player>();
		this.index = index;
		this.capacity = capacity;
	}
	
	@Override
	public boolean canBeLeft() {
		return true;
	}

	@Override
	public int getIndex() {
		return index;
	}

	@Override
	public int handleMove(int diceThrow) {
		return index;
	}

	@Override
	public boolean isBusy() {
		return this.players.size() >= this.capacity;
	}

	@Override
	public void welcomePlayer(Player newPlayer) {
		if(this.players.size() >= this.capacity) {
			// the cell is full
			Player currentPlayer = this.players.getFirst();
			Cell prevCell = newPlayer.getCell();
			this.leave(currentPlayer);
			prevCell.welcomePlayer(currentPlayer);
			this.players.addLast(newPlayer);
			newPlayer.setCell(this);
		}
		else {
			//there is room left in the cell
			this.players.addLast(newPlayer);
			newPlayer.setCell(this);
		}
		

	}

	@Override
	public void leave(Player player) {
		this.players.remove(player);

	}

	@Override
	public void nextTurn() {

	}

	@Override
	public List<Player> getPlayers() {
		return this.players;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "("+this.getIndex()+")";
	}

}
