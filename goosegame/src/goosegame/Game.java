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
		
	}
}
