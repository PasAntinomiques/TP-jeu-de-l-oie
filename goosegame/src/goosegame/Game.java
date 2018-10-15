package goosegame;

import java.util.ArrayList;

import board.Board;

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
		// player <- first player
		// WHILE : game not finished :
		
		// IF player can play :
		
		// score = 1d6
		// intermediary <- calculated cell
		// target <- inter.handleMove(score) 
		// ( verif excess)
		// move welcome player to target
		
		// end if
		// player <- next player
		// end while
	}
}
