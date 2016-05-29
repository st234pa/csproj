public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("OTHELLO -- by Stephanie Yoon");
		Game game = new Game();
		Board board = new Board();
		Ai ai = new Ai();
		game.run();
	}
}