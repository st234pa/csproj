import java.util.Scanner;
public class Game {
	private Board _board;
	private Ai _ai;
	private int _passes = 0; //This counts the number of passes IN A ROW.
	public Game(Board b, Ai a) {
		_board = b;
		_ai = a;
	}
	public void run() {
		while (_passes < 2 && !(_board.isFull())) {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println(_board);
			_board.update(playerTurn(), "x");
			System.out.println(_board);
			_board.update(computerTurn(), "o");
		}
		results();
	} 
	public MoveCoord playerTurn() {
		System.out.println("PLAYER'S TURN");
		System.out.println("Enter the row and column where you want to place a tile (0-7). If you want to pass, enter -1, -1.");
		Scanner scan = new Scanner(System.in);
		System.out.print("Row: ");
		int r = scan.nextInt();
		System.out.print("Column: ");
		int c = scan.nextInt();
		MoveCoord p = new MoveCoord(r, c);
		if (r == -1) _passes++;
		else _passes = 0;
		return p;
	}
	public MoveCoord computerTurn() { //ai will give a turn in the form of coordinates
		return null;
	}
	public void results() {
		int playerScore = _board.count("x");
		int computerScore = _board.count("o");
		if (playerScore > computerScore)
			System.out.println("You win! :) ");
		else if (playerScore < computerScore)
			System.out.println("You lose. :( ");
		else
			System.out.println("Draw. :| ");
	}
}