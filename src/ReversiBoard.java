//Grant Wilson
//28 May 2016

public class ReversiBoard implements Board{
//	initialise
	int[][] board;
	
	public ReversiBoard(int n){
		InitialiseBoard(n);
	}
	public int[][] InitialiseBoard(int n){
		board = new int[n][n];
		for (int i = 0; i<n; i++){
			for (int j = 0; j<n; j++){
				board[i][j]=0;
			}
		}
		return board;
	}
	public void PrintBoard(){
		for (int[] row: board){
			for (int cell: row){
				System.out.print(cell+" ");
			}
			System.out.println();
		}
	}
}