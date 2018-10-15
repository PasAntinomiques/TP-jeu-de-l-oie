package goosegame;

import java.util.ArrayList;

public class Game {

	private ArrayList<Player> thePlayers;
	private Board board;
	
	/**
	 * @param board to construct a game
	 */
	public Game(Board board) {
		this.board = board;
		thePlayers = new ArrayList<Player>();
	}
	
	/**
	 * @param p the player to add to the game
	 */
	public void addPlayer(Player p) {
		thePlayers.add(p);
	}
	
	/**
	 * Do an entire game
	 */
	public void play() {
		
	}
}
