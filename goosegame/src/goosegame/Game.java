package goosegame;

import java.util.ArrayList;
import java.util.Iterator;

import board.Board;
import cells.Cell;

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
		boolean finished = false;
		Iterator<Player> it = this.thePlayers.iterator();
		Player p;
		while(!finished) {
			if (!it.hasNext()) {
				it = this.thePlayers.iterator();
				//Next turn
			}
			p = it.next();
			if(p.getCell().canBeLeft()) {
				int score = p.twoDiceThrow();
				Cell intermediary = board.getCell(score + p.getCell().getIndex());
				int land = intermediary.handleMove(score);


				// if the game is finished
				if (p.getCell().equals(board.getEndCell())) {
					finished = true;
					break;
				}
			}

			// ( verif excess)
			// move welcome player to target

			// end if
			// player <- next player
			// board.next turn
			// end while

		}
	}
}
