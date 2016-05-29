import java.util.ArrayList;
import.java.util.PriorityQueue;
public class Ai {
	private Board _board;
	private static int[][] BOARDVALUE = {
		{100, -1, 5, 2, 2, 5, -1, 100},
		{-1, -10,1, 1, 1, 1,-10, -1},
		{5 , 1,  1, 1, 1, 1,  1,  5},
		{2 , 1,  1, 0, 0, 1,  1,  2},
		{2 , 1,  1, 0, 0, 1,  1,  2},
		{5 , 1,  1, 1, 1, 1,  1,  5},
		{-1,-10, 1, 1, 1, 1,-10, -1},
		{100, -1, 5, 2, 2, 5, -1, 100}
	};
	public Ai(Board b) {
		_board = b;
	}
	public int evaluateBoard() {

	}
	public ArrayList<MoveCoord> genPriorityMoves() {
		
	}
}