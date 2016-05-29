public class Board {
	private String[][] _board;
	private int _numTiles;
	public Board() {
		_board = new String[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++)
				_board[i][j] = "-";
		}
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
	public void update(int[] coords, String piece) {
		if (coords[0] == -1) return;
		_board[coords[0]][coords[1]] = piece;
		_numTiles++;
		//flips pieces where necessary
		flip(coords, piece);
	}
	public void flip(int[] coords, String piece) {
		flip(piece, coords[0], coords[1], -1, 0);
		flip(piece, coords[0], coords[1], -1, 1);
		flip(piece, coords[0], coords[1], 0, 1);
		flip(piece, coords[0], coords[1], 1, 1);
		flip(piece, coords[0], coords[1], 1, 0);
		flip(piece, coords[0], coords[1], 1, -1);
		flip(piece, coords[0], coords[1], 0, -1);
		flip(piece, coords[0], coords[1], -1, -1);
	}
	public void flip(String piece, int r, int c, int ud, int lr) {
		if(r+ud > 7 && r+ud < 0 && c+lr > 7 && c+lr < 0) return;
		if (piece.equals(_board[r+ud][c+lr])) return;
		_board[r+ud][c+lr] = piece;
		flip(piece, r+ud, c+lr, ud, lr);
	}
	public int count(String piece) {
		int ans = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (_board[i][j].equals(piece)) ans++;
			}
		}
		return ans;
	}
}