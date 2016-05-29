import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("OTHELLO -- by Stephanie Yoon");
		Board board = new Board();
		Ai ai = new Ai(board);
		Game game = new Game(board, ai);
		game.run();
	}
}