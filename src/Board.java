//Grant Wilson
//28 March 2016

public interface Board{
//	contains all functions for a reversi board
	public int[][] InitialiseBoard(int n);
//		will create a board with 4 pieces in the middle like a game of Reversi
//		the board will be size n*n where n must be an even number
	public void PrintBoard();
//	will out the board
}