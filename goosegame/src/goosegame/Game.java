package goosegame;

import java.util.ArrayList;

public class Game {

	private ArrayList<Player> thePlayers;
	private Board board;
	
	public Game(Board board) {
		this.board = board;
		thePlayers = new ArrayList<Player>();
	}
	
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
		// target <- inter.handleMove(score) ( verif excess)
		// if cell ocupied : move the other player
		// move player to target
		
		// end if
		// player <- next player
		// end while
	}
}
