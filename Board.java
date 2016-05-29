public class Board {
	private String[][] _board;
	private int _numTiles;
	public Board() {
		_board = new char[8][8];
		_board[3][4] = "x";
		_board[4][3] = "x";
		_board[4][4] = "o";
		_board[3][3] = "o";
		_numTiles = 4;
	}
	public int getNumTiles() {
		return _numTiles;
	}
	public boolean isFull() {
		return _numTiles == 64;
	}
	public String toString() {
		String ans = "";
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				ans += _board[i][j] + " ";
			}
			ans += "\n";
		}
		return ans;
	}
	public void update(int[] coords) {

	}
}