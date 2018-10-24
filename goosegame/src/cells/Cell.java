package cells;

import java.util.List;

import goosegame.Player;

/**
 * Interface for the cells of the "jeu de l'oie" game. 
 */
public interface Cell {
	
	/**
	 * @return <tt>true</tt> if and only if the player in this cell can freely
	 *  leaves the cell, else he must wait for another player to reach this cell 
	 *  or wait a given number of turns
	 */
	public boolean canBeLeft();

	/** returns the index of this cell
	 * @return the index of the cell */
	public int getIndex();

	  /**
     * returns the index of the cell really reached by a player when the player
     *    reaches this cell.  For normal cells, the returned value equals
     *   <code>getIndex()</code> and is thus independent from
     *   <code>diceThrow</code>.
     * @param diceThrow the result of the dice when the player reaches this cell
     * @return the index of the actual cell where the player eventually
     * arrives when the given throw of dice sends the player in this cell
     */
	public int handleMove(int diceThrow);

	/** returns <tt>true</tt> if a player is in this cell 
	 * @return if the cell is busy*/
	public boolean isBusy();

	 /**  handles what happens when a player arrives in this cell 
     * @param player the new player in the cell
     */
	public void welcomePlayer(Player player);
	
	/**
	 * Handles a player leaving a cell
	 * @param player : the player leaving
	 */
	public void leave(Player player);
	
	/**
	 * Notifies the cell the game passes to a new turn
	 */
	public void nextTurn();

	/** gets the player in this cell <tt>null</tt> if none
	 * @return list of current players in the cell */
	public List<Player> getPlayers();
	
	public String toString();
}// Cell
