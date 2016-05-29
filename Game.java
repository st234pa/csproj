import java.util.Scanner;
public class Game {
	private Board _board;
	private Ai _ai;
	private int _passes = 0;
	public Game(Board b, Ai a) {
		_board = b;
		_ai = a;
	}
	public void run() {
		while (passes < 2 && !(_board.isFull())) {
			System.out.flush();
			System.out.println(_board);
			_board.update(playerTurn());
		}
	} 
	public int[] playerTurn() {
		System.out.println("PLAYER'S TURN");
		Scanner scan = new Scanner(System.in);
		System.out.println("Row: ");
		int r = scan.nextInt();
		System.out.println("Column: ");
		int c = scan.nextInt();
		int[] coords = {r, c};
		return coords;
	}
}