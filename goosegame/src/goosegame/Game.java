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
		p.setCell(board.getStartCell());
		thePlayers.add(p);
	}

	/**
	 * Do an entire game
	 */
	public void play() {
		boolean finished = false;
		
		System.out.print("The game is starting with :");
		for(Player p : this.thePlayers) System.out.println(p);
		
		Iterator<Player> it = this.thePlayers.iterator();
		
		int end_index = board.getEndCell().getIndex();
		
		Player p;
		while(!finished) {
			
			if (!it.hasNext()) {
				it = this.thePlayers.iterator();
				board.nextTurn();
				
				System.out.println("NEXT TURN !");
			}
			p = it.next();
			
			System.out.println("It's " + p +"'s turn (he is at "+ p.getCell() + " )");
			
			if(p.getCell().canBeLeft()) {
				
				int score = p.twoDiceThrow();
				int intermediary_index = score + p.getCell().getIndex();
				if(intermediary_index > end_index) intermediary_index = end_index - (intermediary_index - end_index);
				Cell intermediary = board.getCell(intermediary_index);
				
				int land = intermediary.handleMove(score);
				if(land > end_index) land = end_index - (land - end_index);
				board.getCell(land).welcomePlayer(p);

				// test if the game is finished
				if (p.getCell().equals(board.getEndCell())) {
					finished = true;
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
