public class MoveScore implements Comparable<MoveScore> {
	private int[] _move;
	private int _score;
	public MoveScore(int[] coords, int score) {
		_move = coords;
		_score = score;
	}
	public int getScore() {
		return _score;
	}
	public int[] getMove() {
		return _move;
	}
	public int compareTo(MoveScore other) {
		if (other._score > this._score) return 1;
		else if (other._score < this._score) return -1;
		return 0;
	}
}