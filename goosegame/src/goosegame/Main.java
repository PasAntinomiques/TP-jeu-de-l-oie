package goosegame;

import board.ClassicalBoard;

public class Main {

	public static void main(String[] args) {
		
		ClassicalBoard classic_board = new ClassicalBoard(63);
		Game game = new Game(classic_board);
		
		Player p1 = new Player("Bob");
		Player p2 = new Player("Billy");
		Player p3 = new Player("Franck");
		Player p4 = new Player("Johnny");
		
		game.addPlayer(p1);
		game.addPlayer(p2);
		game.addPlayer(p3);
		game.addPlayer(p4);
		
		game.play();

	}

}
